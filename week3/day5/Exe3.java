package exe3;

/**
 *
 * @author cb-skarthick
 */

 

import java.sql.*;
import java.io.*;
import java.util.*;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.simple.parser.JSONParser;  
import org.json.simple.parser.ParseException;
public class Exe3 {


	
	Exe3(){}
	public static void main(String[] args) throws Exception  {
            
            Exe3 obj=new Exe3();
            Connection con =null;
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = new JSONObject();
            Object object= parser.parse(new FileReader("/Users/cb-skarthick/Documents/karthick/week3/day5/input.json"));
            jsonObject = new JSONObject(object.toString());
            JSONArray arr = jsonObject.getJSONArray("user");
            PreparedStatement updateemp = null;
            PreparedStatement selectemp = null;
            String qry1="select  * from phone_directory where name=?";
            String qry2 ="select  * from phone_directory where homenumber=?";
            String qry3 = "select  * from phone_directory where name like ?";
            String qry4 ="select  * from phone_directory where mobilenumber=?";
            String qry5 ="select  * from phone_directory where worknumber=?";
            Scanner inp=new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            try{
            for(int j=0; j < arr.length();j++){
                int id = 0;
		JSONObject user = arr.getJSONObject(j);
		String person1Name=user.getString("name");;
		String person1Addr=user.getString("address");
		long person1homenumber=user.getLong("homenumber");
		long person1mobilenumber=user.getLong("mobilenumber");
		long person1worknumber=user.getLong("worknumber");
                con = DriverManager.getConnection("jdbc:mysql://localhost/db1","root","");
                updateemp = con.prepareStatement("insert into phone_directory values(?,?,?,?,?)");
                updateemp.setString(1,person1Name);
                updateemp.setString(2,person1Addr);
                updateemp.setLong(3,person1homenumber);
                updateemp.setLong(4,person1mobilenumber);
                updateemp.setLong(5,person1worknumber);
                updateemp.executeUpdate();
                updateemp.close();
      
 }
       int input;
       do{
            System.out.println("The options are :\n1.name search\n2.number search\n3.partial name search\n4.exit()");
            System.out.println("choose:");
            input =inp.nextInt();
      
      if(input == 1){
          System.out.println("enter the name you want to search:");
          String name=inp.next();
          selectemp = con.prepareStatement(qry1);
          selectemp.setString(1, name);
          ResultSet rs= selectemp.executeQuery();
          obj.print(rs);
        
      }
      else if(input == 2){
          System.out.println("enter the number you want to search:");
          long number=inp.nextLong();
          selectemp = con.prepareStatement(qry2);
          selectemp.setLong(1,number);
          ResultSet rs= selectemp.executeQuery();
          obj.print(rs);
         
          selectemp = con.prepareStatement(qry4);
          selectemp.setLong(1,number);
          rs= selectemp.executeQuery();
          obj.print(rs);
         
          selectemp = con.prepareStatement(qry5);
          selectemp.setLong(1,number);
          rs= selectemp.executeQuery();
          obj.print(rs);

}
      else if(input == 3 ){
          System.out.println("enter the partial name you want to search:");
          String  name=inp.next();
          name="%"+name+"%";
          selectemp = con.prepareStatement(qry3);
          selectemp.setString(1, name);
          ResultSet rs= selectemp.executeQuery();
          obj.print(rs);
      }
      else{
          System.exit(0);
        }
      }while(input<=4);
        con.close();
      
    }
        catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(updateemp!=null){
                updateemp.close();
            }
            if(con!=null){
                con.close();
            }
        }

	}
       
        void print(ResultSet rs ){
            
           try{
               int flag =0;
             while(rs.next()){
             //System.out.println("hello");
              System.out.println("Result:");
              System.out.println("Found.....");
              String user_name=rs.getString("name");
              String user_addr=rs.getString("address");
              long m_number=rs.getLong("mobilenumber");
              long h_number=rs.getLong("homenumber");
              long w_number=rs.getLong("worknumber");
              System.out.println("name:"+user_name+"\n"+"address:"+user_addr+"\n"+"home_number:"+h_number+"\n"+"mobile_number:"+m_number+"\n"+"work_number:"+w_number);
              flag=1;
             }
             if(flag ==0){
                 System.out.println("Not Found....");
             }
        }
       catch(SQLException se){
            se.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
    

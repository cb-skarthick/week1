 import java.io.*;
 import java.util.*;
 import java.mypack.*;
 class Author{
 	private String name;
 	private String email;
 	private char gender;

 	Author(String name,String email,char gender){
 		this.name=name;
 		setEmail(email);
 		this.gender=gender;

 	}

 	public String getName(){
 		return this.name;
 	}

 	public void setEmail(String email) {
 		this.email = email;
 	}

 	public String getEmail(){
 		return this.email;

 	}

 	public char getGender(){
 		return this.gender;
 	}

 	public  String toDisplay(){
 		//System.out.println(" "+name+" "+gender+" at "+email);
 		String string1=name+gender;
 		String string2=string1+"at";
 		String string3=string2+email;
 		System.out.println(string3);
 		return string3;
 		

 	} 

 

 	public void addAuthor(Author author){

 	}

 	 public static void main(String[] args) {
 		Author author=new Author("karthick","karthicksis165@gmail.com",'M');
 		String output=new String();

 		output=author.toDisplay();
 		author.setEmail("skarthick@chargebee.com");
 		output=author.toDisplay();
 	}


 }

 
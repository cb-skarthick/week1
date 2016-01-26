import java.io.*;
import java.util.*;
class Exe4{

	public static void main(String[] args) throws IOException {
		Exe4 obj=new Exe4();
		Scanner get = new Scanner(System.in);
		BufferedReader inp=new BufferedReader(new InputStreamReader(new FileInputStream("searchinput.txt")));
		BufferedWriter oup=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("searchoutput.txt")));
		String line=null;
		String word=get.next();
		int wordlength=word.length();
		int[] linenumbers=new int[100];
		int linenumber=0;
		String[] index=new String[10];
		int indexofindex=0;
		int endpoint=0;
		String string="";
		while( (line=inp.readLine() ) != null ){
			linenumber++;
			index[linenumber]="";
				for (int i=0;i<line.length() ;i++ ) {
					if(line.regionMatches(i,word,0,wordlength)){
						index[linenumber]=index[linenumber]+" "+i;
						System.out.println("checking");
						//linenumberindex++;
						linenumbers[linenumber]=1;
						indexofindex++;
						//endpoint=i+wordlength-1;
						
					}
					
				}

			//oup.write("["+key+"]:["+list.get(key)+"]");

			//String line=inp.readLine();
			//String[] words=line.split(" ");
			//int index=line.lastIndexOf(word);
			//System.out.println(index);
			
		}
		string=obj.getindex(linenumbers,index);
			System.out.println(string);
			oup.write(string);
			inp.close();
			oup.close();

	}

	String getindex(int[] linenumbers,String[] index){
		String name="";
		for(int i=0;i<linenumbers.length;i++){
			if(linenumbers[i]==1){
				name=name+"linenumber"+i+" indexes are"+index[i]+" ";

			}
		}
		return name;
	}

}

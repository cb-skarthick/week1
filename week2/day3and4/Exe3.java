import java.io.*;
import java.util.*;
class Exe3{
	/*Scanner s=null;
	File file=new File("/Users/apple/Desktop/karthick/week2/day3and4/sample.txt");
		//s=new Scanner(new BufferedReader(new FileReader(file)));
		s=new Scanner("/Users/apple/Desktop/karthick/week2/day3and4/sample.txt");*/

		//BufferedReader inp=new BufferedReader(new InputStreamReader(new FileInputStream("sample.txt")));
	public static void main(String[] args) throws IOException {
		BufferedReader inp=new BufferedReader(new InputStreamReader(new FileInputStream("countinput.txt")));
		
		Exe3 obj=new Exe3();
		//obj.readfile();
			int i=1;
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		String line=null;
		while( (line=inp.readLine() ) != null ){

			//String line=inp.readLine();
			String[] words=line.split(" ");
			for(String word:words){
			
				if(hash.containsKey(word)){
					hash.put(word,increment(hash,word));
				}
				else{
					hash.put(word,i);
				}


			}
		}

		System.out.println(hash);

		TreeMap<String,Integer>  list=new TreeMap<String,Integer>(hash);

		System.out.println("After sorting:");
		System.out.println(list);

		BufferedWriter oup=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("countoutput.txt")));
		//FileWriter oup=new FileWriter("sample1.txt");
		/*ObjectOutputStream oup = new ObjectOutputStream(new FileOutputStream("sample1.txt"));

		//for(Exe3 obj:list){


			oup.writeObject(list);
			oup.close();*/

			Set keys=list.keySet();
			Iterator it=keys.iterator();
			while(it.hasNext()){
				String key=(String)it.next();
				oup.write("["+key+"]:["+list.get(key)+"]");
			}


		oup.close();

	}

	/*void readfile(){
		int i=1;
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		while(inp.readLine()!=null){

			String line=inp.readLine();
			String[] words=line.split(" ");
			for(String word:words){
			
				if(hash.containsKey(word)){
					hash.put(word,increment(hash,word));
				}
				else{
					hash.put(word,i);
				}


			}
		}

		System.out.println(hash);

		//s.close();
	}*/

	static int increment(HashMap<String,Integer> hash,String next){
		int i=hash.get(next);
		i++;
		return i;
	}
	//inp.close();
}
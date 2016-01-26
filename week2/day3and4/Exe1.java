import java.io.File;
import java.io.IOException;
import java.util.*;
class Exe1{

	static int png=0;
		static int doc=0;


	public static void main(String[] args) {
		Exe1 obj1=new Exe1();
		obj1.listf("/Users/apple/Desktop/karthick/week2/folder1");


	}

	HashMap<String,Integer> extension = new HashMap<String,Integer> ();

	public void listf(String directoryName) {
		File directory = new File(directoryName);
		
		
// get all the files from a directory
		File[] fList = directory.listFiles();

		for (File file : fList) {

			int i=0;
			int initial=0;
			String ext=getextension(file);

    		if (file.isFile()) {
    			//System.out.println("you found the file");
      			/* if (file.getName().endsWith(".png")) {
           				System.out.println(file.getAbsolutePath());
           				png++;

       			}

       			if(file.getName().endsWith(".doc")){

       				System.out.println(file.getAbsolutePath());
       				doc++;
       			}*/

       			if(extension.containsKey(ext)){
       				
       				extension.put(ext,increment(ext));
       				

       			}
       			else{
       				extension.put(ext,1);
       			}
    		}else if (file.isDirectory()) {
        		listf(file.getAbsolutePath());
    		}
		}


		/*System.out.println("number of PNG files are:"+png);
		System.out.println("number of DOC files are:"+doc);*/

		System.out.println(extension);
	}

	String getextension(File file){
		String name="";
		int j = file.getName().lastIndexOf('.');
		if (j >= 0) {
   		 	name = file.getName().substring(j+1);
   		 	System.out.println(name);
		}

		return name;
	}

	int increment(String ext){
		int i=extension.get(ext);
		i++;
		return i;
	}
       

}
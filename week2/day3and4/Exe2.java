import java.io.File;
import java.io.IOException;

class Exe2{

	static int png=0;
		static int doc=0;
		//static int i=1;


	public static void main(String[] args) {
		Exe2 obj1=new Exe2();
		obj1.listf("/Users/apple/Desktop/karthick/source");


	}



	public void listf(String directoryName) {
		File directory = new File(directoryName);

		
// get all the files from a directory
		File[] fList = directory.listFiles();

		for (File file : fList) {
    		if (file.isFile()) {
    			//System.out.println("you found the file");
      			 
      			 move(file);
    		}else if (file.isDirectory()) {
        		listf(file.getAbsolutePath());
    		}
		}


	}


	void move(File file){

		String locaion="/Users/apple/Desktop/karthick/destination/";
		int found=0;

		File dest=new File(locaion);
		File[] files=dest.listFiles();
		for (File file1 : files) {
    		if (file1.isFile()) {
    			//System.out.println("yi ");
    			if(file1.getName().equals(file.getName())){
    				file.renameTo(new File(locaion+getnumber(file,files)));
    			
    				found=1;
    				break;
    			}
    			else{
    				continue;
    			}
    		}
    		else{
    			file.renameTo(new File(locaion));

    		}

    		/*if(file1.list().length == 0){
    			System.out.println("hj");
    			file.renameTo(new File(locaion));

    		}*/
    	}

    	if(found==0){

    		file.renameTo(new File(locaion+file.getName()));
    	}


	}

	String getfilename(File file){
		String name="";
		int j = file.getName().lastIndexOf('.');
		if (j >= 0) {
   		 name = file.getName().substring(0,j);
   		 System.out.println(name);
		}
		return name;

	}


	String getextension(File file){
		String name="";
		int j = file.getName().lastIndexOf('.');
		if (j >= 0) {
   		 	name = file.getName().substring(j);
   		 	System.out.println(name);
		}

		return name;
	}

	String getnumber(File file,File[] files){

		String name=getfilename(file);
		int i=1;
		int found=1;
		String name1="";
		String ext=getextension(file);

		
		do{
			for(File obj2:files){

				name1=getfilename(obj2);
				System.out.println(file.getName()+"1");
				System.out.println(name1+"1");

				if(name1.equals(name+"_"+i)){
				i++;
				found=1;
				break;
				}
				else{
					found=0;
				}

			}
		}while(found==1);
		

		return name+"_"+i+ext;

	}
       

}

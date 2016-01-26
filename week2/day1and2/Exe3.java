import java.io.*;
import java.util.*;
class Exe3{
	String name;
	String addr;
	long[] homenumber;
	long[] mobilenumber;
	long [] worknumber;

	Exe3(){}

	Exe3(String name,String addr,long[] homenumber,long[] mobilenumber,long[] worknumber){
		this.name=name;
		this.addr=addr;
		this.homenumber=homenumber;
		this.mobilenumber=mobilenumber;
		this.worknumber=worknumber;
	}

	public String toString(){
		return name+" "+addr+" Homenumber: "+getnumber(homenumber)+" Mobilenumber: "+getnumber(mobilenumber)+" Worknumber: "+getnumber(worknumber);
	}

	public String getnumber(long[] number){
		int i;
		String name="";
		for(i=0;i<number.length;i++){
			name=" "+name+" "+number[i];

		}
		return name;
	}



	//Arraylist<Exe3> list=new Arraylist<Exe3>();
	public static void main(String[] args) {
		ArrayList<Exe3> list=new ArrayList<Exe3>();

		int nameFound=0;
		int numberFound=0;
		int partialnameFound=0;
		String person1Name="karthick";
		String person1Addr="coimbatore";
		long[] person1homenumber={3243894,4563782};
		long[] person1mobilenumber={9812383,9948923};
		long[] person1worknumber={8762229};

		String person2Name="karthick";
		String person2Addr="coimbatore";
		long[] person2homenumber={3257633,4561122};
		long[] person2mobilenumber={9456847,9923478};
		long[] person2worknumber={87633339};

		String person3Name="sakthi";
		String person3Addr="coimbatore";
		long[] person3homenumber={321433,4563322};
		long[] person3mobilenumber={9898473,99465783};
		long[] person3worknumber={876449};

		Exe3 obj1=new Exe3(person1Name,person1Addr,person1homenumber,person1mobilenumber,person1worknumber);
		Exe3 obj2=new Exe3(person2Name,person2Addr,person2homenumber,person2mobilenumber,person2worknumber);
		Exe3 obj3=new Exe3(person3Name,person3Addr,person3homenumber,person3mobilenumber,person3worknumber);

		list.add(obj1);
		list.add(obj2);
		list.add(obj3);

		System.out.println(list);


		System.out.println("enter the name to search the person:");
		Scanner inp=new Scanner(System.in);
		String name=inp.next();
		for(Exe3 temp:list){
			//Exe3 temp=list.get(i);
			if(temp.name.equals(name)){
				nameFound=1;
				System.out.println("the details matched to the given name is:");
				System.out.println(temp);
			}
		}

		if(nameFound==0){
			System.out.println("name doesn't exist");
		}

		System.out.println("enter the phone number to search :");
		long phonenumber=inp.nextLong();
		for(Exe3 temp:list){
			for(long number:temp.homenumber){
				if(number==phonenumber){
					numberFound=1;
					System.out.println("the details matched to the given phone number is:");
					System.out.println(temp);
					break;
				}
			}

			for(long number:temp.mobilenumber){
				if(number==phonenumber){
					numberFound=1;
					System.out.println("the details matched to the given phone number is:");
					System.out.println(temp);
					break;
				}
			}

			for(long number:temp.worknumber){
				if(number==phonenumber){
					numberFound=1;
					System.out.println("the details matched to the given phone number is:");
					System.out.println(temp);
					break;
				}

			}
		}

		if(numberFound==0){
			System.out.println("number doesn't exist");
		}


		System.out.println("enter the partial name to search:");
		String partialname=inp.next();

		for(Exe3 temp:list){
			//Exe3 temp=list.get(i);
			if(temp.name.matches("(.*)"+partialname+"(.*)")){
				partialnameFound =1;
				System.out.println("matched name is:"+temp.name);
				System.out.println("the details matched to the given name is:");
				System.out.println(temp);
			}
		}


		if(partialnameFound==0){
			System.out.println("partial name doesn't exist");
		}



		
	}
}
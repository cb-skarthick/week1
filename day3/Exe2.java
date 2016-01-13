 import java.io.*;
 import java.util.*;
 import java.lang.*;
 class Animal
 {
  	static int noOfAnimal=0;
  	public String name=new String();

 	void display() {
 		System.out.println("no of animals are:"+noOfAnimal);
 	}

 }

 public class Exe2
 {
 public static void main(String args[])
 {
 int i=1,count=0;
 String name1=new String();
 Scanner inp=new Scanner(System.in);
 Animal[] obj=new Animal[100];
	while(i==1){	
		System.out.println("enter the animal name:");
		Animal newObj = new Animal();
		newObj.name=inp.next();
		//obj[count] = newObj;
		obj[count]=new Animal();
		//obj[count].name=inp.next();
		//System.out.println(obj[count].name);
		newObj.noOfAnimal++;
		obj[count]=newObj;
		System.out.println("press 1 to continue:");
		i=inp.nextInt();
		count++;
		System.out.println("count value:"+count);
		}
	obj[0].display();
	while(count>0) {
		count--;
		System.out.println("animal name is:"+obj[count].name);
	}
	
 }
 }
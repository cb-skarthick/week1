import java.io.*;
import java.util.*;
class Student{
	
	String studentName=new String();
	int id;
	String gender=new String();
	Subject sub=new Subject();
	Scanner inp=new Scanner(System.in);

		void get(){
			System.out.println("Enter the Student Name:");
			studentName=inp.next();
			System.out.println("Enter the Student ID:");
			id=inp.nextInt();
			System.out.println("Enter the Student Gender:");
			gender=inp.next();
			sub.get();
		}
    
  /*  int getStudentId(){
        return int;
    }

    int getStudentId(){
        return int;
    }*/

		
}

class Result{
	static void generateResult(Student sobj){

		System.out.println("name:"+sobj.studentName);
		System.out.println("ID:"+sobj.id);
		System.out.println("gender:"+sobj.gender);
		System.out.println("subject1:"+sobj.sub.subject1);
		System.out.println("subject2:"+sobj.sub.subject2);
		System.out.println("mark1:"+sobj.sub.mark1);
		System.out.println("mark2:"+sobj.sub.mark2);
		System.out.println("Total:"+(sobj.sub.mark1+sobj.sub.mark2));
		System.out.println("Average:"+(sobj.sub.mark1+sobj.sub.mark2)/2);
	}
}

class Subject{
	String subject1=new String();
	String subject2=new String();
	float mark1;
	float mark2;
    
    Scanner inp=new Scanner(System.in);

		void get(){
			System.out.println("Enter the Subject1:");
			subject1=inp.next();
			System.out.println("Enter the mark1:");
			mark1=inp.nextFloat();
			System.out.println("Enter the Subject2:");
			subject2=inp.next();
			System.out.println("Enter the mark2:");
			mark2=inp.nextFloat();


		}

	
}

class StudentDemo{

			String S_name;
			String S_gender;
			int S_id;
			float S_total;
			float S_avg;

		void storeStudentData(Student obj2){
			S_name=obj2.studentName;
			S_gender=obj2.gender;
			S_id=obj2.id;
			S_total=obj2.sub.mark1+obj2.sub.mark2;
			S_avg=(obj2.sub.mark1+obj2.sub.mark2)/2;


		}
	}

class Exe3{

		public static void main(String args[]){

		Student studentObj=new Student();
		StudentDemo finalobj=new StudentDemo();
		Subject subobj=new Subject();
		//subobj.get();
		//Student s1=new Student();
		studentObj.get();
		finalobj.storeStudentData(studentObj);
		Result rObj=new Result();
		rObj.generateResult(studentObj);




		}
	
}
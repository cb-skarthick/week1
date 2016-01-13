import java.io.*;
import java.util.*;
class Student{
	
	String studentName=new String();
	int id;
	String gender=new String();
	Subject sub=new Subject();
	Scanner inp=new Scanner(System.in);

		/*void get(){
			System.out.println("Enter the Student Name:");
			studentName=inp.next();
			System.out.println("Enter the Student ID:");
			id=inp.nextInt();
			System.out.println("Enter the Student Gender:");
			gender=inp.next();
			sub.get();
		} */
    
    int getStudentId(){
        return id;
    }

    String getStudentName(){
        return studentName;
    }

    String getGender(){
    	return gender;
    }

    Subject getSubject(){
    	return sub;
    }

    void setStudentId(int id){
    	this.id=id;
    }

    void setStudentName(String studentName){
    	this.studentName=studentName;
    }

    void setGender(String gender){
    	this.gender=gender;
    }

    void setSubject(Subject sub){
    	this.sub=sub;
    }


		
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
	String subject3=new String();
	float mark1;
	float mark2;
	float mark3;

    
   // Scanner inp=new Scanner(System.in);

		/*void get(){
			System.out.println("Enter the Subject1:");
			subject1=inp.next();
			System.out.println("Enter the mark1:");
			mark1=inp.nextFloat();
			System.out.println("Enter the Subject2:");
			subject2=inp.next();
			System.out.println("Enter the mark2:");
			mark2=inp.nextFloat();


		}*/

		String getSubject1(){
			return subject1;
		}

		String getSubject2(){
			return subject2;
		}	

		String getSubject3(){
			return subject3;
		}	

		void setSubject1(String subject1){
			this.subject1=subject1;

		}

		void setSubject2(String subject2){
			this.subject2=subject2;
			
		}

		void setSubject3(String subject3){
			this.subject3=subject3;
			
		}

		float getMark1(){
			return mark1;
		}

		float getMark2(){
			return mark2;
		}

		float getMark3(){
			return mark3;
		}


		void setMark1(float mark1){
			this.mark1=mark1;
		}

		void setMark2(float mark2){
			this.mark2=mark2;
		}

		void setMark3(float mark3){
			this.mark3=mark3;
		}
}

class StudentDemo{

			String S_name;
			String S_gender;
			int S_id;
			float S_total;
			float S_avg;

		void storeStudentData(Student obj2){
			System.out.println("Enter the following details:");
			Scanner inp=new Scanner(System.in);
			System.out.println("Name:");
			String name=inp.next();
			obj2.setStudentName(name);
			System.out.println("Gender:");
			String gender=inp.next();
			obj2.setGender(gender);
			System.out.println("ID:");
			int id=inp.nextInt();
			obj2.setStudentId(id);
			System.out.println("Subject1:");
			String subject1=inp.next();
			obj2.sub.setSubject1(subject1);
			System.out.println("Subject2:");
			String subject2=inp.next();
			obj2.sub.setSubject2(subject2);
			System.out.println("subject3:");
			String subject3=inp.next();
			obj2.sub.setSubject3(subject3);
			System.out.println("mark1:");
			float mark1=inp.nextFloat();
			obj2.sub.setMark1(mark1);
			System.out.println("mark2:");
			float mark2=inp.nextFloat();
			obj2.sub.setMark2(mark2);
			System.out.println("mark3:");
			float mark3=inp.nextFloat();
			obj2.sub.setMark3(mark3);
			

		}

		public static void main(String args[]){

		Student studentObj=new Student();
		StudentDemo finalobj=new StudentDemo();
		Subject subobj=new Subject();
		//subobj.get();
		//Student s1=new Student();
		//studentObj.get();
		finalobj.storeStudentData(studentObj);
		Result rObj=new Result();
		rObj.generateResult(studentObj);




		}
	
}
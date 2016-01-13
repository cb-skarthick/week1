import java.io.*;
import java.util.*;

class Employee{
	String name;
	float salary;
	int age;

	Employee(){

	}
	Employee(String name,int age,float salary){
		setName(name);
		setAge(age);
		setSalary(salary);
	}

	void setName(String name){
		this.name=name;
	}
	void setAge(int age){
		this.age=age;
	}
	void setSalary(float salary){
		this.salary=salary;
	}

	void display(){
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
		System.out.println("age is:"+age);
	}
}

interface comparision{
	public void comp();
}
class Exe2{
	static Employee obj1=new Employee();
	public static void main(String[] args) {
		Employee[] employee=new Employee[4];
		employee[0]=new Employee("karthick",20,40000);
		employee[1]=new Employee("vikram",24,40000);
		employee[2]=new Employee("raj",22,30000);
		employee[3]=new Employee("kumar",20,20000);
		
		int i=0;
		while( i<employee.length){
			employee[i].display();
			i++;
		}

		comparision comp1=new comparision(){
			public void comp(){
				int i,j;
				for(i=0;i<employee.length-1;i++){
					for(j=i+1;j<employee.length;j++){

						if(employee[i].age<employee[j].age){
							obj1=employee[i];
							employee[i]=employee[j];
							employee[j]=obj1;
						}
					}
				}
			}
		};


		comp1.comp();
		i=0;
		while(i<employee.length){
			employee[i].display();
			i++;
		}

		
	}
}
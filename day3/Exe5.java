import java.io.*;
import java.util.*;
class Employee{

	private String name;
	private String gender;
	private double salary;
	private int age;
	 double taxAmount;
	double totalIncome;

	String getName(){
		return this.name;

	}

	String getGender(){
		return this.gender;

	}
	double getSalary(){
		return this.salary;

	}
	int getAge(){
		return this.age;
	}

	//double getTaxAmount(){
	///	return this.taxAmount;

	//}

	//double getTotalIncome(){
	//	return this.totalIncome;

	//}
	void setName(String name){
		this.name=name;

	}

	void setGender(String gender){
		this.gender=gender;
		
	}

	void setSalary(double salary){
		this.salary=salary;
		
	}

	void setAge(int age){
		this.age=age;
		
	}



	
}

class Tax{
	//static float taxForFemale=0.02;
	//static float taxForMale=0.05;
	//double taxAmount;
	//double totalIncome;

	Employee[] employee;

	void set(Employee[] employee){
		this.employee=employee;

	}
	 void taxCalculation(int n){
	 	for(int i=0;i<n;i++){
	 		if(employee[i].getGender().equals("male"))
	 		{
	 			System.out.println("hai");
	 			if(employee[i].getSalary()<=25000){
	 				employee[i].taxAmount=0;
	 				employee[i].totalIncome=employee[i].getSalary()-employee[i].taxAmount;

	 			}
	 			else if(employee[i].getSalary()>25000&&employee[i].getSalary()<=50000){
	 				employee[i].taxAmount=employee[i].getSalary()*0.05;
	 				employee[i].totalIncome=employee[i].getSalary()-employee[i].taxAmount;
	 			}
	 			else if(employee[i].getSalary()>50000){
	 				employee[i].taxAmount=employee[i].getSalary()*0.10;
	 				employee[i].totalIncome=employee[i].getSalary()-employee[i].taxAmount;
	 			}
	 		}	
	 		else if(employee[i].getGender().equals("female")){
	 			if(employee[i].getSalary()<=25000){
	 				employee[i].taxAmount=0;
	 				employee[i].totalIncome=employee[i].getSalary()-employee[i].taxAmount;

	 			}
	 			else if(employee[i].getSalary()>25000&&employee[0].getSalary()<=50000){
	 				employee[i].taxAmount=employee[i].getSalary()*0.02;
	 				employee[i].totalIncome=employee[i].getSalary()-employee[i].taxAmount;
	 			}
	 			else if(employee[i].getSalary()>50000){
	 				employee[i].taxAmount=employee[i].getSalary()*0.05;
	 				employee[i].totalIncome=employee[i].getSalary()-employee[i].taxAmount;
	 			}

	 		}
	 	}
	 }

	  void display(int m)
	 {
	 	for(int i=0;i<m;i++)
	 	{
	 	System.out.println("employee name:"+employee[i].getName());
	 	System.out.println("employee salary:"+employee[i].getSalary());
	 	System.out.println("employee age:"+employee[i].getAge());
	 	System.out.println("employee gender:"+employee[i].getGender());
	 	System.out.println("employee taxAmount:"+employee[i].taxAmount);
	 	System.out.println("employee totalIncome:"+employee[i].totalIncome);
	 	}
	 }

}

class Exe5{
	public static void main(String[] args){

		Employee[] employee=new Employee[10];
		Scanner inp=new Scanner(System.in);
		Tax tax=new Tax();
		System.out.println("Enter the no_of_employees:");
		int n=inp.nextInt();

		for(int i=0;i<n;i++){
			employee[i]=new Employee();
			

		}

		for(int i=0;i<n;i++){
			System.out.println("Enter the name:");
			String name=inp.next();	
			System.out.println("Enter the gender:");
			String gender=inp.next();
			System.out.println("Enter the salary:");
			double salary=inp.nextDouble();
			System.out.println("Enter the age:");
			int age=inp.nextInt();
			employee[i].setName(name);
			employee[i].setGender(gender);
			employee[i].setSalary(salary);
			employee[i].setAge(age);

		}
		tax.set(employee);
		tax.taxCalculation(n);
		tax.display(n);

	}
}
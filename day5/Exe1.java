import java.io.*;
import java.util.*;
abstract class mobile {
	String name;
	int remainingCharge;

	mobile(String name,int remainingCharge){
		this.name=name;
		this.remainingCharge=remainingCharge;
	}

	abstract void remainingCharge();
	abstract void name();
}

class Exe1{
	public static void main(String[] args) {

		int i=1;
		int random;
		random = i + (int)(Math.random()*i);
		i++;
		mobile mobile1=new mobile("nokia",random){
		 void name(){
			System.out.println("moblile name is:"+name);
			
		}

		void remainingCharge(){
			System.out.println("remainingCharge is:"+remainingCharge);
		}
		};
		mobile1.name();
		mobile1.remainingCharge();

		random = i + (int)(Math.random()*i);
		i++;

		mobile mobile2=new mobile("moto",random){
		void name(){
			System.out.println("moblile name is:"+name);
			
		}

		void remainingCharge(){
			System.out.println("remainingCharge is:"+remainingCharge);
		}
		};



		mobile2.name();
		mobile2.remainingCharge();

		random = i + (int)(Math.random()*i);
		i++;

		mobile mobile3=new mobile("samsung",random){
		void name(){
			System.out.println("moblile name is:"+name);
			
		}

		void remainingCharge(){
			System.out.println("remainingCharge is:"+remainingCharge);
		}
		};

		mobile3.name();
		mobile3.remainingCharge();

		random = i + (int)(Math.random()*i);
		i++;

		mobile mobile4=new mobile("LG",random){
		void name(){
			System.out.println("moblile name is:"+name);
			
		}

		void remainingCharge(){
			System.out.println("remainingCharge is:"+remainingCharge);
		}
		};

		mobile4.name();
		mobile4.remainingCharge();
	}
}
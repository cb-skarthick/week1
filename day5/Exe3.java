import java.io.*;
import java.util.*;
class Factorial implements iterable{
	int lowerLimit;
	int upperLimit;
	int lowerLimit1;

	Factorial(int lowerLimit,int upperLimit){
		this.lowerLimit=lowerLimit;
		this.upperLimit=upperLimit;
		this.lowerLimit1=lowerLimit1;
	}
	Factorial iterator(){
		iterator obj=new iterator(){
	 		boolean hasNext(){
	 			return (lowerLimit1 < upperLimit);
	 		}

	 		int next(){
	 			return lowerLimit++;
	 		}
	 		void remove(){

	 		}
	 	};

	 	return lowerLimit=lowerLimit*obj.next();
	 }

	 String toString(){
	 	return (""+lowerLimit+""+upperLimit);
	 }

	 public static void main(String[] args) {
	 	Factorial factorial =new Factorial(2,4);
	 	factorial.iterator();
	 	factorial.toString();
	 }
}
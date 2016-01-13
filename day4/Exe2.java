import java.io.*;
import java.util.*;
class Car{
	int speed;
	double regularPrice;
	String color;
	

	Car(int speed,double regularPrice,String color){
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	
		
	}

	double getSalePrice(){
		return regularPrice;
	}

	void display(){
		System.out.println("speed:"+speed);
		System.out.println("regularPrice:"+getSalePrice());
		System.out.println("color:"+color);
	}


}

class Truck extends Car{
	int weight;

	Truck(int speed,double regularPrice,String color,int weight){
		super(speed,regularPrice,color);
	}

	double getSalePrice(){
		if(weight>2000){
			return super.getSalePrice()*0.1;
		}
		else{
			return super.getSalePrice()*0.2;
		}

	}

	void display(){
		super.display();
		System.out.println("weight:"+weight);
		System.out.println("salesPrice:"+getSalePrice());
	}


}


class Ford extends Car{
	int year;
	int manufacturerDiscount;

	Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount){
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}


	double getSalePrice(){
		return super.getSalePrice() - manufacturerDiscount;
	}

	void display(){
		super.display();
		System.out.println("year:"+year);
		System.out.println("manufacturerDiscount:"+manufacturerDiscount);
		System.out.println("salesPrice:"+getSalePrice());
	}


}

class Sedan extends Car{
	int length;


	Sedan(int speed,double regularPrice,String color,int length){
		super(speed,regularPrice,color);
		this.length=length;
	}

	double getSalePrice(){
		if(length>200){
			return super.getSalePrice()*0.05;
		}
		else{
			return super.getSalePrice()*0.1;
		}

	}

	void display(){
		super.display();
		System.out.println("length:"+length);
		System.out.println("salesPrice:"+getSalePrice());
	}
}


class Exe2{
	public static void main(String[] args) {
		Sedan sedan=new Sedan(60,500,"red",5);
		sedan.display();
		Ford ford1=new Ford(70,550,"green",5,2);
		Ford ford2=new Ford(76,850,"blue",5,3);
		ford1.display();
		ford2.display();
		Car car=new Car(80,800,"white");
		car.display();
	}
}
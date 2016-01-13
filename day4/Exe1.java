import java.io.*;
import java.util.*;

class jungle{

}
abstract class Animal extends jungle{

	String ownerName;
	int width;
	int height;
	int noOfChildren;
	String food;
 
	Animal(String ownerName,int width,int height,int noOfChildren,String food){
		this.ownerName=ownerName;
		this.width=width;
		this.height=height;
		this.noOfChildren=noOfChildren;
		this.food=food;
	}

	abstract void movement();


	
}

interface Trait{
	public void traits();
}

interface fly{
	public void fly();
	public void herbivores();
}

abstract class Mammal extends jungle{
	String name;
	int width;
	int height;
	int noOfChildren;
	String food;
	

 
	Mammal(String name,int width,int height,int noOfChildren,String food){
		this.width=width;
		this.height=height;
		this.noOfChildren=noOfChildren;
		this.food=food;
		this.name=name;
	}

	abstract void movement();
}
abstract class Bird extends jungle{
	int width;
	int height;
	int noOfChildren;
	String food;
	String name;
 
	Bird(String name,int width,int height,int noOfChildren,String food){
		this.name=name;
		this.width=width;
		this.height=height;
		this.noOfChildren=noOfChildren;
		this.food=food;
	}



	abstract void movement();


	

}



class Dog extends Animal implements Trait{
	Boolean fly;

	Dog(String ownerName,int width,int height,int noOfChildren,String food){
		
		super(ownerName,width,height,noOfChildren,food);
		/*super.ownerName=ownerName;
		super.width=width;
		super.height=height;
		super.noOfChildren=noOfChildren;
		super.food=food;*/
	}

	void display(){

		System.out.println("ownerName:"+ownerName);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("food:"+food);
		System.out.println("able to fly:"+fly);
	}
	public void traits(){

		System.out.println("traits are:");
		System.out.println("this is grown up as a pet");
		System.out.println("it is used to safe the home");
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("it is playing with kids");
	}
	

	void movement(){
		System.out.println("tt moves by walk");
	}

}

class Cow extends Animal implements Trait{
	Boolean fly;
	
	Cow(String ownerName,int width,int height,int noOfChildren,String food){
		super(ownerName,width,height,noOfChildren,food);
		/*super.ownerName=ownerName;
		super.width=width;
		super.height=height;
		super.noOfChildren=noOfChildren;
		super.food=food;*/
	}

	void display(){

		System.out.println("ownerName:"+ownerName);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("food:"+food);
		System.out.println("able to fly:"+fly);
	}
	public void traits(){

		System.out.println("traits are:");
		System.out.println("this is grown up as a pet as well as for auspicious");
		System.out.println("it provide milk");
		System.out.println("By growing up Cow we may gain money by selling milk");
	}
	void movement(){
		System.out.println("tt moves by walk");
	}

}

class Bat extends Mammal implements Trait{
	Boolean fly;
	Bat(String name,int width,int height,int noOfChildren,String food){
		
		super(name,width,height,noOfChildren,food);
		/*super.ownerName=ownerName;
		super.width=width;
		super.height=height;
		super.noOfChildren=noOfChildren;
		super.food=food;*/
	}

	void display(){

		//System.out.println("ownerName:"+ownerName);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("food:"+food);
		System.out.println("able to fly:"+fly);
	}
	public void traits(){

		System.out.println("traits are:");
		System.out.println("this is grown up as a pet");
		System.out.println("it is used to safe the home");
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("it is playing with kids");
	}
	void movement(){
		System.out.println("tt moves by fly");
	}
	

}

class Ostrich extends Bird implements Trait{
	  Boolean fly; 
	  Ostrich(String name,int width,int height,int noOfChildren,String food){
		
		super(name,width,height,noOfChildren,food);
		/*super.ownerName=ownerName;
		super.width=width;
		super.height=height;
		super.noOfChildren=noOfChildren;
		super.food=food;*/
	}

	void display(){

		//System.out.println("ownerName:"+ownerName);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("food:"+food);
		System.out.println("able to fly:"+fly);
	}
	public void traits(){

		System.out.println("traits are:");
		System.out.println("this is grown up as a pet");
		System.out.println("it is used to safe the home");
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("it is playing with kids");
	}
	
	void movement(){
		System.out.println("tt moves by fly");
	}

}

class Parrot extends Bird implements Trait{
	Boolean fly;
	Parrot(String name,int width,int height,int noOfChildren,String food){
		
		super(name,width,height,noOfChildren,food);
		/*super.ownerName=ownerName;
		super.width=width;
		super.height=height;
		super.noOfChildren=noOfChildren;
		super.food=food;*/
	}

	void display(){

		//System.out.println("ownerName:"+ownerName);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("food:"+food);
		System.out.println("able to fly:"+fly);
	}
	public void traits(){

		System.out.println("traits are:");
		System.out.println("this is grown up as a pet");
		System.out.println("it is used to safe the home");
		System.out.println("noOfChildren:"+noOfChildren);
		System.out.println("it is playing with kids");
	}
	
	void movement(){
		System.out.println("tt moves by fly");
	}

}

class Exe1 implements fly{

		static Bird bird[]=new Bird[4];
		static Mammal mammal[]=new Mammal[4];
		static Animal animal[]=new Animal[4];
		//static Object object[]=new Object[5];

		///////static jungle ju[]=new jungle[3];
	public static void main(String[] args) {
		Dog dog=new Dog("fred",50,20,4,"pedigree");
		Cow cow=new Cow("breg",80,30,2,"grass");
		Parrot parrot=new Parrot("parrot",20,30,3,"grass");
		Ostrich ostrich=new Ostrich("ostrich",40,60,2,"NV");
		Bat bat=new Bat("bat",20,30,2,"grass");
		Exe1 obj=new Exe1();
		animal[0]=dog;
		animal[1]=cow;
		
		bird[0]=parrot;
		bird[1]=ostrich;
		mammal[0]=bat;

		
		dog.display();
		dog.traits();
		dog.movement();
		cow.display();
		cow.traits();
		cow.movement();
		parrot.display();
		parrot.traits();
		parrot.movement();
		ostrich.display();
		ostrich.traits();
		ostrich.movement();
		bat.display();
		bat.traits();
		bat.movement();
		obj.fly();
		obj.herbivores();

	}

	public void fly(){
		int i=0;
		System.out.println("flyable animals are:");
		//for(i=0;i<bird.length;i++)
		while(!(bird[i]==null)){
			System.out.println(bird[i].name);
			i++;
		}
		i=0;
		//for(i=0;i<mammal.length;i++)
		while(mammal[i]!=null){
			System.out.println(mammal[i].name);
			i++;
		}

	}

	public void herbivores(){

			int i=0;
		System.out.println("herbivores animals are:");
		//for(i=0;i<bird.length;i++)
		while(!(bird[i]==null)){
			if(bird[i].food.equals("grass")){
				System.out.println(bird[i].name);
			}
				i++;
			
		}
		i=0;
		//for(i=0;i<mammal.length;i++)
		while(mammal[i]!=null){
			if(mammal[i].food.equals("grass")){
				System.out.println(mammal[i].name);
			}
				i++;
			
		}

		/*while(object[i]!=null){
			if(object[i].food.equals("grass")){
			System.out.println(object[i].food);
			}
			i++;


		}*/
	}
}


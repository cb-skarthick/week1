 import java.io.*;
 import java.util.*;
 import java.lang.*;
 class Author{
 	private String name;
 	private String email;
 	private char gender;

 	Author(String name,String email,char gender){
 		this.name=name;
 		setEmail(email);
 		this.gender=gender;

 	}

 	public String getName(){
 		return this.name;
 	}

 	public void setEmail(String email) {
 		this.email = email;
 	}

 	public String getEmail(){
 		return this.email;

 	}

 	public char getGender(){
 		return this.gender;
 	}

 	public  void toDisplay(){
 		System.out.println(" "+name+" "+gender+" at "+email);
 		

 	} 


 }

 class Book{

 	String name;
  	Author[] authors;
 	double price;
 	int qtyInStock=0;
 	Book(String name,Author[] authors,double price,int qtyInStock)
 	{
 		this.name=name;
 		setPrice(price);
 		setQtyInStock(qtyInStock);
 		this.authors=authors;

 	}

 	String getName(){
 		return this.name;

 	} 
 	Author[] getAuthors(){
 		return this.authors;

 	}
 	double getPrice(){
 		return this.price;

 	}
 	 int getQtyStock(){
 	 	return this.qtyInStock;

 	 }

 	 void setPrice(double price){
 	 	this.price=price;

 	 }

 	 void setQtyInStock(int qtyInStock){
 	 	this.qtyInStock=qtyInStock;

 	 }

 	 void toDisplay(){
 	 	System.out.println(""+name+" "+authors[0].getName()+" "+authors[0].getGender()+" "+authors[0].getEmail()+" "+price+" "+qtyInStock);

 	 }


 	
 }


 class Exe4{
 	public static void main(String[] args){
 		Author[] authors=new Author[10];
 		authors[0]=new Author("karthick","karthicksis165@gmail.com",'m');
 		authors[1]=new Author("sisth","skarthick@chargebee.com",'m');
 		Book book=new Book("factsOfWorld",authors,500,5);
 		authors[0].toDisplay();
 		book.toDisplay();
 		authors[0].setEmail("skarthick@chargebee.com");
 		authors[0].toDisplay();
 		book.toDisplay();


 		
 	}
 }
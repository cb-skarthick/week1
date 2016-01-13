import java.io.*;
import java.util.*;
import mypack.*;
class Book{

 	String name;
  	Author[] authors;
    //authors[0]=new Author();
 	double price;
 	int qtyInStock=0;
 	Book(String name,Author[] authors,double price,int qtyInStock)
 	{
 		this.authors=new Author[authors.length];

 		this.name=name;
 		setPrice(price);
 		setQtyInStock(qtyInStock);
 		this.authors=authors;

 	}

	Book(String name,Author author,double price,int qtyInStock)
 	{
 		this.name=name;
 		setPrice(price);
 		setQtyInStock(qtyInStock);
 		this.authors = new Author[1];
 		this.authors[0]=author;

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

 	 public void printAuthor(){
 	 	for(int i=0;i<authors.length;i++){
 	 		System.out.println(authors[i].toDisplay());
 	 	}
 	 }

 	 public void addAuthor(Author author){
 	 	//System.out.println("enter the ")
 	 	//authors[authors.length]=author;
 	 	Author[] authors1;
 	 	authors1=this.authors;
 	 	this.authors=new Author[authors1.length+1];
 	 	//authors=this.authors;
 	 	for(int i=0;i<authors1.length;i++){
 	 		this.authors[i]=authors1[i];
 	 	}
 	 	this.authors[authors1.length]=author;

 	 }

 	 public void toDisplay(){
 	 	System.out.println(name + " by ");
 	 	for(int i=0;i<authors.length;i++){
 	 		authors[i].toDisplay();
 	 	}
 	 	System.out.println("price"+price);
 	 	System.out.println("No_Of_Books_Available:"+qtyInStock);

 	 }

 	public static void main(String[] args){
 		Author[] authors=new Author[2];
 		/*for(i=0;i<authors.length;i++){
 			authors[i].
 		}*/
 		authors[0]=new Author("karthick","karthicksis165@gmail.com",'m');
 		authors[1]=new Author("sisth","skarthick@chargebee.com",'m');
 		Author author=new Author("raj","raj@gmail.com",'m');
 		Author author1=new Author("kumar","kumar@gmail.com",'m');
 		Book book1=new Book("factsOfWorld",authors,500,5);
 		Book book2=new Book("letUsC",author,200,2);
 		System.out.println(book1.authors.length);
 		book1.toDisplay();
 		book2.toDisplay();
 		book2.addAuthor(author1);
 		book2.toDisplay();
 		System.out.println(book1.authors.length);
 		System.out.println("stock available in Book1:"+book1.qtyInStock);
 		System.out.println("stock available in Book2:"+book2.qtyInStock);
 		//authors[0].setEmail("skarthick@chargebee.com");
 		//authors[0].toDisplay();
 		//book.toDisplay();


 		
 	}
 }
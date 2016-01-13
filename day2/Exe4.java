import java.io.*;
import java.util.*;
class Exe4{
	public static void main(String[] args)
	{
	int a,b,aa=0,power=1;
	Scanner inp=new Scanner(System.in);
	
	System.out.println("entrer the values for principle amount,no.of.year,rate of interest,no of time:");
	System.out.println("p:");
	float p=inp.nextFloat();
	System.out.println("y:");
	float y=inp.nextFloat();
	System.out.println("r:");
	float r=inp.nextFloat();
	System.out.println("n:");
	float n=inp.nextFloat();
float si=p*y*r/100;
float c=(float)Math.pow((1+r/n),n*y);
float ci=p*c;
System.out.println("simple interest:"+si+ "and compound interest"+ci);

}
}
	
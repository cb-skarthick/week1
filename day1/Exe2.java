import java.io.*;
import java.util.Scanner;
class Exe2
{
	public static void main(String[] args)
	{
	int a,b;
	int sum;
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the value for a");

	a=inp.nextInt();
	System.out.println("value of a is "+a);
 	System.out.println("Enter the value for b");
 	b=inp.nextInt();
	System.out.println("value of b is"+b);
	sum=a+b;
	
	System.out.println("sum is"+sum);
	}
}
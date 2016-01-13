import java.io.*;
import java.util.*;
class Exe3{
	public static void main(String[] args)
	{
	int a,b;
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the value for a");
	a=inp.nextInt();
	System.out.println("Enter the value for b");
	b=inp.nextInt();
	System.out.println("using IF statement");
	if(a>b)
	{
	System.out.println("a is greater");
	}
	else
	{
	System.out.println("b is greater");
	}
	System.out.println("using TERNARY");
	System.out.println(a>b ? "a is greater" : "b is greater");

	}
}
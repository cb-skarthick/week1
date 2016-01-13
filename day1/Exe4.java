import java.io.*;
import java.util.*;
class Exe4{
	public static void main(String[] args)
	{
	int a,b,aa,power=1;
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the value for a");
	a=inp.nextInt();
	System.out.println("Enter the value for b");
	b=inp.nextInt();
	aa=a;
	while(a<=b)
	{
		a*=aa;
		power++;

	}

	System.out.println("smallest power of a that is greater than b is"+power);
}
}
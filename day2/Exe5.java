import java.io.*;
import java.util.*;
class Exe5{
	public static void main(String[] args)
	{
	int a=0,b,aa=1,aaa,power=1;
	Scanner inp=new Scanner(System.in);
System.out.print("enter the n value:");
int n=inp.nextInt();
System.out.print(" "+a+" "+aa);
	
	for(int i=0;i<n;i++)
	{
		aaa=a+aa;
		System.out.print(" "+aaa);
		a=aa;
		aa=aaa;
	}

}
}
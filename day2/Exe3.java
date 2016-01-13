import java.io.*;
import java.util.*;
class Exe3{
	public static void main(String[] args)
	{
	int a,b,aa=0,power=1;
	Scanner inp=new Scanner(System.in);
	
	System.out.println("enter your string:");
	String input=inp.nextLine();
	for(int i=0;i<input.length();i++)
	{
		a=(int)input.charAt(i);
		//System.out.println(a);
		aa+=(a-96);
	}
	System.out.println("output is:"+aa);
}
}
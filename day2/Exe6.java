import java.io.*;
import java.util.*;
class Exe6{
	public static void main(String[] args)
	{
	int a=0,b,aa=1,aaa,power=1;
	int[] array=new int[10];
	Scanner inp=new Scanner(System.in);
System.out.print("enter the array values");
for(int i=0;i<10;i++)
{
	array[i]=inp.nextInt();

}
a=array[0];
b=array[0];

for(int i=0;i<10;i++)
{
	if(a>array[i])
	{
		a=array[i];
	}
	if(b<array[i])
	{
		b=array[i];
	}
}
System.out.println("smallest value is:"+a+"\n largest value is:"+b);
}
}
import java.io.*;
import java.util.*;
class Exe1{
	public static void main(String[] args)
	{
	int a,b,k,l=1;
	int[] array={1,2,3,4,5,6};
	for(int i=0;i<=5;i++)
	{
		l=i;
		for(int j=1;j<6-i;j++)
		{
			System.out.print(" ");
			//j++;

		}

		for(k=0;k<=i;k++)
		{
	System.out.print(array[k]);
		}
	//	System.out.println(k);
		for(int j=k-2;j>=0;j--)
		{
			System.out.print(array[j]);
		}
System.out.println("");
}
}
}
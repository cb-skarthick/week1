import java.io.*;
import java.util.*;
import mypack.Sample;
public class Exe1 extends Sample
{
	public static void main(String[] args)
	{
		int a=5;
		int[] array=new int[a];
		array[0]=1;

		Sample ss=new Sample();
		ss.display();
		System.out.println(array[0]);
	}
}
import java.io.*;
import java.util.*;
class Exe2{
	public static void main(String[] args)
	{
	int a,b;
	String ch="left";
	String input;
	int[][] array={{1,2,3,},{4,5,6},{7,8,9}};
	Scanner inp=new Scanner(System.in);
	System.out.println("given matrix is:");
	for(int i=0;i<3;i++) {
		System.out.println("");
		for(int j=0;j<3;j++) {
			System.out.print(array[i][j]);
		}
	}
	//String input=inp.nextLine();
	//Objects.equals("left",ch)
	//ch=inp.next().charAt(0);

	System.out.println("enter left for left rotation and right for right rotation:");
	input=inp.nextLine();
	if(ch.equals(input)) {
	System.out.println("left rotation");
		for(int i=2;i>=0;i--) {
			System.out.println("");	
			for(int j=0;j<=2;j++) {
			System.out.print(array[j][i]);	
			}
		}
	}
else
{

	System.out.println("right rotation");
for(int i=0;i<=2;i++)
{
	System.out.println("");	
	for(int j=2;j>=0;j--)
	{
	System.out.print(array[j][i]);	
	}
}

}
}
}
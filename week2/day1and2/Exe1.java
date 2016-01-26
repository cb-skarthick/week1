import java.io.*;
import java.util.*;
class Exe1{
String name;

Exe1(String name){
	this.name=name;
}


public String toString()
{
	return name;
}	

public static void main(String[] args) {
	HashMap<Integer,Exe1> names = new HashMap<Integer,Exe1> ();
	Exe1 name1=new Exe1("karthick");
	Exe1 name2=new Exe1("sisth");
	Exe1 name3=new Exe1("sakthi");
	Exe1 name4=new Exe1("ravi");
	names.put(name1.name.length(),name1);
	names.put(name2.name.length(),name2);
	names.put(name3.name.length(),name3);
	names.put(name4.name.length(),name4);
	System.out.println(names);

}
}

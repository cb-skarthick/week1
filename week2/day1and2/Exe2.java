import java.io.*;
import java.util.*;
class Exe2 {
String name;

Exe2(String name){
	this.name=name;
}
/*
public int compareTo(Exe2 obj){
	return name.compareTo(obj.name);
}*/


public String toString()
{
	return name;
}	

public static void main(String[] args) {
	HashMap<String,Exe2> names = new HashMap<String,Exe2> ();
	Exe2 name1=new Exe2("world");
	Exe2 name2=new Exe2("rock");
	Exe2 name3=new Exe2("romio");
	Exe2 name4=new Exe2("ball");
	String key1="worry";
	String key2="rocky";
	String key3="roman";
	String key4="ballon";
	names.put(key1,name1);
	names.put(key2,name2);
	names.put(key3,name3);
	names.put(key4,name4);
	System.out.println("before sorting");
	System.out.println(names);
	
	TreeMap<String,Exe2> snames=new TreeMap<String,Exe2>(names);
	System.out.println("after sorting");
	System.out.println(snames);

}

}
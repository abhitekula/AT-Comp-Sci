package map;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
		table = new LinkedList[10];
		for(int i=0; i<table.length; i++){
			table[i] = new LinkedList<Number>();
		}
	}

	public void add(Number obj)
	{
		boolean add;
		Number b;
		int i = obj.hashCode();
		add=true;
		for(Object a : table[i]){
			b=(Number)a;
			if(b.equals(obj))
				add=false;
		}
		if(add)
			table[i].add(obj);
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		int c=0;
		for(LinkedList a: table){
			output+="\n Bucket " + c + ": ";
			for(Object b: a){
				output+="\t" + b.toString();
			}
			c++;
		}
		return output;
	}
}
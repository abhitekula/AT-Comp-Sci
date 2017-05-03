package hashtable;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTableInteger
{
	private LinkedList<Number>[] table;

	public HashTableInteger( )
	{
		table = new LinkedList[10];
		for(int i = 0; i < 10; i++){
			table[i] = new LinkedList<Number>();
		}
	}

	public void add(int obj){
		Number o = new  Number(obj);
		int i = o.hashCode();
		if(!table[i].contains(o))
			table[i].addLast(o);
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for(int i = 0; i < 10; i++){
			output += "\nBucket " + i + " ::";
			for(Number x : table[i])
				output += " " + x.getValue();
		}

		return output;
	}
}
package hashtable;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTableWord
{
	private LinkedList<Word>[] table;

	public HashTableWord( )
	{
		table = new LinkedList[10];
		for(int i = 0; i < 10; i++){
			table[i] = new LinkedList<Word>();
		}
	}

	public void add(String obj){
		Word o = new  Word(obj);
		int i = o.hashCode();
		if(!table[i].contains(o))
			table[i].addLast(o);
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		for(int i = 0; i < 10; i++){
			output += "\nBucket " + i + " ::";
			for(Word x : table[i])
				output += " " + x.getValue();
		}

		return output;
	}
}
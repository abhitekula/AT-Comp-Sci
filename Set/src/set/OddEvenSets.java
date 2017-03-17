package set;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds= new HashSet<Integer>();
		evens= new HashSet<Integer>();
	}

	public OddEvenSets(String line)
	{
		odds= new HashSet<Integer>();
		evens= new HashSet<Integer>();
		String[] words = line.split(" ");   

		for(String a : words){
			if(Integer.parseInt(a)%2==0)
				evens.add(Integer.parseInt(a));
			else
				odds.add(Integer.parseInt(a));
			 
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}
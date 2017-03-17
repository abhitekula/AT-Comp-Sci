package set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import static java.lang.System.*;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		LinkedList<String> dupe = new LinkedList<String>();
		
		String[] words = input.split(" ");   

		for(String a : words){
			//if(uniques.contains(a))
			//	dupe.add(a);
			uniques.add(a);
			 
		}
//		for(String a: dupe){
//			uniques.remove(a);
//		}
		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		Set<String> dupe = new TreeSet<String>();
		
		String[] words = input.split(" ");   

		for(String a : words){
			if(uniques.contains(a))
				dupe.add(a);
			uniques.add(a);
			 
		}
		return dupe;
	}
}
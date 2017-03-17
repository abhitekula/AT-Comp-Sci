package set;

import static java.lang.System.*;
import java.util.*;

public class DupRunner
{
	public static void main( String args[] )
	{ 
		System.out.println("\n1 5 9 4 6 8 12");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("1 5 9 4 6 8 12"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("1 5 9 4 6 8 12"));
		
		System.out.println("\n3 5 7 17 29 4 6 56 72");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("3 5 7 17 29 4 6 56 72"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("3 5 7 17 29 4 6 56 72"));
		
		System.out.println("\n3 6 12 2 28 6");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("3 6 12 2 28 6"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("3 6 12 2 28 6"));
		
		System.out.println("\n4 4 4 4 4 4 4 4");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("4 4 4 4 4 4 4 4"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("4 4 4 4 4 4 4 4"));
		
		System.out.println("\n1 1 1 1 1 1 1 1");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("1 1 1 1 1 1 1 1"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("1 1 1 1 1 1 1 1"));
		
		System.out.println("\n1 2 3 4 5 6 7 8 9");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("1 2 3 4 5 6 7 8 9"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("1 2 3 4 5 6 7 8 9"));
		
		System.out.println("\n1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6"));
		
		System.out.println("\na b c d e f g h a b c d e f g h i j k");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("a b c d e f g h a b c d e f g h i j k"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("a b c d e f g h a b c d e f g h i j k"));
		
		System.out.println("\none two three one two three six seven one two");
		System.out.println("Dupes");
		System.out.println(UniquesDupes.getDupes("one two three one two three six seven one two"));
		System.out.println("Uniques");
		System.out.println(UniquesDupes.getUniques("one two three one two three six seven one two"));
		
	}
}
package set;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		
		MathSet a = new MathSet("1 2 3 4 5", "4 5 6 7 8");
		System.out.println(a);
		System.out.println("Union");
		System.out.println(a.union());
		System.out.println("Intersection");
		System.out.println(a.intersection());
		System.out.println("Difference A-B");
		System.out.println(a.differenceAMinusB());
		System.out.println("Difference B-A");
		System.out.println(a.differenceBMinusA());
		System.out.println("Symmetric Difference");
		System.out.println(a.symmetricDifference());
		
		
		MathSet b = new MathSet("10 11 12 13 14 15 16 17", "11 13 15 17 19 21 23");
		System.out.println(b);
		System.out.println("Union");
		System.out.println(b.union());
		System.out.println("Intersection");
		System.out.println(b.intersection());
		System.out.println("Difference A-B");
		System.out.println(b.differenceAMinusB());
		System.out.println("Difference B-A");
		System.out.println(b.differenceBMinusA());
		System.out.println("Symmetric Difference");
		System.out.println(b.symmetricDifference());
		
		MathSet c = new MathSet("4 5 5 6 76 7 7 8 8 8 8 8", "23 3 4 3 5 3 53 5 46 46 4 6 5 3 4");
		System.out.println(c);
		System.out.println("Union");
		System.out.println(c.union());
		System.out.println("Intersection");
		System.out.println(c.intersection());
		System.out.println("Difference A-B");
		System.out.println(c.differenceAMinusB());
		System.out.println("Difference B-A");
		System.out.println(c.differenceBMinusA());
		System.out.println("Symmetric Difference");
		System.out.println(c.symmetricDifference());
		
	}
}

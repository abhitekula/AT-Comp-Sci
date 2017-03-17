package set;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
//		1 2 3 4 5 6 7 8 9 
		System.out.println("1 5 9 4 6 8 12");
		OddEvenSets a = new OddEvenSets("1 5 9 4 6 8 12");
		System.out.println(a);
		System.out.println("3 5 7 17 29 4 6 56 72");
		OddEvenSets b = new OddEvenSets("3 5 7 17 29 4 6 56 72");
		System.out.println(b);
		System.out.println("3 6 12 2 28 6");
		OddEvenSets c = new OddEvenSets("3 6 12 2 28 6");
		System.out.println(c);
		System.out.println("4 4 4 4 4 4 4 4");
		OddEvenSets d = new OddEvenSets("4 4 4 4 4 4 4 4");
		System.out.println(d);
		System.out.println("1 1 1 1 1 1 1 1");
		OddEvenSets e = new OddEvenSets("1 1 1 1 1 1 1 1");
		System.out.println(e);
		System.out.println("1 2 3 4 5 6 7 8 9 ");
		OddEvenSets f = new OddEvenSets("1 2 3 4 5 6 7 8 9 ");
		System.out.println(f);
	}
}
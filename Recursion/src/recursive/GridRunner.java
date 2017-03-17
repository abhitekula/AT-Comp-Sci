package recursive;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;


public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"A","E","I","O","U"};
		Grid grid = new Grid(5,5,vals);
		//System.out.println("Max Number of A's : " + grid.findMax("A"));
		//System.out.println("Max Number of E's : " + grid.findMax("E"));
		//System.out.println("Max Number of I's : " + grid.findMax("I"));
		//System.out.println("Max Number of O's : " + grid.findMax("O"));
		//System.out.println("Max Number of U's : " + grid.findMax("U"));
//		System.out.println(grid.counter("A"));
//		System.out.println(grid.counter("E"));
//		System.out.println(grid.counter("I"));
//		System.out.println(grid.counter("O"));
//		System.out.println(grid.counter("U"));
	
		grid.findMaxs();
		
	}
}
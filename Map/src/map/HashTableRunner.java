package map;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.System.*;

public class HashTableRunner
{
  public static void main ( String[] args ) throws FileNotFoundException
  {
			HashTable table = new HashTable();
			Scanner file = new Scanner(new File("H:/Eclipse Workspace/Map/src/map/numbers.dat")); //C:/Users/17at0666/Downloads/spantoeng.dat
			while(file.hasNextLine()){
				table.add(new Number(Integer.parseInt(file.nextLine())));
			}
			System.out.println(table);
  }
}
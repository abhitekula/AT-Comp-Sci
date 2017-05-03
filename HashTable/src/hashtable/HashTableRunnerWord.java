package hashtable;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import static java.lang.System.*;

public class HashTableRunnerWord
{
  public static void main ( String[] args )
  {
		try{
			HashTableWord table = new HashTableWord();
			Scanner name = new Scanner(System.in);
			System.out.println("Enter filename:");
			Scanner in = new Scanner(new File(name.nextLine()));
			int cap = Integer.parseInt(in.nextLine());
			for(int i = 0; i < cap; i++)
				table.add(in.next());
			System.out.println(table);
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
  }
}
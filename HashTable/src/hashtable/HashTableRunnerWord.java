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

			int size = Integer.parseInt(in.nextLine());
			for(int i = 0; i < size; i++){
				table.add(in.next());
			}
			System.out.println(table);
			name.close();

			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
			System.out.println(e);

		}
  }
}
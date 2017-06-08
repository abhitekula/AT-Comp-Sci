package tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneTester
{

    public static void main(String[] args) throws FileNotFoundException
    {
     //"H:/Eclipse Workspace/Binary Search Trees/src/tree/phone.txt"
    		
     BinarySearchTreePhoneBook book = new BinarySearchTreePhoneBook();
     Scanner k = new Scanner(System.in);
		System.out.println("Enter the filename:");
		File file = new File(k.nextLine());
		Scanner input = new Scanner(file);
		while(input.hasNextLine()){
			book.add(new PhoneEntry(input.next(), Integer.parseInt(input.next())));
		}
		input.close();
   	 book.display();
   	 System.out.println("Lookup Price: " + book.lookupNumber("Price"));
   	 System.out.println("\n\n");
   	 System.out.println("Lookup Number (9841116) : " + book.reverseLookup("9841116"));
   	 //book.display();
    }

}
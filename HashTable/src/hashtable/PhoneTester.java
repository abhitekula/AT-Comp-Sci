package hashtable;

import java.io.FileNotFoundException;

public class PhoneTester
{

    public static void main(String[] args) throws FileNotFoundException
    {
     //"H:/Eclipse Workspace/HashTable/src/hashtable/phone.txt"
   	 PhoneBook b = new PhoneBook();
   	 b.load();
   	 b.display();
   	 System.out.println("\n\n");
   	 System.out.println("Lookup Price: " + b.lookup("Price"));
   	 System.out.println("Change Price's Number:");
   	 System.out.println(b.changeNumber("Price", 1111111));
   	 System.out.println("\n\n");
   	 PhoneEntry h = new PhoneEntry("SantaClaus", 7165100);
   	 b.add(h);
   	 b.display();
   	 System.out.println("Capacity: " + b.getCapacity() + "\nSize: " + b.getSize() + "\nLongest list length: " + b.getLongestList() + "\nNull entries: " + b.getNumberofNulls());
    }

}
package hashtable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PhoneBook {
	
	private LinkedList<PhoneEntry>[] table;
	
	public PhoneBook(){
		table = new LinkedList[10];
	}

	public PhoneBook(int capacity) {
		table = new LinkedList[capacity];
	}
	
	public int getCapacity(){
		return table.length;
	}
	
	public int getSize(){
		int size=0;
		for(LinkedList a : table){
			size+=a.size();
		}
		return size;
	}
	
	public void add(PhoneEntry entry){
		int index = Math.abs(entry.hashcode()%table.length);
		//System.out.println(index);
		//System.out.println(entry.hashCode());
		if(table[index]==null){
			table[index] =  new LinkedList<PhoneEntry>();
			table[index].add(entry);
		}
		else
			table[index].add(entry);
	}
	
	public void load() throws FileNotFoundException{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the filename:");
		File file = new File(k.nextLine());
		Scanner input = new Scanner(file);
		while(input.hasNextLine()){
			add(new PhoneEntry(input.next(), Integer.parseInt(input.next())));
		}
		input.close();
	}
	
	public void display(){
		System.out.println("Phonebook: ");
		for(LinkedList<PhoneEntry> a : table){
			for(PhoneEntry b :a){
				System.out.println(b);
			}
		}
	}
	
	public int getNumberofNulls(){
		int num=0;
		for(LinkedList a : table){
			if(a==null)
				num++;
		}
		return num;
	}
	
	public int getLongestList(){
		int size=table[0].size();
		for(LinkedList a : table){
			if(a.size()>size)
				size=a.size();
		}
		return size;
	}
	
	public String lookup(String name){
		String number="Not Found";
		PhoneEntry entry = new PhoneEntry(name);
		PhoneEntry temp;
		int hash = entry.hashCode();
		System.out.println("Hash: " + hash);
		LinkedList<PhoneEntry> list = table[hash%table.length];
		ListIterator<PhoneEntry> iter = list.listIterator();
		while(iter.hasNext()){
			temp=iter.next();
			//System.out.println(temp);
			if(temp.getName().equals(name)){
				number="" + temp.getNumber();
			}
		}
		return number;
	}
	
	public boolean changeNumber(String name, int number){
		PhoneEntry entry = new PhoneEntry(name);
		int hash = entry.hashCode();
		System.out.println("Hash: " + hash);
		LinkedList<PhoneEntry> list = table[hash%table.length];
		ListIterator<PhoneEntry> iter = list.listIterator();
		while(iter.hasNext()){
			entry=iter.next();
			//System.out.println(entry);
			if(entry.getName().equals(name)){
				entry.setNumber(number);
				iter.set(entry);
				return true;
			}
		}
		return false;
	}
	
}

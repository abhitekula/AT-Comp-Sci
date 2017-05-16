package hashtable;

import java.util.Hashtable;
import java.util.LinkedList;
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
		int index = entry.hashcode();
		if(table[index]==null){
			table[index] =  new LinkedList<PhoneEntry>();
			table[index].add(entry);
		}
		else
			table[index].add(entry);
	}
	
	public void load(){
		Scanner k = new Scanner(System.in);
	}
	
	public void display(){
		
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
		
	}
	
	public boolean changeNumber(){
		
	}
	
}

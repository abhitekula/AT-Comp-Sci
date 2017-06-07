package tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BinarySearchTreePhoneBook {
	
	private BinarySearchTree book;
	
	public BinarySearchTreePhoneBook(){
		book = new BinarySearchTree();
	}

	public BinarySearchTreePhoneBook(int capacity) {
		book = new BinarySearchTree();
	}
	
	public void add(PhoneEntry entry){
		book.add(entry);
	}
	
	public void display(){
		System.out.println(book.inOrderMultiLine());
	}
	
	String number;
	public String lookupNumber(String name) {
		number = "Name does not exist.";
		return lookupNumber(name, book.getRoot());
	}
	
	private String lookupNumber(String name, TreeNode tree) {
		PhoneEntry temp = new PhoneEntry("Temp");
		if (tree != null){
			if(tree.getValue() instanceof PhoneEntry)
				temp=(PhoneEntry)tree.getValue();
			if(temp.getName().equals(name)){
				number = "" + temp.getNumber();
			}
			lookupNumber(name, tree.getLeft());
			lookupNumber(name, tree.getRight());
		}
		return number;
	}
	
	public String reverseLookup(String number) {
		return reverseLookup(number, book.getRoot());
	}
	
	//search
	private String reverseLookup(String number, TreeNode tree) {
		PhoneEntry temp = new PhoneEntry("Temp");
		if (tree != null){
			if(tree.getValue() instanceof PhoneEntry)
				temp=(PhoneEntry)tree.getValue();
			if(temp.getNumber().equals(number))
				return "" + temp.getName();
			lookupNumber(number, tree.getLeft());
			lookupNumber(number, tree.getRight());
		}
		return null;
	}
	
	public void delete(String name){
		book.remove(new PhoneEntry(name, Integer.parseInt(lookupNumber(name))));
	}
	
	public void delete(String name, int number){
		book.remove(new PhoneEntry(name, number));
	}
	
}
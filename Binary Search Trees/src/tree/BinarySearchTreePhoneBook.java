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
	
	String output;
	public String lookupNumber(String name) {
		output = "Name does not exist.";
		return lookupNumber(name, book.getRoot());
	}
	
	private String lookupNumber(String name, TreeNode tree) {
		PhoneEntry temp = new PhoneEntry("Temp");
		if (tree != null){
			if(tree.getValue() instanceof PhoneEntry)
				temp=(PhoneEntry)tree.getValue();
			if(temp.getName().equals(name)){
				output = "" + temp.getNumber();
			}
			lookupNumber(name, tree.getLeft());
			lookupNumber(name, tree.getRight());
		}
		return output;
	}
	
	public String reverseLookup(String number) {
		output = "Number does not exist.";
		return reverseLookup(number, book.getRoot());
	}
	
	//search
	private String reverseLookup(String number, TreeNode tree) {
		PhoneEntry temp = new PhoneEntry("Temp");
		if (tree != null){
			if(tree.getValue() instanceof PhoneEntry)
				temp=(PhoneEntry)tree.getValue();
			if(temp.getNumber()==Integer.parseInt(number))
				output = temp.getName();
			reverseLookup(number, tree.getLeft());
			reverseLookup(number, tree.getRight());
		}
		return output;
	}
	
	public void delete(String name){
		book.remove(new PhoneEntry(name, Integer.parseInt(lookupNumber(name))));
	}
	
	public void delete(String name, int number){
		book.remove(new PhoneEntry(name, number));
	}
	
}
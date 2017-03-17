package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Students {
	
	public static void main(String[] args){
		LinkedList<String> roster = new LinkedList<String>();
		roster.addLast("Abhinav");
		roster.addLast("BadBrothandBeyond");
		System.out.println(roster);
		roster.addFirst("Liz");
		roster.addFirst("First");
		System.out.println(roster);
		roster.add("Agenda");
		System.out.println(roster.remove());
		System.out.println(roster);
		
		ListIterator<String> iter = roster.listIterator();
		
	}

}

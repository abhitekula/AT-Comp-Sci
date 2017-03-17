package pqueue;

import java.util.PriorityQueue;

public class Patient implements Comparable<Patient>{
	
	private String name;
	private int priority;
	
	

	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	

	public static void main(String[] args) {
		PriorityQueue<Patient> list = new PriorityQueue<Patient>();
		list.add(new Patient("Smith",3));

	    list.add(new Patient("Chen",2));

	    list.add(new Patient("Jones",3));

	    list.add(new Patient("Wong",3));

	    list.add(new Patient("Gupta",2));

	    list.add(new Patient("Garcia",1));

	    list.add(new Patient("Brown",3));

	    System.out.println("The list is");

	    System.out.println(list);  

	    while(list.size()>0)

	    {

	            System.out.println("The next patient for the liver transplant is");

	            System.out.println(list.poll());

	     }

	}


	

	public int getPriority() {
		return priority;
	}



	@Override
	public int compareTo(Patient a) {
		if(priority>a.getPriority())
			return -1;
		else if(priority<a.getPriority())
			return 1;
		else return 0;
	}



	@Override
	public String toString() {
		return "Patient [name=" + name + ", priority=" + priority + "]";
	}

}

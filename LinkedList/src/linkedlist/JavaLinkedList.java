package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.System.*;

public class JavaLinkedList {
	
	private LinkedList<Integer> list;

	public JavaLinkedList(){
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums){
		list = new LinkedList<Integer>();
		for(int num : nums){
			list.add(num);
		}
	}

	public double getSum(){
		double total=0;
		ListIterator<Integer> iter = list.listIterator();
		while(iter.hasNext()){
			total+=iter.next();
		}
		return total;
	}

	public double getAvg(  ){
		return getSum()/list.size();
	}

	public int getLargest(){
		int largest=Integer.MIN_VALUE;
		ListIterator<Integer> iter = list.listIterator();
		int temp;
		while(iter.hasNext()){
			temp=iter.next();
			if(temp>largest)
				largest=temp;
		}
		return largest;
	}

	public int getSmallest(){
		int smallest = Integer.MAX_VALUE;
		ListIterator<Integer> iter = list.listIterator();
		int temp;
		while(iter.hasNext()){
			temp=iter.next();
			if(temp<smallest)
				smallest=temp;
		}
		return smallest;
	}

	public String toString(){
		return "Sum:: " + getSum() + "\nAverage:: " + getAvg() + "\nSmallest:: " + getSmallest() + "\nLargest:: " + getLargest() + "\n\n";
	}
}





package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import static java.lang.System.*;


public class Fruit {
	
	private LinkedList<String> bowl;

	public Fruit(){
		bowl = new LinkedList<String>();
		bowl.add("Apple");
		bowl.add("Banana");
		bowl.add("Cherry");
		bowl.add("Lemon");
		bowl.add("Lime");
		bowl.add("Orange");
		bowl.add("Papaya");
		bowl.add("Strawberry");
		bowl.add("Watermelon");
		
	}
	
	public void displayFruit(){
		out.println(bowl);
	}
	
	public void displayFruit2(){
		for(String t: bowl){
			out.println(t);
		}
	}
	
	public void displayFruit3(){
		ListIterator<String> iter = bowl.listIterator();
		while (iter.hasNext()){
			out.println(iter.next());
			if(iter.hasNext())
				iter.next();
		}
	}
	
	public void removeEveryOther(){
		ListIterator<String> iter = bowl.listIterator();
		while (iter.hasNext()){
			out.println(iter.next());
			if(iter.hasNext()){
				iter.next();
				iter.remove();
			}
		}
		displayFruit();
	}
	
	public void displayReverse() {
		ListIterator<String> iter = bowl.listIterator();
		while(iter.hasNext()){
			iter.next();
		}
		while(iter.hasPrevious()){
			out.println(iter.previous());
		}
	}
	
	public void insert(String a){
		ListIterator<String> iter = bowl.listIterator();
		char first = a.charAt(0);
		while(iter.hasNext() && iter.next().charAt(0)<first){
		}
		iter.add(a);
	}
	
	public void removeLetter(String a){
		char letter = a.toLowerCase().charAt(0);
		ListIterator<String> iter = bowl.listIterator();
		char temp=iter.next().toLowerCase().charAt(0);
		while(iter.hasNext() && temp<=letter){
			if(letter==temp){
				iter.remove();
			}
			temp=iter.next().toLowerCase().charAt(0);
		}
	}
	
	public String locate(String a){
		ListIterator<String> iter = bowl.listIterator();
		while(iter.hasNext()){
			if(iter.next().equals(a));
				return a + " is indeed in the list";
		}
		return a + "is not in the list";
	}
	
	public LinkedList<String> reverse(){
		LinkedList<String> reverse = new LinkedList<String>();
		ListIterator<String> iter = bowl.listIterator();
		while(iter.hasNext()){
			iter.next();
		}
		while(iter.hasPrevious()){
			reverse.add(iter.previous());
		}
		return reverse;
	}
	
	public void removeNonPrimes(int n){
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int x=2;x<n+1;x++){
			list.add(x);
		}
		//int num=list.size();
		System.out.println(list);
		ListIterator<Integer> iter = list.listIterator();
		boolean stop=false;
		int temp,start;
		start=0;
		while(!stop){
		iter=list.listIterator();
		for(int x=0;x<start;x++){
			if(iter.hasNext())
				iter.next();
		}
		start++;
		temp=iter.next();
		while(iter.hasNext()){
			if(iter.next()%temp==0){
				iter.remove();
				//num--;
			}
		}	
		if(start==list.size()-1)
			stop=true;
		}
		System.out.println(list);
		System.out.println("Num Primes: " + list.size());
	}
	
	public static void main(String[] args) {
		Fruit one = new Fruit();
		one.displayFruit();
		one.displayFruit2();
		one.displayFruit3();
		//one.removeEveryOther();
		one.displayReverse();
		one.insert("Bob");
		one.displayFruit();
		one.removeLetter("b");
		one.displayFruit();
		System.out.println(one.locate("Cherry"));
		System.out.println(one.reverse());
		one.removeNonPrimes(10000);
	}

}

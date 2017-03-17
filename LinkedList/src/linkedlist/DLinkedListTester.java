package linkedlist;

public class DLinkedListTester {

	public static void main(String[] args) {
		DLinkedList list = new DLinkedList();
		DListIterator iter = new DListIterator(list);
		
		iter.add("Abhinav");
		

		
		//list.addLast("Abhinav");
		list.addFirst("Barath");
		list.addFirst("Abhinav");
		//list.addLast("Abhinav");
		
		System.out.println(list);
		
		
	}

}

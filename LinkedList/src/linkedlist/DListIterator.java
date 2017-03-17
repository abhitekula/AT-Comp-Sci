package linkedlist;

public class DListIterator
{

	private DLinkedList myList;
	private DListNode current;
	private DListNode previous;
	private DListNode traversed;
	private boolean canRemove; // for remove() method. true if OK to call remove()

	public DListIterator(DLinkedList list)
	{
		myList = list;
		current = myList.getFirstNode();
		previous = null;
		canRemove = false;
	}
	public String toString()
	{
		return current.toString();
	}
		
	public boolean hasPrevious()
	{
		if(previous!=null)
			return true;
		else 
			return false;
	}
		
	public boolean hasNext()
	{
		if(current.getNext()!=null)
			return true;
		else 
			return false;
	}
	
	public Object next()
	{
		canRemove = true;
		previous = current;
		current = current.getNext();
		traversed = current;
		return current;
	}
		
	public Object previous()
	{
		canRemove=true;
		previous=previous.getPrevious();
		current=previous;
		traversed=current;
		return current;
	}
	
	public void remove()
	{
		if(canRemove)
		{
			current = traversed;
			current.setNext(current.getNext());
			current = previous;
			previous = current.getPrevious();
			
		}
		canRemove=false;
	}
	
	public void add(Object element)
	{
		
	}
	
	public void set(Object element)
	{
		current = new DListNode(element, previous, current.getNext());
	}
}
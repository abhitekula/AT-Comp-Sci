package linkedlist;

public class DLinkedList
{
	
		private DListNode firstNode;
		private DListNode lastNode;
		
		/**
		 * Construct an empty list
		 */
		public DLinkedList()
		{
			firstNode = null;
			lastNode = null;
		}

		/**
		 * Returns true if the list contains no elements
		 */
		public boolean isEmpty()
		{
			if(firstNode!=null)
				return true;
			else
				return false;
		}
		

		public DListNode getFirstNode()
		{
			return firstNode;
		}

		public void setFirstNode(DListNode firstNode)
		{
			this.firstNode = firstNode;
		}

		public DListNode getLastNode()
		{
			return lastNode;
		}

		public void setLastNode(DListNode lastNode)
		{
			this.lastNode = lastNode;
		}

		/**
		 * Inserts the argument as the first element of this list.
		 */

		public void addFirst(Object o)
		{
			if(size()>=1)
			{
				//firstNode.setNext(firstNode);
				DListNode temp = new DListNode(firstNode.getValue(),null,firstNode);
				firstNode=new DListNode(o,temp,null);
				//temp.setPrevious(firstNode);
			}
			
			else
			{
				firstNode=new DListNode(o,null,null);
				firstNode.setValue(o);
				System.out.println(firstNode);
			}
				
		}
		
			
		/**
		 * Inserts the argument as the last element of this list.
		 */

		public void addLast(Object o) {
			if(size()>1)
				lastNode.setNext(new DListNode(o,null,lastNode));	
			else
				firstNode=new DListNode(o,null,null);
		}

		/**
		 * Removes and returns the first element of this list.
		 */

		public Object removeFirst() {
			firstNode.getNext().setPrevious(null);
			firstNode=firstNode.getNext();
			return firstNode;
		}

	/**
		 * Removes and returns the last element of this list.
		 */

		public Object removeLast(){
			lastNode.getPrevious().setNext(null);
			lastNode=lastNode.getPrevious();
			return lastNode;
		}

		
		/**
		 * Returns a String representation of the list.
		 */
		public String toString(){
			String string="";
			while(firstNode!=null){
				string+=firstNode + " | ";
				firstNode=firstNode.getNext();
			}
			return string;
		}

		
		/**
		 * Returns the number of elements in the list as an int.
		 */
		public int size() {
			int size=0;
			while(firstNode!=null){
				size++;
				firstNode=firstNode.getNext();
			}
			System.out.println(size);
			return size;
		}
			

		/**
		 * Removes all of the elements from this list.
		 */
		public void clear() {
			firstNode=null;
			lastNode=null;
		}
			
		/**
		 * Returns a DListIterator.
		 */

		public DListIterator iterator() {
			return new DListIterator(this);

		}


}

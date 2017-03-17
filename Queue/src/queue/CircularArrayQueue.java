package queue;

public class CircularArrayQueue {

	private int head;

	private int tail;

	private int theSize;

	private Object[] elements;
	
	public CircularArrayQueue(int capacity) {
		elements = new Object[capacity];
		theSize=0;
		head=0;
		tail=1;
	}

	public void add(Object x) {
		if(!(head==0 && tail==1) && head==tail){
			Object[] temp = new Object[elements.length*2];
			theSize=temp.length;
			int y=head;
			while(y<elements.length){
				temp[y-head]=elements[y];
				y++;
			}
			y=0;
			while(y<head){
				temp[y+head]=elements[y];
				y++;
			}
			head=0;
			tail=elements.length;
			elements=temp;
		}
		elements[tail]=x;
		if((tail+1)<elements.length)
			tail++;
		else{
			tail=0;
		}
		theSize++;
	}

	public Object remove() {
		Object temp=elements[head];
		elements[head]=null;
		if((head+1)<elements.length)
			head++;
		else{
			head=0;
		}
		theSize--;
		return temp;
	}

	public int size() {
		return theSize;
	}

	public String toString(){
		String temp="";
		for(Object a : elements){
			if(a!=null)
				temp+=a.toString() + " ";
			else
				temp += "null ";
		}
		return temp;
	}

}

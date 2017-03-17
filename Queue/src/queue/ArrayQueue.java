package queue;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayQueue implements MyQueue {

	private Object[] data;

	public ArrayQueue() {
		data = new Object[0];
	}
	
	public ArrayQueue(Object[] queue) {
		data = queue;
	}

	@Override
	public boolean empty() {
		if (data.length == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean offer(Object item) {
		Object[] temparr = new Object[data.length+1];
		for(int x=0;x<temparr.length;x++){
			if(x<temparr.length-1)
				temparr[x]=data[x];
			else
				temparr[x]=item;
		}
		data=temparr;
		return true;
	}

	@Override
	public Object poll() {
		if(empty())
			return null;
		else{
			Object temp = data[0];
			Object[] temparr = new Object[data.length-1];
			for(int x=0;x<temparr.length;x++){
				temparr[x]=data[x+1];
			}
			data=temparr;
			return temp;
		}
	}

	@Override
	public Object peek() {
		if(empty())
			return null;
		else{
			return data[0];
		}
	}

	public ArrayQueue alternate(ArrayQueue queue) {
		Object[] temparr = new Object[data.length+queue.length()];
		int c=0,c2=0;
		if(data.length>queue.length()){
			while(c/2<queue.length()){
				temparr[c]=data[(int)c/2];
				c++;
				temparr[c]=queue.getData()[c/2];
				c++;
			}
			c2=c/2;
			while(c2<data.length){
				temparr[c]=data[(int)c2];
				c++;
				c2++;
			}
			
		}
		else{
			while(c/2<data.length){
				temparr[c]=data[c/2];
				c++;
				temparr[c]=queue.getData()[c/2];
				c++;
			}
			c2=c/2;
			while(c2<queue.length()){
				temparr[c]=queue.getData()[c2];
				c++;
				c2++;
			}
		}
		return new ArrayQueue(temparr);
	}

	private Object[] getData() {
		return data;
	}

	public int length() {
		return data.length;
	}

	public ArrayQueue append(ArrayQueue queue) {
		Object[] temparr = new Object[data.length+queue.length()];
		for(int x=0;x<temparr.length;x++){
			//System.out.println(data[x]);
			if(x<data.length)
				temparr[x]=data[x]; 
			else
				temparr[x]=queue.getData()[x-data.length];
		}
		return new ArrayQueue(temparr);
	}
	
	public String toString(){
		String temp="";
		for(Object a : data){
			temp += a + " "; 
		}
		return temp;
	}

}

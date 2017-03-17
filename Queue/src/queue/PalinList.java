package queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

import static java.lang.System.*;

public class PalinList {
	
	static Queue<String> q;
	static Stack<String> s;
	
	public PalinList(String str) {
		q = new LinkedList<String>();
		s = new Stack<String>();
		String[] temp = str.split(" ");
		for(String a : temp){
			q.offer(a);
			s.push(a);
		}
	}

	public boolean isPalin(){
		boolean z=true;
		while(q.size()>0){
			if(!(q.poll().equals(s.pop()))){
				z=false;
			}
		}
		return z;
	}

	public Queue<String> getList() {
		return q;
	}
	
	
	
	
	
}

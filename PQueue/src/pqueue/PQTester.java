package pqueue;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
		setPQ("");
	}

	public PQTester(String list)
	{
		setPQ(list);
	}

	public void setPQ(String list)
	{
		pQueue = new PriorityQueue<String>();
		String[] arr = list.split(" ");
		for(String a : arr){
			pQueue.offer(a);
		}
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(pQueue.size()>0){
			output+=" " + pQueue.poll();
		}
		return output;		
	}

	public String toString(){
		return pQueue.toString();
	}
}
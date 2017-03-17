package pqueue;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class SwimmerPQ  
{
	private Queue<Swimmer> pQueue;

	public SwimmerPQ()
	{
		pQueue = new PriorityQueue<Swimmer>();
	}

	public void add(Swimmer obj)
	{
		pQueue.add(obj);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public Object removeMin()
	{
		return pQueue.poll();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(pQueue.size()>0){
			output+=pQueue.poll();
		}
		return output;		
	}

	//write a toString method
	
	public String toString(){
		return pQueue.toString();
	}
	
}
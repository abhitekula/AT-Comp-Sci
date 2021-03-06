package heap;

import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private ArrayList<Integer> list;

	public Heap()
	{
		list = new ArrayList<Integer>();
	}

	public void add(int value)
	{
		list.add(value);
		swapUp(list.size()-1);
	}

   public void swapUp(int bot)
   {
	   while(list.get(bot)>list.get(bot/2) && bot>1){
		   swap(bot,bot/2);
		   bot/=2;
	   }
   }

	public void remove( )
	{
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		swapDown(0);
	}

	public void swapDown(int top)
	{
		while(list.get(top)<list.get(top*2) && list.get(top)<list.get(top*2+1) && top<list.size()){
			   if(top*2>top*2+1){
				swap(top,top*2);
				top*=2;
			   }
			   else{
				 swap(top,top*2+1);
				 top*=2;
				 top++;
			   }
		  }
	}
	
	private void swap(int start, int finish)
	{	
		int temp = list.get(start);
		list.set(start, finish);
		list.set(finish, temp);
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		System.out.println(list);
	}

	public String toString()
	{
		return list.toString();
	}
}
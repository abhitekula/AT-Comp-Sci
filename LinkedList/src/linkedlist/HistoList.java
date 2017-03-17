package linkedlist;

import java.util.*;


public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{	

		HistoNode current = front;
		HistoNode prev = null;
		if (current == null)
			front = new HistoNode(let, 1, null);
		else {
			while(current != null){
				if(current.getLetter() == let){
					current.setLetterCount(current.getLetterCount() + 1);
					return;
				}
				prev = current;
				current = current.getNext();
			}
			prev.setNext(new HistoNode(let, 1, null));
		}

	}
	
	
	public boolean exists(char let){
		boolean go=true;
		while(go)
		{
			if(front!=null && front.getLetter() ==let){
				go=false;
				return true;
			} 
			else{
				if(front!=null)
					front=front.getNext();
				else
					go=false;
			}
		}
		return false;
	}

	public void prevAddLetter(char let)
	{	

		HistoNode current = front;
		HistoNode prev = null;
		if (current == null)
			front = new HistoNode(let, 1, null);
		else {
			while(current != null){
				if(current.getLetter() == let){
					current.setLetterCount(current.getLetterCount() + 1);
					return;
				}
				prev = current;
				current = current.getNext();
			}
			prev.setNext(new HistoNode(let, 1, null));
		}

	}
	
	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		while(front!=null){
			output+=front.getLetter() + " "  + front.getLetterCount() + " \n";
			front=front.getNext();
		}
		return output;
	}
}
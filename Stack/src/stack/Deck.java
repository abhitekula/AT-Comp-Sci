package stack;

import java.util.Stack;

public class Deck {
	
	private Stack<Card> deck;
	
	
	public Deck() {
		deck = new Stack<Card>();
		loadDeck();
	}

	public Stack<Card> getDeck() {
		return deck;
	}

	// Load the stack with 52 cards in order
	public void loadDeck(){
		while(!deck.isEmpty()){
			deck.pop();
		}
		for(int x=0;x<52;x++){
			deck.push(new Card(x%13+2,x/13+1));
		}
	}

       // Print the stack - for uniformity,
       // make 13 rows in four columns, filling
       // in each row from left to right
	public String toString() {
		int c=0;
		String s="";
		for(Card a : deck){
			if(c%4==0)
				s+="\n" + a;
			else
				s+="\t" + a;
			c++;
		}
		return s;
	}

	// Return and remove the top card
	public Card deal() {
		return deck.pop();
	}

	// Take the top half of the deck (26 cards) and alternate card by card with
	// the bottom half
	public void bridgeShuffle() {
		deck=reverse(deck);
		Stack<Card> top = new Stack<Card>();
		for(int x=1;x<=26;x++){
			top.push(deck.pop());
		}
		top=reverse(top);
		Stack<Card> temp = new Stack<Card>();
		for(int x=1; x<=26 ; x++){
			temp.push(top.pop());
			temp.push(deck.pop());
		}
		deck=temp;
	}
	
	// Split the deck at a random spot. Put the stack of cards above the random
	// spot below the other cards
	public void cut() {
		int split = (int)(Math.random()*40+12);
		Stack<Card> temp = new Stack<Card>();
		for(int x=1; x<=split ; x++){
			temp.push(deck.pop());
		}
		temp=reverse(temp);
		deck=reverse(deck);
		while(!deck.isEmpty()){
			temp.push(deck.pop());
		}
		
		deck=temp;
	}

	// Complete a bridge shuffle and then cut the deck. Repeat 7 times
	public void completeShuffle() {
		for(int x=1;x<=7;x++){
			bridgeShuffle();
			cut();	
		}
	}

       // Reverse the order of the cards in the deck
       private void reverse() {
    	   Stack<Card> reverse = new Stack<Card>();
    	   while(!deck.isEmpty()){
    		   reverse.push(deck.pop());
    	   }
    	   deck=reverse;
       }

       // Given a Stack of cards as an explicit parameter,
       // reverse the order of the cards in the deck
       private Stack<Card> reverse(Stack<Card> x) {
    	   Stack<Card> reverse = new Stack<Card>();
    	   while(!x.isEmpty()){
    		   reverse.push(x.pop());
    	   }
    	   return reverse;
       }

       // Combine two decks, one as the implicit 
       // parameter, the other as the explicit parameter
       public void combineDecks(Stack<Card> other) {
    	   other=reverse(other);	
    	   while(!other.isEmpty()){
    	   		deck.push(other.pop());
    	   	}
       }

       
	public static void main(String[] args) {
    	// example method calls - you should make your own
		/*
		Deck a = new Deck();
		System.out.println("Deck\n" + a.getDeck());
		System.out.println();
		System.out.println(a);
		a = new Deck();
		System.out.println("Bridge Shuffle:");
		a.bridgeShuffle();
		System.out.println(a);
		a = new Deck();
		System.out.println("Cut");
		a.cut();
		System.out.println(a);
		a = new Deck();
		System.out.println("Complete Shuffle");
		a.completeShuffle();
		System.out.println(a);
		a = new Deck();
		System.out.println("After 1 bridge shuffle");
		a.bridgeShuffle();
		System.out.println(a);
		a = new Deck();
		a.reverse();
		System.out.println("Reverse");
		System.out.println(a);
		
		System.out.println("\n\nDeal:");
		for (int i = 1; i <= 5; i++)
		    System.out.println(a.deal());
		}

    	*/
		Deck a = new Deck();
		System.out.println("Display after DECK CONSTRUCTION \n" + a + "\n\n");
		
		a.cut();
		System.out.println("Display after CUT \n" + a + "\n\n");
		
		a.bridgeShuffle();
		System.out.println("Display after BRIDGE SHUFFLE \n" + a + "\n\n");

       }
}


package set;

public class CoinSet{

	private int theSize;

	private Coin[] coins;
	
	public CoinSet(){
		coins = new Coin[100];
		theSize=0;
	}

	public boolean add(Coin x) {
		boolean add;
		add=true;
		if(coins[x.hashCode()]!=null){
			//Check if they have the same hashes
			if(coins[x.hashCode()].hashCode()==x.hashCode()){
			//Debug to detect and collisions
			//Check if they are the same
			if(!coins[x.hashCode()].equals(x)){
				System.out.println("A Collision has been deteched between " + x + " and " + coins[x.hashCode()]);
				add=false;
			}
			}
		}
		else
			add=true;
		
		//Checks to see if that spot in the array is already taken
		if(add){
			coins[x.hashCode()]=x;
		theSize++;	
		return true;
		}
		else
			return false;
	}

	public boolean remove(Coin coin) {
		if(!contains(coin)){
			return false;
		}
		else{
			coins[coin.hashCode()]=null;
			return true;
		}
	}

	public int size() {
		return theSize;
	}
	
	public String toString(){
		String temp="";
		for(Coin a : coins){
			if(a!=null)
				temp+=a.toString() + "\n";
		}
		return temp;
	}

	public boolean contains(Coin a) {
		if(coins[a.hashCode()]!=null){
			//Debug to detect and collisions
			if(!coins[a.hashCode()].equals(a))
				System.out.println("A Collision has been deteched between " + a + " and " + coins[a.hashCode()]);
			return true;
		}
		else
			return false;
	}

	public boolean isEmpty() {
		return theSize==0;
	}
	
}

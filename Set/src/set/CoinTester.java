package set;

public class CoinTester {

	public static void main(String[] args) {
		CoinSet collection = new CoinSet();
		collection.add(new Coin(1941, "penny"));
		collection.add(new Coin(2010, "dime"));
		collection.add(new Coin(2009, "quarter"));
		collection.add(new Coin(1954, "nickel"));
		collection.add(new Coin(1987, "dime"));
		collection.add(new Coin(1949, "penny"));
		collection.add(new Coin(1982, "dime"));
		collection.add(new Coin(1955, "penny"));
		collection.add(new Coin(2002, "quarter"));
		collection.add(new Coin(2008, "quarter"));
		collection.add(new Coin(1952, "nickel"));
		collection.add(new Coin(1931, "penny"));
		collection.add(new Coin(1989, "dime"));
		System.out.println(collection);
	}

}

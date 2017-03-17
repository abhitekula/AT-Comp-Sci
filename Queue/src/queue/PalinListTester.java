package queue;

public class PalinListTester {

	public static void main(String[] args) {
		String palin="r a c e c a r";
		String two ="one two three two one";
		String three = "1 2 3 4 5 one two three four five";
		String four = "a b c d e f g x y z g f h";
		String five="racecar is racecar";
		String six="1 2 3 a b c c b a 3 2 1";
		String seven="chicken is a chicken";
		PalinList p = new PalinList(palin);
		System.out.println(p.getList() + " is a " + p.isPalin() + " palindrome.");
		PalinList a = new PalinList(two);
		System.out.println(a.getList() + " is a " + a.isPalin() + " palindrome.");
		PalinList b = new PalinList(three);
		System.out.println(b.getList() + " is a " + b.isPalin() + " palindrome.");
		PalinList c = new PalinList(four);
		System.out.println(c.getList() + " is a " + c.isPalin() + " palindrome.");
		PalinList d = new PalinList(five);
		System.out.println(d.getList() + " is a " + d.isPalin() + " palindrome.");
		PalinList e = new PalinList(six);
		System.out.println(e.getList() + " is a " + e.isPalin() + " palindrome.");
		PalinList f = new PalinList(seven);
		System.out.println(f.getList() + " is a " + f.isPalin() + " palindrome.");
		
	}

}

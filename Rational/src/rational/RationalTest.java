package rational;

import java.util.Scanner;

public class RationalTest {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//r1
		System.out.println("Input the numerator(between -20 and 20 inclusive):");
		int n=keyboard.nextInt();
		System.out.println("Input the denominator(between -20 and 20 inclusive):");
		int d=keyboard.nextInt();
		Rational r1 = new Rational(n,d);
		
		
		//r2
		System.out.println("Input the numerator(between -20 and 20 inclusive):");
		int n2=keyboard.nextInt();
		System.out.println("Input the denominator(between -20 and 20 inclusive):");
		int d2=keyboard.nextInt();
		Rational r2 = new Rational(n2,d2);
	
		Rational rSum, rDiff, rProd, rQuot, rRecip;
		System.out.println("First rational number: " + r1);
		System.out.println("Second rational number: " + r2);
		
		if (r1.equals(r2))
			System.out.println("r1 and r2 are equal.");
		else
			System.out.println("r1 and r2 are NOT equal.");
		
		if(r1.compareTo(r2)<0)
			System.out.println("r1 is less than r2.");
		else if(r1.compareTo(r2)>0)
			System.out.println("r1 is greater than r2.");
		else
			System.out.println("r1 and r2 are equal.");
		
		rRecip=r1.getReciprocal();
		System.out.println("The recipricol of r1 is: " + rRecip);
		
		rSum=r1.add(r2);
		rDiff=r1.subtract(r2);
		rProd=r1.multiply(r2);
		rQuot=r1.divide(r2);
		
		System.out.println("r1 + r2: " + rSum);
		System.out.println("r1 - r2: " + rDiff);
		System.out.println("r1 * r2: " + rProd);
		System.out.println("r1 / r2: " + rQuot);
		
		keyboard.close();
	}

}

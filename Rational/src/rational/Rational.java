package rational;

public class Rational {
	
	private int numerator;
	private int denominator;
	
	public Rational(int num, int den){
		numerator=num;
		if(den==0)
			denominator=1;
		else
			denominator=den;
		reduce();
	}
	
	public static int gcf(int num1, int num2){
		int gcf=1;
		for(int x=1;x<=num2;x++){
			if(num1%x==0 && num2%x==0 && x!=1 && num1>0 && num2>0){
				gcf=x;
			}
		}
		return gcf;
		
	}
	
	public static int lcm(int num1, int num2){
		int lcm=1;
		for(int x=1;x<=num1*num2;x++){
		if (x%num1==0 && x%num2==0){
			lcm=x;
			break;
		}
		}
		return lcm;
		
	}
	
	private void reduce(){
		int divisor=gcf(numerator,denominator);
		numerator=numerator/divisor;
		denominator=denominator/divisor;
	}
	
	public Rational reduced(){
		reduce();
		return this;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	
	public Rational getReciprocal(){
		return new Rational(denominator,numerator);
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public Rational add(Rational one){
		int denom=lcm(denominator,one.getDenominator());
		int num=(denom/denominator)*numerator;
		int numerator2=(denom/one.getDenominator())*one.getNumerator();
		num=num+numerator2;
		return new Rational(num,denom);
	}
	
	public Rational subtract(Rational one){
		int denom=lcm(denominator,one.getDenominator());
		int num=(denom/denominator)*numerator;
		int numerator2=(denom/one.getDenominator())*one.getNumerator();
		if(num>=numerator2){
			num-=numerator2;
		}
		else{
			num=numerator2-num;
		}
		return new Rational(num,denom);
	}
	
	public Rational multiply(Rational one){
		int num=numerator*one.getNumerator();
		int den=denominator*one.getDenominator();
		return (new Rational(num,den));
	}
	
	public Rational divide(Rational one){
		one=one.getReciprocal();
		int num=numerator*one.getNumerator();
		int den=denominator*one.getDenominator();
		return new Rational(num,den);
	}
	
	public boolean equals(Rational one){
		if(numerator==one.getNumerator() && denominator==one.getDenominator())
			return true;
		else
			return false;
	}
	
	public int compareTo(Rational one){
		double a = (double)numerator/denominator;
		double b = (double)one.getNumerator()/one.getDenominator();
		
		if(this.equals(one))
			return 0;
		else if(b>a)
			return 1;
		else
			return -1;
	}
	
	public String toString(){
		return "" + numerator + "/" + denominator;
	}
	
}

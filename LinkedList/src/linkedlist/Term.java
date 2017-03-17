package linkedlist;

public class Term {
	
	private int coeff;
	private int degree;
	
	
	
	public Term(int coeff, int degree) {
		this.coeff = coeff;
		this.degree = degree;
	}

	//Method to add terms assuming powers are qual
	//@param other - the othrt term
	//@return the new term after addition
	
	public Term add(Term other){
		return new Term(coeff+other.getCoeff(), degree);
	}
	
	public Term multiply(Term other){
		return new Term(coeff*other.getCoeff(), degree+other.getDegree());
	}
	
	public int getCoeff() {
		return coeff;
	}

	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}
	
	public String toString(){
		if(coeff==1)
			if(degree==1)
				return "x";
			else
				return "x^" + degree;
		else
			if(degree==1)
				return coeff + "x";
			else
				return coeff + "x^" + degree;
	}

	public static void main(String[] args){
		Term p = new Term(3,5);
		Term q = new Term(2,5);
		//Term r = new Term(4,6);
		
		System.out.println(p.add(q));
		System.out.println(p.multiply(q));
	}

}

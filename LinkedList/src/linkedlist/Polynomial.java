package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {

	private LinkedList<Term> terms;

	public Polynomial() {
		terms = new LinkedList<Term>();
	}

	public Polynomial(LinkedList<Term> terms) {
		this.terms = terms;
	}

	public void addTerm(int a, int b) {
		Term temp = new Term(a, b);
		addTerm(temp);
	}

	public void addTerm(Term a) {
		ListIterator<Term> iter = terms.listIterator();
		Term temp;
		boolean add = true;
		if (terms.size() > 0) {
			while (iter.hasNext()) {
				temp = iter.next();

				if (temp.getDegree() >= a.getDegree()) {
					if (temp.getDegree() == a.getDegree()) {
						iter.set(new Term(temp.getCoeff() + a.getCoeff(), a.getDegree()));
						add = false;
						break;
					}
					add = true;
				} else {
					// iter=terms.listIterator();
					iter.previous();
					iter.add(a);
					add = false;
					break;
				}
			}
		} else {
			iter.add(a);
			add = false;
		}

		if (add) {
			iter = terms.listIterator();
			while (iter.hasNext()) {
				iter.next();
			}
			// while(iter.hasPrevious()){
			// if(iter.previous().getDegree()<a.getDegree()){
			// break;
			// }
			// }
			iter.add(a);
		}

		// boolean go=true;
		// if(add){
		// iter=terms.listIterator();
		// if(iter.hasNext() && iter.next().getDegree()<a.getDegree()){
		// iter.previous();
		// iter.add(a);
		// }
		// else{
		// while(iter.hasNext()){
		// temp=iter.next();
		// }
		// while(iter.hasPrevious() &&
		// iter.previous().getDegree()<a.getDegree()){
		// iter.previous();
		// }
		//
		// iter.add(a);
		// }
		// }

	}

	public Polynomial derivative(Polynomial a) {
		LinkedList<Term> term = a.getTerms();
		ListIterator<Term> iter = term.listIterator();
		Term temp;
		while (iter.hasNext()) {
			temp = iter.next();
			if (temp.getDegree() - 1 >= 0)
				iter.set(new Term(temp.getCoeff() * temp.getDegree(), temp.getDegree() - 1));
			else if (temp.getDegree() == 0)
				iter.set(new Term(0, 0));
			else
				iter.set(new Term(temp.getCoeff(), 0));
		}
		return new Polynomial(term);
	}

	public Polynomial add(Polynomial a) {
		Polynomial added = new Polynomial();
		ListIterator<Term> iter = terms.listIterator();
		ListIterator<Term> iter2 = a.getTerms().listIterator();

		while (iter.hasNext()) {
			added.addTerm(iter.next());
		}

		while (iter2.hasNext()) {
			added.addTerm(iter2.next());
		}

		return added;
	}

	public Polynomial multiply(Polynomial b) {
		Polynomial multiply = new Polynomial();
		ListIterator<Term> iter = terms.listIterator();
		ListIterator<Term> iter2 = b.getTerms().listIterator();
		Term temp, temp2;

		while (iter.hasNext()) {
			temp = iter.next();
			iter2 = b.getTerms().listIterator();
			while (iter2.hasNext()) {
				temp2 = iter2.next();
				multiply.addTerm(new Term(temp.getCoeff() * temp2.getCoeff(), temp.getDegree() + temp2.getDegree()));
			}
		}

		return multiply;
	}

	public Polynomial simplify(Polynomial a) {
		LinkedList<Term> term = a.getTerms();
		LinkedList<Term> temp = new LinkedList<Term>();
		while (!term.isEmpty()) {
			temp.add(term.getFirst());
			term.removeFirst();
		}
		return new Polynomial(temp);
	}

	/*
	 * public Polynomial add(Polynomial a){ ListIterator<Term> iter =
	 * a.getTerms().listIterator(); Polynomial add = new Polynomial();
	 * while(iter.hasNext()){ add.addTerm(iter.next()); }
	 * iter=terms.listIterator(); while(iter.hasNext()){
	 * add.addTerm(iter.next()); } System.out.println(add); return
	 * Simplify(add); }
	 * 
	 * public Polynomial Simplify(Polynomial a){ //Create a new Linked List for
	 * every degree LinkedList<LinkedList<Term>> degrees = new
	 * LinkedList<LinkedList<Term>>(); LinkedList<Term> terms;
	 * ListIterator<Term> iter,temp; ListIterator<LinkedList<Term>> iter2;
	 * LinkedList<Term> term; Term one,two; one = new Term(0,0); two = new
	 * Term(0,0); boolean addnew=true; int degree=0;
	 * //while(a.getTerms().size()>0){ //System.out.println("0"); iter =
	 * a.getTerms().listIterator(); while(iter.hasNext()){
	 * System.out.println("0"); one=iter.next(); degree=one.getDegree();
	 * iter2=degrees.listIterator(); if(degrees.size()>1){
	 * while(iter2.hasNext()){ System.out.println("1"); terms=iter2.next();
	 * temp=terms.listIterator(); if(temp.hasNext()){ two=temp.next();
	 * if(two.getDegree()==degree){ System.out.println(two.getCoeff());
	 * two.setCoeff(two.getCoeff()+one.getCoeff()); iter.remove(); terms.add(new
	 * Term(two.getCoeff(),two.getDegree())); addnew=false; } }
	 * 
	 * } if(addnew){ term = new LinkedList<Term>(); term.add(new
	 * Term(two.getCoeff(),two.getDegree())); degrees.add(term);
	 * 
	 * } } else{ term = new LinkedList<Term>(); term.add(new
	 * Term(one.getCoeff(),one.getDegree())); degrees.add(term); } } //
	 * iter.remove(); //} for(LinkedList<Term> x : degrees){ for(Term y: x){
	 * System.out.print(y); } System.out.println("\n\n"); } return new
	 * Polynomial();
	 * 
	 * }
	 */
	@Override
	public String toString() {
		String poly = "";
		Term temp;
		ListIterator<Term> iter = terms.listIterator();
		if (terms.size() > 1) {
			poly += "" + iter.next();
			while (iter.hasNext()) {
				temp = iter.next();
				if (temp.getDegree() != 0 && temp.getCoeff() != 0)
					if (temp.getCoeff() < 0)
						poly += " " + temp;
					else
						poly += " + " + temp;
				else if (temp.getCoeff() != 0) {
					if (temp.getCoeff() < 0)
						poly += " " + temp.getCoeff();
					else
						poly += " + " + temp.getCoeff();
				}
			}
		} else
			poly = " " + iter.next();

		return poly;
	}

	public LinkedList<Term> getTerms() {
		return terms;
	}

	public void setTerms(LinkedList<Term> terms) {
		this.terms = terms;
	}

}

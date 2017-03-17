package set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;

import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet()
	{
		one= new HashSet<Integer>();
		two= new HashSet<Integer>();
	}

	public MathSet(String o, String t)
	{
		one= new HashSet<Integer>();
		two= new HashSet<Integer>();
		String[] on = o.split(" ");   
		String[] tw = t.split(" ");
		for(String a : on){
			 one.add(Integer.parseInt(a));
		}
		for(String a : tw){
			 two.add(Integer.parseInt(a));
		}
	}

	public Set<Integer> union()
	{
		Set<Integer> union = new HashSet<Integer>();
		for(int a : one){
			union.add(a);
		}
		for(int a : two){
			union.add(a);
		}
		return union;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> intersect = new HashSet<Integer>();
		for(int a : one){
			if(two.contains(a))
				intersect.add(a);
		}
		return intersect;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> diffAB = new HashSet<Integer>();
		for(int a : one){
			if(!two.contains(a))
				diffAB.add(a);
		}
		return diffAB;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> diffBA = new HashSet<Integer>();
		for(int a : two){
			if(!one.contains(a))
				diffBA.add(a);
		}
		return diffBA;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> symm = new HashSet<Integer>();
		for(int a : one){
			if(!two.contains(a))
				symm.add(a);
		}
		for(int a : two){
			if(!one.contains(a))
				symm.add(a);
		}
		return symm;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}
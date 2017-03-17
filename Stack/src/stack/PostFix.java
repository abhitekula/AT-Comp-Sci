package stack;

import java.util.Stack;

public class PostFix {
	
	private String exp;
	private Stack<String> symbols;
	private String operator="+-*/";
	
	public PostFix(String s) {
		exp = s;
		symbols = new Stack<String>();
	}

	public String[] splitExpression(String expression){
		String[] list = expression.split(" ");
		return list;
	}
	
	/*
	 * while there are more values in the original expression
{
   get the next value
   if the value is a number
         push the number onto the stack
   else if the value is an operator
         pop 2 numbers from the stack
         use the operator to evaluate the 2 numbers
         push the resulting number onto the stack
}
return the top value from the stack 

	 */
	
	private String solve() {
		double x,y;
		String[] list = splitExpression(exp); 
		for(String a : list){
			if(operator.indexOf(a)==-1){
				symbols.push(a);
			}
			else{
				x=Double.parseDouble(symbols.pop());
				y=Double.parseDouble(symbols.pop());
				if(a.equals("+"))
					symbols.push("" + (x+y));
				if(a.equals("-"))
					symbols.push("" + (y-x));
				if(a.equals("*"))
					symbols.push("" + (x*y));
				if(a.equals("/"))
					symbols.push("" + (y/x));
			}
		}
		return symbols.pop();
	}

	public static void main(String[] args) {
		PostFix test = new PostFix("2 7 + 1 2 + +");
		System.out.println(test.exp + " = " +test.solve());
		
		PostFix test2 = new PostFix("1 2 3 4 + + +");
		System.out.println(test2.exp + " = " +test2.solve());
		
		PostFix test3 = new PostFix("9 3 * 8 / 4 + ");
		System.out.println(test3.exp + " = " +test3.solve());
		
		PostFix test4 = new PostFix("3 3 + 7 * 9 2 / +");
		System.out.println(test4.exp + " = " +test4.solve());
		
		PostFix test5 = new PostFix("9 3 / 2 * 7 9 * + 4 -");
		System.out.println(test5.exp + " = " +test5.solve());
		
		PostFix test6 = new PostFix("5 5 + 2 * 4 / 9 +");
		System.out.println(test6.exp + " = " +test6.solve());
	}



}

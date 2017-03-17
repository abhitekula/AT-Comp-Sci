package recursive;

import java.util.*;
import static java.lang.System.*;

public class Permutation
{
	private String orig;
	private String list;

	public Permutation(String word)
	{
		orig=word;
		list="";
	}

   public void permutation()
   {
   	out.println("\nPERMUTATION OF WORD :: "+orig);
   	permutation(orig,"");
   }

	private void permutation(String orig, String sent)
	{
		if(orig.length()==sent.length()){
			System.out.println(sent);
		}
		else
			for(int x=0;x<orig.length();x++){
				if(!sent.contains("" + orig.charAt(x)))
					permutation(orig, sent +""+orig.charAt(x));
			}









	}

   public String toString()
   {
   	return list;
   }
}
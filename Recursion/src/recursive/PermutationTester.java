package recursive;

import java.util.*;
import static java.lang.System.*;

public class PermutationTester
{
   public static void main( String args[] )
   {
	   Permutation perm = new Permutation("me");
	   Permutation perm2 = new Permutation("ABC");
	   Permutation perm3 = new Permutation("abc");
	   Permutation perm4 = new Permutation("toad");
	   Permutation perm5 = new Permutation("ABCDEFG");;
	   
	   perm.permutation();
	   perm2.permutation();
	   perm3.permutation();
	   perm4.permutation(); 
	   perm5.permutation();
	}
}
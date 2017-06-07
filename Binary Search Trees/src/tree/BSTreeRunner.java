package tree;

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
 		
 		BinarySearchTree tree = new BinarySearchTree();
 		
 		tree.add(10);
 		tree.add(9);
 		tree.add(8);
 		tree.add(7);
 		tree.add(6);
 		tree.add(5);
 		tree.add(4);
 
 		//System.out.println(tree);
 		
 		System.out.println("\nPre-Order:");
 		tree.preOrder();
 		
 		System.out.println("\nPost-Order:");
 		tree.postOrder();
 		
 		System.out.println("\nIn-Order:");
 		System.out.println(tree);;
 		
 		System.out.println("\nRev-Order:");
 		tree.revOrder();
 		
 		System.out.println("\nHeight:");
 		System.out.println(tree.getHeight());
 		
 		System.out.println("\nWidth:");
 		System.out.println(tree.getWidth());
 		
 		System.out.println("\nNum Leaves:");
 		System.out.println(tree.getNumLeaves());
 		
 		System.out.println("\nNum Levels:");
 		System.out.println(tree.getNumLevels());
 		
 		System.out.println("\nNum Nodes:");
 		System.out.println(tree.getNumNodes());
 		
 		System.out.println("\nIs Full???????");
 		System.out.println(tree.isFull());
 		
 		System.out.println("\nSearch (10) :");
 		System.out.println(tree.search(10));
 		
 		System.out.println("\nMax Node:");
 		System.out.println(tree.maxNode());
 		
 		System.out.println("\nMin Node:");
 		System.out.println(tree.minNode());
 		
 		System.out.println("\nLevel Order");
// 		System.out.println(tree.levelOrder());
 		tree.levelOrder();
 		
 		System.out.println("\n\nRemove (10):");
 		tree.remove(10);
 		System.out.println(tree);
 		
 		System.out.println("\n\nRemove (9):");
 		tree.remove(9);
 		System.out.println(tree);
 		
 		System.out.println("\n\nRemove (8):");
 		tree.remove(8);
 		System.out.println(tree);
   }
}
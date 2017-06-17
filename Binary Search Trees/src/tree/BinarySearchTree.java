package tree;

import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}
	
	public TreeNode getRoot(){
		return root;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null)
			return tree = new TreeNode(val);
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		
		if(dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
		
	}

	String output;
    public String inOrder()
	{
	   	output="";
	   	System.out.println("\n");
		return inOrder(root);
	}

	private String inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			output+=tree.getValue() + " ";
			inOrder(tree.getRight());
		}
		return output;
	}
	
	public String inOrderMultiLine()
	{
	   	output="";
	   	System.out.println("\n");
		return inOrderMultiLine(root);
	}
	
	private String inOrderMultiLine(TreeNode tree)
	{
		if (tree != null){
			inOrderMultiLine(tree.getLeft());
			output+=tree.getValue() + "\n";
			inOrderMultiLine(tree.getRight());
		}
		return output;
	}

	//add preOrder, postOrder, and revOrder
	
	public void preOrder() {
		preOrder(root);
		System.out.println("\n\n");
	}

	private void preOrder(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder() {
		postOrder(root);
		System.out.println("\n\n");
	}

	private void postOrder(TreeNode tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	}

	public void revOrder() {
		revOrder(root);
		System.out.println("\n\n");
	}

	private void revOrder(TreeNode tree) {
		if (tree != null) {
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}

	
	
	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		return 1+getNumLevels(tree.getRight());
	}



	//add getNumLeaves, getWidth, getHeight, getNumNodes, and isFull
	
	public int getNumNodes(){
		return getNumNodes(root);
	}
	
	public int getNumNodes(TreeNode tree){
		if(tree==null)
			return 0;
		else
			return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight());
	}

	public int getNumLeaves() {
		return getNumLeaves(root);
	}

	private int getNumLeaves(TreeNode tree) {
		if (tree != null) {
			if (tree.getLeft() == null && tree.getRight() == null)
				return 1;	
			return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());
		}
		return 0;
	}

	int count;
	public int getHeight() {
		count=0;
		return getHeight(root);
	}

	private int getHeight(TreeNode tree) {
		while(tree.getLeft()!=null){
			tree=tree.getLeft();
			count++;
		}
		return count;
	}

	public int getWidth() {
		return getNumLevels(root.getLeft()) + getNumLevels(root.getRight()) + 1;
	}

	public boolean isFull() {
		return isFull(root);
	}

	private boolean isFull(TreeNode tree) {
		if(getNumNodes()==Math.pow(2, getNumLevels())-1)
			return true;
		return false;
	}

	
	public boolean search(Comparable x) {
		return search(x, root);
	}
	
	//search
	private boolean search(Comparable x, TreeNode tree) {
		if(root.getValue().equals(x))
			return true;
		if (tree != null){
			if ((tree.getLeft() != null && tree.getLeft().getValue().equals(x)) || (tree.getRight() != null && tree.getRight().getValue().equals(x)))
				return true;
			return search(x, tree.getLeft()) || search(x, tree.getRight());
		}
		return false;
	}

	
	//maxNode
	
	public Comparable maxNode() {
		return maxNode(root);
	}

	public Comparable maxNode(TreeNode tree) {
		Comparable max=root.getValue();
		while(tree.getRight()!=null)
			tree=tree.getRight();
		if(tree.getValue().compareTo(root.getValue())<1)
			return tree.getValue();
		else
			return root.getValue();
	}
	
	//minNode
	
	public Comparable minNode() {
		return minNode(root);
	}
	
	public Comparable minNode(TreeNode tree) {
		while(tree.getLeft()!=null)
			tree=tree.getLeft();
		if(tree.getValue().compareTo(root.getValue())<1)
			return tree.getValue();
		else
			return root.getValue();
	}
	
	//level order
	
	LinkedList<TreeNode> list;
	public void levelOrder(){
		list = new LinkedList<TreeNode>();
		levelOrder(root);
	}
	
	
	public void levelOrder(TreeNode tree) {
		if (tree != null) {
			list.add(tree);
			System.out.print(tree.getValue() + " ");
			levelOrder(tree.getLeft());
			levelOrder(tree.getRight());
		}
		//System.out.println(list);
	}
	
	//display like a tree
	
	//remove

	BinarySearchTree a;
	public void remove(Comparable x){
		a = null;
		a = new BinarySearchTree();
		remove(x,root);
	}
	
	public void remove(Comparable x, TreeNode tree) {
		if(tree!=null){
			if(!tree.getValue().equals(x))
				a.add(tree.getValue());
			remove(x, tree.getLeft());
			remove(x, tree.getRight());
		}
		else
			this.root = a.getRoot();
	}

	public String toString()
	{
		return inOrder();
	}

	public String toString(TreeNode tree)
	{
		return "";
	}
}
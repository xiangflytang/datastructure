package com.tree;



public class LearnBST {
	
	
	private void inOrderHelper(Node r){
		if(r!=null){
			inOrderHelper(r.left);
			System.out.println(r +" ");
			inOrderHelper(r.right);
		}
		
	}
	/*****************************************************
	*
	*            the Node class
	*
	******************************************************/

	  private class Node<T>
	  {
	     private T data;
	     private Node<T> left, right;

	     public Node(T data, Node<T> l, Node<T> r)
	     {
	        left = l; right = r;
	        this.data = data;
	     }

	     public Node(T data)
	     {
	        this(data, null, null);
	     }

	     public String toString()
	     {
	        return data.toString();
	     }
	  } //end of Node
}

package com.list;

import java.util.NoSuchElementException;

public class LearnLinkedList<AnyType> {
	private Node<AnyType>head;
	private static class Node<AnyType>
	{
		private AnyType data;
		private Node<AnyType>next;
		public Node(AnyType data,Node<AnyType>next){
		this.data=data;
		this.next=next;
	}
	}
	public void addFirst(AnyType item){
		head =new Node<AnyType>(item, head);
	}
	 public AnyType getFirst()
	   {
	      if(head == null) throw new NoSuchElementException();

	      return head.data;
	   }
	 public void remove (AnyType key){
		 if(head==null){
			 throw new RuntimeException("can not delete");
	 	}
	 	if(head.data.equals(key))
	 	{
	 		head=head.next;
	 		return ;
	 	}
	 	Node<AnyType>cur=head;
	 	Node<AnyType>prev=null;
	 	while(cur!=null &&!cur.data.equals(key)){
	 		prev=cur;
	 		cur=cur.next;
	 	}
	 	if(cur==null)
	 		throw new RuntimeException("can not delet");
	 	//delete cur node
	 	prev.next=cur.next;
	 
}
}
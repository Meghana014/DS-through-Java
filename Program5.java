package com.ks.one;

import java.util.*;

//Write a class for stack in Java. The class should have the methods, push(),pop(),isEmpty().
//Use a linked(singly) representation for the stack. Write a Java program that reads a list of integers, 
//uses the above stack methods and displays list of integers in reverse order.
public class Program5 {
	
		class Node
		{
			int data;
			Node next;
		
	    public Node(int data) {
			this.data=data;
			this.next=null;
		  }
	    }
		public Node top=null;
		public Node head=null;
		public void push(int data)
		{
			Node new_node=new Node(data);
			if (isempty())
				{
				   head=new_node;
				   top=new_node;
				}
			else
			{
			  top.next=new_node;
			  top=new_node;
			}
		}
		
		public int peek()
		{
			if(!isempty())
				return top.data;
			else
				System.out.println("stack is empty!!");
			    return -1;
		}
		
		public void pop()
		{
			if(isempty())
				System.out.println("empty stack!!");
			else
			{
				Node p=head;
				Node c=head.next;
				while(c.next!=null)
				{
					p=p.next;
					c=c.next;
				}
				int elem=p.next.data;
				p.next=null;
				top=p;
				System.out.println("popped element is: "+elem);
			}
		}
		
		public boolean isempty()
		{
			if(head==null) 
				return true;
			else 
				return false;		
		}
	
		
		public void display()
		{
			if(isempty())
			{
				System.out.print("empty stack!!");
			}
			else
			{
				Node temp=head;
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
					
				}
			}
			System.out.println();
		}
		
		public Node reverse(Node data)
		{
			if(isempty()) System.out.println("stack is empty!!");
			Node current=data;
			Node prev=null;
			Node next=null;
			while(current!=null)
			{
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			return prev; 
		}
		
		public void revdisplay()
		{
			if(head==null) System.out.println("empty stack!!");
			else
			{
				Node temp=reverse(head);
				while(temp!=null)
				{
					System.out.print(temp.data+" ");
					temp=temp.next;
				}
			}
		}
		public static void main(String[] args) {
			Program5 p=new Program5();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size: ");
			int n=sc.nextInt();
			System.out.println("enter stack elements: ");
			for(int i=1;i<=n;i++)
			{
				int data=sc.nextInt();
				p.push(data);
			}
			p.display();
			p.pop();
			p.display();
			System.out.println("after peek the element is: "+p.peek());
			p.display();
			System.out.println("the stack is empty:"+p.isempty());
			System.out.println("reverse display of stack is: ");
			p.revdisplay();
		}
}

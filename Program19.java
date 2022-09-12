package com.ks.one;
import java.util.*;
//Write a class for stack in Java. The class should have the methods, push(),pop(),isEmpty().Use a linked(doubly)
//representation for the stack. Write a Java program that reads a list of integers, uses the above stack methods 
//and displays list of integers in reverse order.
public class Program19 {
	class Node
	{
		int data;
		Node prev;
		Node next;
	  public Node(int data)
	  {
		  this.data=data;
		  this.next=null;
		  this.prev=null;
	  }
	}
	public Node head=null;
	public Node top=null;
	public void push(int data)
	{
		Node new_node=new Node(data);
		if(isempty())
		{
			head=new_node;
			top=new_node;
		}
		else
		{
			top.next=new_node;
			new_node.prev=top;
			top=new_node;
		}
	}
	public void  pop()
	{  int elem=0;
		if(isempty())
		{
			System.out.println("stack is empty!!popping is not possible");

		}
		else
		{
			elem=top.data;
			top=top.prev;
			top.next=null;
			System.out.println("popped element is: "+elem);
		}
	}
	public int peek()
	{
	    if(!isempty()) 
	    	return top.data;
	    else return -1;
	}
	public boolean isempty()
	{
		if(head==null) return true;
		else return false;
	}
	public void display()
	{
		if(isempty()) System.out.println("empty stack!!");
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

public static void main(String[] args) 
{
	Program19 p=new Program19();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of the stack: ");
	int n=sc.nextInt();
	System.out.println("the stack is empty: "+p.isempty());
	System.out.println("enter stack elements: ");
	for(int i=1;i<=n;i++)
	{
		int elem=sc.nextInt();
		p.push(elem);
	}
	p.display();
	System.out.println("after pushing elements the stack is empty: "+p.isempty());
	p.pop();
	System.out.println("after popping the stack elements are: ");
	p.display();
	System.out.println("peek element is: "+p.peek());
	System.out.println("after peeking of top element the stack is: ");
	p.display();
}
}

package com.ks.one;

import java.util.Scanner;

//Write a class for deque(double ended queue) in Java. The class should have the methods, enquefirst(),dequefirst(),
//isEmpty(),enquelast(), and dequelast(). Use a linked(doubly) representation for the queue. Write a Java program 
//that reads a list of integers, uses the above deque methods and displays results.
public class Program18 {
 class Node
   {
	 int data;
		Node next;
		Node prev;
	  public Node(int data)
	  {
		this.data=data;
		this.next=null;
		this.prev=null;
	  }
   }
    public Node front=null;
 	public Node rear=null;
 	public boolean isempty()
 	{
 		if(front==null) return true;
 		else return false;
 	}
 	public void enqueuefirst(int data)
 	{
 		Node new_node=new Node(data);
 		if(isempty())
 		{
 			front=new_node;
 			rear=new_node;
 		}
 		else
 		{
 			new_node.next=front;
 			front.prev=new_node;
 			front=new_node;
 		}
 	}
 	public void enquelast(int data)
 	{   Node new_node=new Node(data);
 		if(isempty())
 		{
 			front=new_node;
 			rear=new_node;
 		}
 		else
 		{
 			rear.next=new_node;
 			new_node.prev=rear;
 			rear=new_node;
 		}
 	}
 	public void dequeuefirst()
 	{
 		if(isempty()) System.out.println("empty dequeue!!");
 		else front=front.next;
 	}
 	public void dequeuelast()
 	{
 		if(isempty()) System.out.println("empty dequeue!!");
 		else
 		{
 			rear=rear.prev;
 			rear.next=null;
 		}
 	}
 	public void display()
 	{
 		if(isempty())
 			{
 			System.out.println("empty dequeue!!"); 
 			return;
 			}
 		else
 		{
 		  Node temp=front;
 		  while(temp!=null)
 		   {
 			System.out.print(temp.data+"->");
 		   }
 		}
 		System.out.print("none");
 		System.out.println();
 	}
 	public static void main(String[] args) {
   	 Program17 deque=new Program17();
   	 Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the queue: ");
		int n=sc.nextInt();
		System.out.println("enter the elements to be enqueue last: ");
		for(int i=0;i<n;i++)
		{
			int elem=sc.nextInt();
			deque.enqueuelast(elem);
		}
		System.out.println("after inserting the rear elements the queue is: ");
		deque.display();
		System.out.println("enter the elements to be enqueue first: ");
    
		for(int i=0;i<n;i++)
		{
			int elem=sc.nextInt();
			deque.enqueuefirst(elem);
		}
		System.out.println("after inserting the front element the queue is: ");
		deque.display();
		deque.dequeuefirst();
		System.out.println("after deleting the front element the queue is: ");
		deque.display();
		deque.dequeuelast();
		System.out.println("after deleting the rear element the queue is: ");
		deque.display();
		System.out.println(deque.isempty());
}
}

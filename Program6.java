package com.ks.one;
import java.util.*;
//Write a class for queue in Java. The class should have the methods, enqueue(),dequeue(),isEmpty().Use a linked(singly) representation 
//for the queue. Write a Java program that reads a list of integers, uses the above queue methods and
//displays list of integers in same order(FIFO).
public class Program6
{
    class Node
    {
    	int data;
    	Node next;
      public Node(int data)
        {
    	this.data=data;
    	this.next=null;
        }
    }
    public Node front=null;
    public Node rear=null;
    public void enqueue(int data)
    {
    	Node new_node= new Node(data);
    	if(front==null)
    	{
    		front=new_node;
    		rear=new_node;
    	}
    	else
    	{
    		rear.next=new_node;
    		rear=new_node;
    	}	
    }
    public void dequeue()
    {
    	if(front==null) System.out.println("empty queue!!unable to perform dequeuing...");
    	else front=front.next;
    }
    public void isempty()
    {
    	if(front==null) System.out.println("queue is empty..!!");
    	else System.out.println("now queue not empty..");
    }
    public void display()
    {
    	if(front==null) System.out.println("empty!!!");
    	else
    	{
    		Node temp=front;
    		while(temp!=null)
    		{
    			System.out.print(temp.data+"->");
    			temp=temp.next;
    		}
    		System.out.println("none");
    	}
    }
    public static void main(String[] args) {
		Program6 p=new Program6();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		int[] a=new int[20];
		p.isempty();
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			p.enqueue(a[i]);
		}
		p.display();
		p.dequeue();
	    p.display();
	    p.isempty();
		
	}
    
     
    
    	
}

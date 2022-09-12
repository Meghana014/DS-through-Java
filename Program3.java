package com.ks.one;
import java.util.*;
//Write a Java program to perform the following operations:
//a)create a singly linked list of integers.
//b)traverse the above list and display its contents.
//c)delete an integer from the above list and display the contents of the list after deletion.
public class Program3 {
	class Node
	{
		int data;
		Node next;
	
    public Node(int data) {
		this.data=data;
		this.next=null;
	  }
     }
	public Node head=null;
	public Node tail=null;
    public void create(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			tail=newnode;
		}
	 }
    public void delete(int elem)
    {
    	if(head==null)
    	{
    		System.out.println("empty list!!");
    	}
    	else if(head.data==elem)
    	{
    		head=head.next;
    		System.out.println("after deletion of required element the list is: ");
    	}
    	else if(tail.data==elem)
    	{
    		Node p=head;
    		Node c=head.next;
    		while(c.next!=null)
    		{
    			c=c.next;
    			p=p.next;
    	    }
    		p.next=null;
    		tail=p;
    	}
    	else
    	{
    	 Node temp=head;
    	 while(temp.next!=null)
    	 {
    		 if(temp.next.data==elem)
    		 {
    			 temp.next=temp.next.next;
    			 break;
    		 }
    		 temp=temp.next;
    	 }
    	 if(temp.next==null) System.out.println("required element is not present in the list!!"); 
    	}
    }
     public void display()
        {
	      Node current=head;
	      if(head==null)
	        {
		      System.out.println("empty list");
		      return;
	        }
	       System.out.println("nodes of singly linked list is: ");
	        while(current!=null)
	        {
		     System.out.print(current.data+"->");
		     current=current.next;
	        }
            System.out.println("None");
          }
	
	public static void main(String[] args) {
		Program3 p=new Program3();
		//int[] a=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of list: ");
		int n=sc.nextInt();
		System.out.println("enter the elements: ");
		for(int i=0;i<n;i++)
		{ 
			int ele=sc.nextInt();
			p.create(ele);
		}
		p.display();
		System.out.println("enter an element to be deleted: ");
		int elem=sc.nextInt();
		p.delete(elem);
		p.display();
	}

}

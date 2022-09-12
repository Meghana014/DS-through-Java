package com.ks.one;
//Write a Java program to perform the following operations:
//a)create a doubly linked list of integers.
//b)traverse the above list and display its contents.
//c)delete an integer from the above list and display the contents of the list after deletion.
import java.util.Scanner;

public class Program13 {
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
	public Node head=null;
	public Node tail=null;
	public void create(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			tail=new_node;
		}
		else
		{
			tail.next=new_node;
			new_node.prev=tail;
			tail=new_node;
		}
	}
	public void delete(int key)
	{
		if(head==null) System.out.println("empty..deletion is not possible!!");
		else if(key==head.data)
		{
			head=head.next;
			head.prev=null;
			System.out.println("after deletion the required element,the list is: ");
		}
		else if(key==tail.data)
		{
			tail=tail.prev;
			tail.next=null;
			System.out.println("after deletion the required element,the list is: ");
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				if(temp.next.data==key)
				{
					temp.next.next.prev=temp;
					temp.next=temp.next.next;
					break;
				}
				temp=temp.next;	
			}
			if(temp.next==null) System.out.println("element to be deleted is not present..");
			else System.out.println("after deletion of required element the list is: ");
		}
		
	}
	public void display()
	{
		if(head==null) System.out.println("empty list!!");
		else
		{
		  Node temp=head;
		  while(temp!=null)
		  {
			  System.out.print(temp.data+" ");
			  temp=temp.next;
		  }
		}
	}
	public static void main(String[] args) {
		Program13 p=new Program13();
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

package com.ks.one;
import java.util.*;

//Write a class for queue in Java. The class should have the methods, enqueue(),dequeue(),isEmpty(), isFull().
//Use a an array representation for the queue. Write a Java program that reads a list of integers,
//uses the above queue methods and displays list of integers in (FIFO)same order.
public class Program7 {
	int rear=-1,front=0,maxsize=6;
	int[] a=new int[maxsize];
	 
	public boolean isEmpty()
	{
		if(rear==-1) return true;
		else return false;
	}
	
	public boolean isFull()
	{
		if(rear==maxsize-1)
			return true;
		else
		  return false;
	}
	
	public void enqueue(int ele)
	{
		if(isFull())
			System.out.println("queue full!!");
		else
		{
			if(front==-1 && rear==-1)
			{
				front=0;
				rear=0;
				a[rear]=ele;
			}
			else
			{
			rear++;
			a[rear]=ele;
			}  
		}
		
	 }
	 
	public void dequeue()
	{
		if(rear==-1)
			System.out.println("empty stack so unable to perform popping!!");
		else
		{
			int elem=a[front];
			a[front]=a[front++];
			System.out.println("popped element is: "+elem);
		}
	}
	
	public void display()
	{
		System.out.println("queue elements are: ");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		Program7 p=new Program7();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter your choice:   1.enqueue   2.dequeue  3.isempty   4.isfull   5.exit");
		int choice=sc.nextInt();
		 if(choice==1)
			{ System.out.println("enter the element to be enqueued: ");
			   for(int i=0;i<6;i++)
			   {
				   int ele=sc.nextInt();
				   p.enqueue(ele);
			   }
			   p.display();
			
			}
			else if(choice==2)
			{
				p.dequeue();
				System.out.println("after dequeuing: ");
				p.display();
			}
			else if(choice==3)
				System.out.println(p.isEmpty());
			else if(choice==4)
				System.out.println(p.isFull());
			else if(choice==5)
				break;
			else
			{
				System.out.println("enter correct option");
			}
		}
	}
}

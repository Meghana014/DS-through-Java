package com.ks.one;

import java.util.Scanner;

public class Program24 {
	int rear=-1;
	int front=-1;
	int maxsize=7;
	int[] a=new int[maxsize];
	
	public boolean isempty()
	{
		if(front==-1 && rear==-1) return true;
		else return false;
	}
	
	public boolean isFull()
	{
		if(front==(rear+1)%maxsize)
			return true;
		else
		  return false;
	}
	
	public void enqueue(int elem)
	{
		if(isFull()) System.out.println("queue is full!!");
		else
		{
			if(front==-1 && rear==-1)
			{
				front=0;
				rear=0;
				a[rear]=elem;
			}
			else
			{
				rear=(rear+1)%maxsize;
				a[rear]=elem;
			}
		}
	}
	
	public void dequeue()
	{
		if(isempty()) System.out.println("queue is empty!!");
		else if(front==rear)
		{
			 front=-1;
			 rear=-1;
			 System.out.println("queue is empty!!");
		}
		else
		{
			int elem=a[front];
			front=(front+1)%maxsize;
			System.out.println("dequeued element is: "+elem);
		}
	}
	
	public void display()
	{
		if(isempty()) System.out.println("empty queue!!");
		else
		{ int i;
			for(i=front;i!=rear;i=(i+1)%maxsize)
			{
				System.out.print(a[i]+" ");
			}
			System.out.print(a[i]);
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		Program24 p=new Program24();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter your choice:   1.enqueue   2.dequeue  3.isempty   4.isfull   5.exit");
		int choice=sc.nextInt();
		 if(choice==1)
			{ System.out.println("enter the element to be enqueued: ");
			   for(int i=0;i<7;i++)
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
				System.out.println(p.isempty());
			else if(choice==4)
				System.out.println(p.isFull());
			else if(choice==5)
				break;
			else
				System.out.println("enter correct option");
		
		}
   }


}
	



package com.ks.one;
import java.util.*;
/*Write a class for stack in Java. The class should have the methods, push(),pop(),isEmpty(),isFull().
Use an array representation for the stack. Write a Java program that reads a list of integers, uses the above stack
methods and displays list of integers in reverse order.*/
class Stack
{
	
	int top=-1,maxsize=6;
	int[] a=new int[maxsize];
	 
	public boolean isEmpty()
	{
		if(top==-1) return true;
		else  return false;
	}
	
	public boolean isFull()
	{
		if(top==maxsize-1)
			return true;
		else
		  return false;
	}
	
	public void push(int ele)
	{
		if(isFull())
			System.out.println("stack full!!");
		else
		{
			top++;
			a[top]=ele;
		}
		
	 }
	 
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("empty stack so unable to perform popping!!");
		   return -1;
		}
		else
		{
			int elem=a[top];
			top--;
			return elem;
		}
	}
	
	public void display()
	{
		System.out.println("stack elements are: ");
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
}
public class Program4 {
	public static void main(String[] args) {
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter your choice:   1.push   2.pop   3.isempty   4.isfull   5.exit");
		int choice=sc.nextInt();
		 if(choice==1)
			{
			   for(int i=0;i<6;i++)
			   {
				   System.out.println("enter the element to be pushed: ");
				   int ele=sc.nextInt();
				   s.push(ele);
			   }
			   s.display();
			
			}
			else if(choice==2)
			{
				System.out.println("popped element is: "+s.pop());
				System.out.println("after popping: ");
				s.display();
			}
			else if(choice==3)
				System.out.println(s.isEmpty());
			else if(choice==4)
				System.out.println(s.isFull());
			else if(choice==5)
				break;
			else
			{
				System.out.println("enter correct option");
			}
		}
	}

}

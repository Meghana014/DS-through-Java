package com.ks.one;


import java.util.*;

public class Program_16 {
	
	public static int inputprecedence(char symbol)
	{
		if(symbol=='+' || symbol=='-') return 1;
		else if(symbol=='*' || symbol=='/') return 3;
		else if(symbol=='^') return 6;
		else if(symbol=='(') return 9;
		else if(symbol==')') return 0;
		else return 7;
	}
	
	public static int stackprecedence(char symbol)
	{
		if(symbol=='+' || symbol=='-') return 2;
		else if(symbol=='*' || symbol=='/') return 4;
		else if(symbol=='^') return 5;
		else if(symbol=='(') return 0;
		else if(symbol==')') return 0;
		else return 8;
		
	}
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter the infix expression with adding ')' and  '#' at the end ");
        	String infix=sc.next();
        	int n=infix.length();
        	char postfix[]=new char[n];
        	stack1 s=new stack1(n);
        	s.push('(');
        	int i=0;
        	int j=0;
        	char next=infix.charAt(i);
        	while(next!='#')
        	{
        		while(inputprecedence(next)<stackprecedence(s.arr[s.top]))
        		{
        			char temp=s.pop();
        			postfix[j]=temp;
        			j++;
        		}
        		if(inputprecedence(next)>stackprecedence(s.arr[s.top]))
        		{
        			s.push(next);
        		}
        		else
        		{
        			char k=s.pop();
        		}
        		i++;
        		next=infix.charAt(i);
        	}
        	String result=new String(postfix);
        	if(s.isempty())
        	{
        		System.out.println(result);
        	}
        	else
        	{
        		System.out.println("invalid infix!!");
        	}
		}       
}
class stack1
{
	int size=0;
	int top=-1;
	char arr[];
	stack1(int val)
	{
		size=val;
		arr=new char[size];	
	}
	public boolean isempty()
	{
		if(top==-1) return true;
		else return false;
	}
	public void push(char elem)
	{
		if(top==size-1)
		{
			System.out.println("stack full");
		}
		else
		{
			top+=1;
			arr[top]=elem;
		}
	}
	public char pop()
	{
		if(isempty())
		{
			System.out.println("stack is empty!!");
			return '$';
		}
		else
		{
			char elem=arr[top];
			top-=1;
			return elem;
		}
	}
}


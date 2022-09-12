package com.ks.one;
import java.util.*;
//Write a Java program to perform the following:
//i)Sort a list of integers in ascending order using Bubble sort.
//ii)Then searches for a key value(integer) recursively in the above sorted list using Binary search.
public class Program11 {
	public static void Bubblesort(int[] a,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static int rbinary(int[] a,int lb,int ub,int key)
	{  int mid=0;
		if(lb<=ub)
		{
			mid=(lb+ub)/2;
			if(key==a[mid]) System.out.print("the position of required element is: "+mid);
			else if(key<=a[mid]) return rbinary(a,lb,mid-1,key);
			else if(key>=a[mid]) return rbinary(a,mid+1,ub,key);
		}
		else 
		{
			System.out.println("element is not present!!!");
		}
		
		return mid;
		
		
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of list: ");
	int n=sc.nextInt();
	int[] a=new int[100];
	System.out.println("enter the elements: ");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("unsorted list is: ");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	Bubblesort(a,n);
	System.out.println("sorted list is: ");
	for(int i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println("enter an element to be searched: ");
	int key=sc.nextInt();
	
   rbinary(a,0,n-1,key);
}
}

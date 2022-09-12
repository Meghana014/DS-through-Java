package com.ks.one;
import java.util.*;
//Write a Java program to perform the following:
//i)Sort a list of names in ascending order using Insertion sort.
//ii)Then searches for a key value(name) non recursively in the above sorted list using Binary search.
public class Program22 {
	public static void insertionsort(String[] a,int n)
	{
		for(int i=1;i<n;i++)
		{
			String temp=a[i];
			int j=i-1;
			while(j>=0 && a[j].compareTo(temp)>0)
			{
			       a[j+1]=a[j];
			       j=j-1;
			 }
			 a[j+1]=temp;
		}
	}
	public static void Bsearch(String[] a,int lb,int ub,String k)
	{  try
	  {
		while(lb<=ub)
		{   
			int mid=(lb+ub)/2;
			if(a[mid].compareTo(k)==0)
			{
				System.out.println("position of required element is: "+mid);
				break;
			}
			else if(a[mid].compareTo(k)>0) ub=mid-1;
			else lb=mid+1;
		}
	  }
	  catch(Exception e)
	    {
		System.out.println("element not present!!");
	    }
	
			
	}
		
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,i;
	System.out.println("enter the size of list: ");
	n=sc.nextInt();
	
	String[] a=new String[n];
	System.out.println("enter the elements: ");
	for(i=0;i<n;i++)
	{
		a[i]=sc.next();
	}
	System.out.println("before sorting elements are: ");
	for(i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	insertionsort(a,n);
	System.out.println("after sorting elements are: ");
	for(i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println("enter the key to be searched");
	String key=sc.next();
	Bsearch(a,0,n-1,key);
}
}

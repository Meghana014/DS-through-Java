package com.ks.one;
import java.util.*;
//Write a Java program to perform the following:
//i)Sort a list of integers in ascending order using Insertion sort.
//ii)Then searches for a key value(integer) recursively in the above sorted list using Binary search.
public class Program12 {
	public static void insertionsort(int[] a,int n)
	{
		for(int i=1;i<n;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
			       a[j+1]=a[j];
			       j=j-1;
			 }
			 a[j+1]=temp;
		}
	}
	public static int Bsearch(int[] a,int lb,int ub,int k)
	{  int mid=0;
		if(lb<=ub)
		{   
			 mid=(lb+ub)/2;
			if(a[mid]==k)
				return mid;
			else if(a[mid]>k)
				return Bsearch(a,lb,mid-1,k);
			return Bsearch(a,mid+1,ub,k);
		}
		else System.out.println("element not present!!");
		return mid;
		
				
	}
		
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,i;
	System.out.println("enter the size of list: ");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the elements: ");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
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
	int key=sc.nextInt();
	System.out.println(Bsearch(a,0,n-1,key));
}
}

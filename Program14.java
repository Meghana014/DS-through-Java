package com.ks.one;
import java.util.*;
//Write a Java program to perform the following:
//i)Sort a list of integers in ascending order using Selection sort.
//ii)Then searches for a key value(integer) recursively in the above sorted list using Binary search.
public class Program14 {
	public static void selectionsort(int[] a,int n)
	{   int i,j;
		for(i=0;i<n-1;i++)
		{  
			int minindex=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[minindex])
					minindex=j;
			}
			if(minindex!=i)
			{
			int temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;	
			}
		}
	}
	
	public static int Bsearch(int[] a,int lb,int ub,int k)
	{  
		if(lb<=ub)
		{   
			int mid=(lb+ub)/2;
			if(a[mid]==k)
				return mid;
			else if(a[mid]>k)
				return Bsearch(a,lb,mid-1,k);
			return Bsearch(a,mid+1,ub,k);
		}
		else return -1;
				
	}
	
	public static void main(String[] args) {
		
		int i,n;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the size of the list: ");
	     n=sc.nextInt();
	     int[] a=new int[20];
	     System.out.println("enter the elements: ");
	     for(i=0;i<n;i++)
	     {
	    	  a[i]=sc.nextInt();
	     }
	     System.out.println("unsorted list is: ");
	     for(i=0;i<n;i++)
	     {
	    	 System.out.print(a[i]+" ");
	     }
	     selectionsort(a,n);
	     System.out.println("sorted list is: ");
	     for(i=0;i<n;i++)
	     {
	    	 System.out.print(a[i]+" ");
	     }
	     System.out.println("enter a key to be searched: ");
	     int key=sc.nextInt();
	     System.out.println(Bsearch(a,0,n-1,key));
	}
}

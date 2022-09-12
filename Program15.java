package com.ks.one;
import java.util.*;
//Write a Java program to perform the following:
//i)Sort a list of integers in ascending order using Selection sort.
//ii)Then searches for a key value(integer) non recursively in the above sorted list using Binary search.
public class Program15 {
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
			int temp=a[i];
			a[i]=a[minindex];
			a[minindex]=temp;	
		}
	}
	public  void Bsearch(int[] a,int lb,int ub,int k)
	{
		  while(lb<=ub)
		  {
			int mid=(lb+ub)/2;
			if(k==a[mid])
			{
				System.out.println("the location of required element is: "+mid);
				break;
			}
			else if(k<a[mid]) ub=mid-1;
			else lb=mid+1;
		  }
		
	}
public static void main(String[] args) {
		Program15 p=new Program15();
		int i,n;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the size of the list: ");
	     n=sc.nextInt();
	     int[] a=new int[20];
	     int lb=0;
	     int ub=n;
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
	     p.Bsearch(a,lb,ub,key);
	}
}

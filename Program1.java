package com.ks.one;
import java.util.*;
//Write a Java program to perform the following:
//i)Sort a list of integers in ascending order using Bubble sort.
//ii)Then searches for a key value(integer) non recursively in the above sorted list
//using Binary search.
public class Program1 {
	public void Bubble(int[] a,int n)
	{ int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
	}
public void Bsearch(int[] a,int lb,int ub,int k)
{
	while(lb<ub)
	{
		int mid=(lb+ub)/2;
		if(k==a[mid])
		{
			System.out.println("the location of required element is: "+mid);
			break;
		}
		else if(k<a[mid])
		{
			ub=mid-1;
		}
		else
		{
			lb=mid+1;
		}
	}
	
}
	
public static void main(String[] args) {
		Program1 p=new Program1();
		Scanner sc=new Scanner(System.in);
		int i;
		int[] a=new int[20];
		System.out.println("enter the number of values: ");
		int n=sc.nextInt();
		System.out.println("enter the elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("unsorted array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		p.Bubble(a,n);
		System.out.println("sorted array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("enter the key to be searched: ");
		int key=sc.nextInt();
		p.Bsearch(a,0,n-1,key);
    }
      
}

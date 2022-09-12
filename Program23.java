package com.ks.one;
import java.util.*;
//Write a Java program that implements quick sort for sorting a list of names in ascending order.
public class Program23 {
	public static void qsort(String[] a,int lb,int ub)
	{
		if(lb<ub)
		{
			
			int pos = partition(a,lb,ub);
			qsort(a,lb,pos-1);
			qsort(a,pos+1,ub);
		}
	}
	
	public static int partition(String[] a,int lb,int ub)
	{
		int i=lb;
		int j=ub;
		String pivot=a[lb];
		while(i<j)
		{
			while((i<j)&&(a[i].compareTo(pivot))<=0)
				i=i+1;
			while(a[j].compareTo(pivot)>0)
				j=j-1;
			if(i<j)
			{
				String t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		a[lb]=a[j];
		a[j]=pivot;
		return j;
		
	}
	public static void main(String[] args)
	{
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		int n=sc.nextInt();
		String[] a=new String[20];
		System.out.println("enter the elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.next();		
		}
		System.out.println("unsorted elements are: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		qsort(a,0,n-1);
		System.out.println("after quick sort,elements are: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

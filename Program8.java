package com.ks.one;
import java.util.*;
//Write a Java program that implements quick sort for sorting a list of integers in ascending order.
public class Program8 {
	
		public static void qsort(int[] a,int lb,int ub)
		{
			if(lb<ub)
			{
				
				int pos = partition(a,lb,ub);
				qsort(a,lb,pos-1);
				qsort(a,pos+1,ub);
			}
		}
		
		public static int partition(int[] a,int lb,int ub)
		{
			int i=lb;
			int j=ub;
			int pivot=a[lb];
			while(i<j)
			{
				while((i<j)&&(a[i]<=pivot))
					i=i+1;
				while(a[j]>pivot)
					j=j-1;
				if(i<j)
				{
					int t=a[i];
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
			int[] a=new int[20];
			System.out.println("enter the elements: ");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();		
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



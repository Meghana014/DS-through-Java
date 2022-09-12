package com.ks.one;
import java.util.*;
//Write a Java program that implements merge sort for sorting a list of integers in ascending order.
public class Program9 {
	
		public static void msort(int[] a,int lb,int ub)
		{ 
			if(lb<ub)
			{
				int mid=(lb+ub)/2;
				msort(a,lb,mid);
				msort(a,mid+1,ub);
				merge(a,lb,mid,ub);
			} 
		}
		
		public static void merge(int[] a,int lb,int mid,int ub)
		{    int[] c=new int[1000];
			int i=lb;
			int j=mid+1;
			int k=lb;
			while((i<mid)&&(j<ub))
			{
				if(a[i]<a[j])
				{
					c[k]=a[i];
					i++;
					k++;
				}
				else
				{
					c[k]=a[j];
					j++;
					k++;
				}
			}
			while(i<mid)
			{
				c[k]=a[i];
				i++;
				k++;
			}
			while(j<ub)
			{
				c[k]=a[j];
				j++;
				k++;
			}
			
	}
		
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int i;
			System.out.println("enter the size of list: ");
			int n=sc.nextInt();
			System.out.println("enter the elements: ");
			int lb=0;
			int ub=n;
			int[] a=new int[100];
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("unsorted elements are: ");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			msort(a,lb,ub);
			System.out.println("sorted list is: ");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
		}

	}



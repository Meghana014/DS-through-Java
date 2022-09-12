package com.ks.one;
//Write a Java program to perform the following:
//i)Sort a list of integers in ascending order using Insertion sort.
//ii)Then searches for a key value(integer) non recursively in the above sorted list using Binary search.
import java.util.*;
public class Program2 {
public void insertionsort(int[] a,int n)
	{
		int i,j;
		for(i=1;i<n;i++)
		{
			int temp=a[i];
			j=i-1;
			while((j>=0)&&temp<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			   a[j+1]=temp;
		}
		
	}
public void binarysearch(int[] a,int lb,int ub,int key)
{
	while(lb<=ub)
	{
		int mid=(lb+ub)/2;
		if(key==a[mid]) 
			{
			System.out.println("the location of element is: "+mid);
			break;
			}
			
		else if (key<a[mid]) ub=mid-1;
		else lb=mid+1;
	}
	
}
		
		
public static void main(String[] args) {
		Program2 p1=new Program2();
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
		p1.insertionsort(a,n);
		System.out.println("sorted array is: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("enter the element to be searched: ");
		int key=sc.nextInt();
		p1.binarysearch(a,0,n-1,key);
	}

}

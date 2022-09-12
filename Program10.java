package com.ks.one;
import java.util.*;
//Write a Java program that implements merge sort for sorting a list of names in ascending order.
public class Program10 {
	public  void msort(String[] a,int lb,int ub)
	{ 
		if(lb<ub)
		{
			int mid=(lb+ub)/2;
			msort(a,lb,mid);
			msort(a,mid+1,ub);
			merge(a,lb,mid,ub);
		} 
	}
	
	public  void merge(String[] a,int lb,int mid,int ub)
	{   int n=ub-lb+1;
		String[] c=new String[n];
		int i=lb;
		int j=mid+1;
		int k=0;
		while((i<=mid)&&(j<=ub))
		{
			if(a[i].compareTo(a[j])<=0)
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
		while(i<=mid)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<=ub)
		{
			c[k]=a[j];
			j++;
			k++;
		}
		for(k=0,i=lb;k<n;k++,i++)
		{
			a[i]=c[k];
		}
}
	public static void main(String[] args) {
		Program10 p=new Program10();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of list: ");
		int n=sc.nextInt();
		String[] a=new String[1000];
		System.out.println("enter the string elements to be sorted: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("unsorted list is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"  ");
		}
		p.msort(a,0,n-1);
		System.out.println("sorted list is: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}


package com.ks.one;
import java.util.*;
//Write a Java program that uses both recursive and non recursive linear search functions to search for an integer key 
//in an array of integer elements.

public class Program25 {
	public static int lsearch(int[] a,int n,int key)
	{ int i;
		for(i=0;i<n;i++)
		{
			if(a[i]==key) return i;
		}
		return -1;
		
	}
	
	public static int rlsearch(int[] a,int lb,int ub,int key)
	{
		if(lb>ub) return -1;
		else if(a[lb]==key) return lb;
		else return rlsearch(a,lb+1,ub,key);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the elemnets: ");
		int[] a=new int[100];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter a key to be searched: ");
		int key=sc.nextInt();
		int res1=lsearch(a,n,key);
		if(res1==-1) System.out.println("element not present!!");
		else System.out.println("by using non recursive linear search the element is present at: "+res1);
		int res2=rlsearch(a,0,n-1,key);
		if(res2==-1) System.out.println("element not present!!!");
		else System.out.println("by using recursive linear search the element is present at: "+res2);
		
		
	}

}

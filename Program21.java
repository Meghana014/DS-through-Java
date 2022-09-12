package com.ks.one;
import java.util.*;
//Write a Java program to perform the following:
//i)Sort a list of names in ascending order using Selection sort.
//ii)Then searches for a key value(name) recursively in the above sorted list using Binary search.
public class Program21 {
	public static void Selection(String[] s,int n)
	{
		 int i,j;
			for(i=0;i<n-1;i++)
			{  
				int minindex=i;
				for(j=i+1;j<n;j++)
				{
					if(s[j].compareTo(s[minindex])<0)
						minindex=j;
				}
				String temp=s[i];
				s[i]=s[minindex];
				s[minindex]=temp;	
				
			}
	}
	public int Rbsearch(String[] s,int lb,int ub,String key)
	{ try
	  {
		int mid=0;
		if(lb<=ub)
		{ 
			 mid=(lb+ub)/2;
			if(s[mid].compareTo(key)==0) return mid;
			else if(s[mid].compareTo(key)>0) return Rbsearch(s,lb,mid-1,key);
			else if(s[mid].compareTo(key)<0) return Rbsearch(s,mid+1,ub,key);
		}
		return mid;
	  }catch(Exception e)
	    {
		  System.out.println("element not present!!");
	    }
		return -1;
		
	}
	public static void main(String[] args) {
		Program20 p=new Program20();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int n=sc.nextInt();
		System.out.println("enter the elements: ");
		String[] s=new String[100];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		System.out.println("before sorting the elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(s[i]+" ");
		}
		Selection(s,n);
		System.out.println("after sorting the elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println("enter a name to be searched: ");
		String key=sc.next();
        System.out.println(p.Rbsearch(s, 0, n, key));
	}
}

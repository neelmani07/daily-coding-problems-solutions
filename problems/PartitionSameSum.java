/*
This problem was asked by Facebook.

Given a list of strictly positive integers, partition the list into 3 contiguous partitions which each sum up to the same value. If not possible, return null.

For example, given the following list:

[3, 5, 8, 0, 8]

Return the following 3 partitions:

[[3, 5],
 [8, 0],
 [8]]

Which each add up to 8.
*/

import java.util.*;
class PartitionSameSum
{
	static int arSum=0;
	
	public static void addToList(int ar[],int st,int end,ArrayList<ArrayList<Integer>> ans)
	{
		ArrayList<Integer> temp=new ArrayList<Integer>();
		for(int i=st;i<=end;i++)
		{
			temp.add(ar[i]);
		}
		ans.add(temp);
	}
	
	public static void partition(int ar[],int sReq,int strt,int multiple)
	{
		ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
	

		int lSum=0;
		for(int i=strt;i<ar.length;i++)
		{
			lSum+=ar[i];
			if(lSum*multiple==arSum)
			{
				addToList(ar,strt,i,ans);
				lSum=0;
				strt=i+1;
			}
		}
		System.out.println(ans);
		
	}
	public static void main(String a[])
	{
		int ar[]=new int[]{3, 5, 8, 0, 8};
		for(int i=0;i<ar.length;i++)
		{
			arSum+=ar[i];
		}
		
		int sum=8;
		partition(ar,sum,0,3);
		
	}
}
	

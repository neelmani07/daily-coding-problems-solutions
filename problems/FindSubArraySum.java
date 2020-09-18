/*
This problem was asked by Goldman Sachs.

Given a list of numbers L, implement a method sum(i, j) which returns the sum from the sublist L[i:j] (including i, excluding j).

For example, given L = [1, 2, 3, 4, 5], sum(1, 3) should return sum([2, 3]), which is 5.

You can assume that you can do some pre-processing. sum() should be optimized over the pre-processing step.

*/
import java.util.*;
class SubArraySum
{
	public static void main(String s[])
	{
		int ar[]=new int[]{1,2,3,4,5};
		for(int i=1;i<ar.length;i++)
		{
			ar[i]+=ar[i-1];
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int st=sc.nextInt();
		int end=sc.nextInt();
		
		System.out.println("ans="+(ar[end-1]-ar[st-1]));
	}
}

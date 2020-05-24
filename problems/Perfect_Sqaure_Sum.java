package hanson;
import java.util.*;
public class Perfect_Sqaure_Sum
{
	public static boolean isPerfectsq(int n)
	{
		if (Math.floor(Math.sqrt(n))-Math.sqrt(n)==0)
		{
			return true;
		}
		else
			return false;
	}
	public static int findSmallstPerfctSquareSum(int n)
	{
		
		int k=0;int arr[]=new int [10];
		for(int i=n; i>=1 ;i--)
		{
			if(isPerfectsq(i))
			{	
				System.out.print(i);
				arr[k++]=i;
			}
			
		}
		for(int i=0;i<arr.length && arr[i]!=0;i++)
		{
			System.out.print(arr[i]+" ");
		}
		return k;
	}
	
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.print("enter the no.");
		//int num=sc.nextInt();
		//System.out.print(findSmallstPerfctSquareSum(num));
	
	}
	
}
	
	
	
	
	
	
	


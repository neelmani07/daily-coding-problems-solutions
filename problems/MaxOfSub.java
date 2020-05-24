package hanson;

import java.util.Scanner;

public class MaxOfSub
{
	public static void dispMax(int arr[] ,int k)
	{   int count=0;
		int max=arr[0];
		int scndmax=0;
		for (int j=0;j<arr.length;j++)
		{   if(j<k)
			{
				max=(max > arr[j])? max:arr[j];
				if(arr[j]<max && arr[j]>scndmax )
					scndmax=arr[j];
			}
			
		    else if(j==k)
			{
				System.out.println(max);
				if (max==arr[0])
				{
					max=(scndmax>arr[j])?scndmax:arr[j];
				}
					
			}
			else
			{
				System.out.println(max);
				max=(max > arr[j])? max:arr[j];
			}
			
				
		}
		System.out.println(max);
	}
	public static void main(String ar[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the arrays length");
		int length=sc.nextInt();
		int a[] = new int[length];
		System.out.println("Enter all the elements:");
	    for(int i = 0; i < length; i++)
	    {
	         a[i] = sc.nextInt();
	         
	         
	    }
		System.out.println("enter the ak value");
		int k=sc.nextInt();
		dispMax(a,k);
		
		
	}

}

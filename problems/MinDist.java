package hanson;

public class MinDist
{
	public static void findMinDist(int arr[],int n1,int n2)
	{   int i=0,startpos=0;
	    int localMinDist=99,globalMinDist=99;
	    int no1=n1,no2=n2;int sum=n1+n2;
		while(i<arr.length)
		{
			if(arr[i]==no1)
			{
				startpos=i;
				no2=sum-no1;
				
				
			}
			else if(arr[i]==no2)
			{
				localMinDist=i-startpos;
				globalMinDist=(localMinDist<globalMinDist)?localMinDist:globalMinDist;
				startpos=i;
				no1=no2;
				no2=sum-no1;
			}
			i++;
		}
		System.out.println(globalMinDist);
		
	}
	public static void main(String a[])
	{
		int arr[]= {6,9,4,5,1,6,5,9,11,8,4};
		findMinDist(arr,6,5);
		
	}
}

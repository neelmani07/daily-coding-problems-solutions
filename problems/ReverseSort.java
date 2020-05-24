package hanson;

public class ReverseSort
{
	static void rvereseArray(int arr[],int start, int end) 
	{ 
			int temp; 
			while (start < end) 
			{ 
			    temp = arr[start];  
			    arr[start] = arr[end]; 
			    arr[end] = temp; 
			    start++; 
			    end--; 
			}  
			for (int i = 0; i < arr.length; i++) 
	            System.out.print(arr[i] + " ");
			System.out.println(); 
	} 
	public static void main(String arg[])
	{
		int ar[]= {7,6,3,8,5,0,9,1,2,4};int k=0;
		while(k<ar.length)
		{
			for(int i=0,j=1;j<ar.length;j++,i++)
		
			{
				int a=i,b=j;
			
				while(j<ar.length && ar[i]>ar[j])
				{
					i++;j++;
				}
				if(a!=i)
				{	System.out.println(a+" "+(--j));
					rvereseArray(ar,a,j);
				}
				i=a;j=b;
			}
			System.out.println(); System.out.println(); 
			for (int i = 0; i < ar.length; i++) 
	            System.out.print(ar[i] + " "); 
			k++;
		}
	}	
}

package hanson;

public class MaxProfitSales 
{
	static int maxProfit(int prices[])
	{	//System.out.print("(prices.length)");
	    int i=0,j=0,k=0,z=0;
	    int min[]=new int[20];
	    int max[]=new int[20];
	    //System.out.println(prices.length);
	    while(i<prices.length)
	    {
	    
		     if(prices[i]>prices[i+1])  
		     {	//System.out.println("check 1");
		         min[j]=prices[i+1];
		         k=i+2;
		     }
		     else
		     {
		        min[j]=prices[i];
		         k=i+1;
		     }
		        while(k++<prices.length)
		        {	//System.out.println("check 2");
		            if(prices[k+1]<prices[k])
		            {
		                max[j]=prices[k];
		                j++;
		                i=k+1;
		                break;
		            }
		        }
		     i++;       
		}
	    System.out.println(j);
		for(i=0;i<j;i++)
		{
		    z+=(max[i]-min[i]);
		    System.out.println("max at"+i+"="+max[i]+"  "+"min at"+i+"="+min[i]);
		}
		return z;
    }

	public static void  main(String aj[])  
	{
	    int a[] = { 7,1,5,3,6,4}; 
	    //System.out.print("(");
	   // System.out.print("(prices.length)");
	   System.out.println(maxProfit(a));
	    
	}
}
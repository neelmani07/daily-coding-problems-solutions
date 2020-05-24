package hanson;

import java.util.Scanner;

public class DecWithLeastSteps_Day321
{
	
	public static int findWithLeastSteps(int num)
	{	    
			if(num==2)
				return 1;
			else if(num==4)
				return 2;
			else
			{
				int minWay=num,i=2;
				while(i<num/2)
				{
					if(num % i ==0)
					{
						minWay= Math.min(minWay,findWithLeastSteps(Math.max(i,num/i)));
					}
					i+=1;
				}
				if(minWay!=num)
					return 1+Math.min(minWay,findWithLeastSteps(num-1));
				else
					return 1+findWithLeastSteps(num-1);
			}
		
	}
	
	public static int findWithLeastStepsDP(int num,int dp[])
	{
		if(dp[num]!=0)
			return dp[num];
		else
		{
			{
				int i=2,minSteps=num;
				while(i<=num/2)
				{
					if(num % i ==0)
					{
						minSteps= Math.min(minSteps,findWithLeastStepsDP(Math.max(i,num/i),dp));
					}
					i+=1;
				}
				if(minSteps!=num)
					dp[num]= 1+Math.min(minSteps,findWithLeastStepsDP(num-1,dp));
				else
					dp[num]= 1+findWithLeastStepsDP(num-1,dp);
				return dp[num];
			}
			
			
		}
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int dp[]=new int[900];
		dp[0]=0;dp[1]=0;dp[2]=1;dp[3]=2;dp[4]=2;
		long startTime = System.nanoTime();
		System.out.println("number of steps are="+findWithLeastSteps(100));
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);

		startTime = System.nanoTime();
		System.out.println("number of steps are="+findWithLeastStepsDP(100,dp));
		endTime = System.nanoTime();
		timeElapsed = endTime - startTime;
		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
	}
}

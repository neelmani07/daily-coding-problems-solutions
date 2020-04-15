import java.util.*;

import java.lang.*;
class LookAndSay
{	

	
	public static void lookNSay(int lstNo,int k,int n)throws StringIndexOutOfBoundsException
	{
		
		int newNo=0;String newno="";
		if(k<n)
		{	
			String s= Integer.toString(lstNo);s=s+"l";
			char dgt=s.charAt(0);int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!= dgt)
				{
					newno=newno+Integer.toString(count)+dgt;
					
					dgt=s.charAt(i);
					count=1;
				}
				else
				{
					count++;
				}
			}
			
			newNo=Integer.parseInt(newno);
			System.out.println(newNo);
			lookNSay(newNo,k+1,n);
		}
		else
		{
			return;
		}
	}
				
		
	
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n");
		int n=sc.nextInt();
		
		lookNSay(11,1,n);
		
	}
}

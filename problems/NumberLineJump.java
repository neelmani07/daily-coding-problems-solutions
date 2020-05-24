package hanson;

public class NumberLineJump
{
	public static int findLeastJump(int num,int steps,int i)
	{
		if(i == num)
		{	System.out.println(i);
			return 1;
		}
		else if(i<= -num || i > num)
		{	//System.out.print(" ");
			return 0;
		}
		else
		{	System.out.print(i+"->");
			return 1+Math.min(findLeastJump(num,steps+1,i+steps),findLeastJump(num,steps+1,i-steps));
		}
	}
	public static void main(String arg[])
	{
		System.out.println("ans="+findLeastJump(9,1,0));
	}
}

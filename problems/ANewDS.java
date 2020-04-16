package hanson;
import java.util.*;
class DSnew
{
	Hashtable <Integer,Integer> hash;//= 
	int maxV,minV,max,min;
	public DSnew()
	{
		hash=new Hashtable<Integer,Integer>();
		max=min=maxV=minV=0;
	}
	public void add(int key)
	{
		if(hash.containsKey(key))
		{
			int val=hash.get(key);
			hash.put(key,val+1);
			
			if(maxV < val+1)
			{	max=key;maxV=val-1;}
			if(minV > val+1)
			{	min=key;minV=val-1;}
		}
		else
		{
			hash.put(key,1);
			minV=1;
			min=key;
		}
	}
	public void minus(int key)
	{
		if(hash.containsKey(key))
		{
			int val=hash.get(key);
			hash.put(key,val-1);
			
			if(maxV < val-1)
			{	max=key;maxV=val-1;}
			if(minV > val-1)
			{	min=key;minV=val-1;}
		}
		else
			System.out.println("key not present");
		
	}
	public int getMax()
	{
		return max;
	}
	public int getMin()
	{
		return min;
	}
	public void printHashTable()
	{
		System.out.println(hash.toString());
	}
}
public class ANewDS
{
	public static void main(String a[])
	{
		DSnew ds=new DSnew();
		Scanner sc =new Scanner(System.in);
		while(true)
		{
			System.out.println("1 to add    2 to minus  3 to get max   4 to get min  5 to get hashtable  6 to exit");
			System.out.println("enter the choice");
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("enter the key");
					int key =sc.nextInt();
					ds.add(key);
					break;
			case 2: System.out.println("enter the key");
					int key1 =sc.nextInt();
					ds.minus(key1);
					break;
			case 3: System.out.println(ds.getMax());
					break;
			case 4: System.out.println(ds.getMin());
					break;
			case 5: ds.printHashTable();
					break;
			case 6: System.exit(0);
			}
			
		}
	}
}

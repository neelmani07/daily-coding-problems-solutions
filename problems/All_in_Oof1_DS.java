package hanson;
import java.util.*;
class NoDe
{
	Set<Integer> keys;
	int Value;
	NoDe preV;
	NoDe nexT;
	
	public NoDe()
	{
		Value=0;
		keys=new HashSet<Integer>();
		preV=nexT=null;
	}
	public void addKey(int key)
	{
		keys.add(key);
	}
	public void removeKey(int key)
	{
		keys.remove(key);
	}
	public void addNoDeTo(NoDe NoDe)
	{
		NoDe newNoDe=new NoDe();
		newNoDe.nexT=newNoDe;
		newNoDe.Value=NoDe.Value+1;
		newNoDe.preV=NoDe;
	}
	public void delNoDe(NoDe NoDe)
	{
		if(NoDe.nexT==null)
		{
			NoDe.preV.nexT=null;
		}
		if(NoDe.preV==null)
		{
			NoDe.nexT.preV=null;
		}
		else
		{
			NoDe.preV.nexT=NoDe.nexT;
			NoDe.nexT.preV=NoDe.preV;
		}
	}
	
}
class All_in_Oof1_DS
{
	NoDe head,tail;
	HashMap<Integer,NoDe> key_Val=new HashMap<Integer,NoDe>();
	public NoDe getDLL()
	{
		NoDe NoDe=new NoDe();
		head=tail=NoDe;
		return NoDe;
	}
	public void add(int key)
	{
		System.out.println("check1");
		if(key_Val.isEmpty())
		{	System.out.println("check2");
			NoDe newNoDe=new NoDe();
			newNoDe.keys.add(key);
			newNoDe.Value=1;
			newNoDe.nexT=newNoDe.preV=null;
			tail=head=newNoDe;
			key_Val.put(key, newNoDe);
		}
		else if(key_Val.containsKey(key))
		{
			System.out.println("check3");
			NoDe earlierNoDe=key_Val.get(key);
			if(earlierNoDe.nexT!= null && earlierNoDe.nexT.Value==earlierNoDe.Value+1)
			{
				earlierNoDe.keys.remove(key);
				earlierNoDe.nexT.keys.add(key);
				key_Val.put(key,earlierNoDe.nexT);
				//ifDelPoss(earlierNoDe);
			}
			else
			{	if(earlierNoDe.Value==head.Value)
				{
					earlierNoDe.keys.remove(key);
					NoDe newNoDe=new NoDe();
					newNoDe.Value=earlierNoDe.Value+1;
					newNoDe.keys.add(key);
					key_Val.put(key, newNoDe);
					newNoDe.preV=earlierNoDe;
					earlierNoDe.nexT=newNoDe;
					head=newNoDe;
					//ifDelPoss(earlierNoDe);
				}
				else
				{
					earlierNoDe.keys.remove(key);
					NoDe newNoDe=new NoDe();
					newNoDe.Value=earlierNoDe.Value+1;
					newNoDe.keys.add(key);
					key_Val.put(key, newNoDe);
					newNoDe.nexT=earlierNoDe.nexT;
					newNoDe.nexT.preV=newNoDe;
					newNoDe.preV=earlierNoDe;
					earlierNoDe.nexT=newNoDe;
					//ifDelPoss(earlierNoDe);
				}
			}
		}
		else
		{
			if(tail.Value==1)
			{
				tail.keys.add(key);
				key_Val.put(key, tail);
			}
			else
			{
				NoDe newNoDe=new NoDe();
				newNoDe.keys.add(key);
				newNoDe.Value=1;
				key_Val.put(key, newNoDe);
				newNoDe.nexT=tail;
				tail.preV=newNoDe;
				tail=newNoDe;
				//ifDelPoss(tail);
			}
		}
			
			
	}
	public void minus(int key)
	{
		if(!key_Val.containsKey(key))
		{
			System.out.println("key not there");
		}
		else
		{
			NoDe earlierNoDe=key_Val.get(key);
			if(earlierNoDe.Value==head.Value)
			{
				if(earlierNoDe.preV.Value==earlierNoDe.Value-1)
				{
					earlierNoDe.keys.remove(key);
					earlierNoDe.preV.keys.add(key);
					key_Val.put(key, earlierNoDe.preV);
					//IfDelPoss(earlierNoDe);
					if(head.keys.isEmpty())
					{
						head=earlierNoDe.preV;
					}
				}
			}
			if(!(earlierNoDe.Value==tail.Value) && earlierNoDe.preV.Value==earlierNoDe.Value-1)
			{
				earlierNoDe.keys.remove(key);
				earlierNoDe.preV.keys.add(key);
				key_Val.put(key, earlierNoDe.preV);
				//IfDelPoss(earlierNoDe);
			}
			else
			{
				if(earlierNoDe.Value==tail.Value)
				{	NoDe newNoDe=new NoDe();
					earlierNoDe.keys.remove(key);
					newNoDe.keys.add(key);
					newNoDe.Value=earlierNoDe.Value-1;
					key_Val.put(key, newNoDe);
					newNoDe.nexT=earlierNoDe;
					earlierNoDe.nexT=newNoDe;
					tail=newNoDe;
					//ifDelPoss(tail);
				}
				else
				{
					earlierNoDe.keys.remove(key);
					NoDe newNoDe=new NoDe();
					newNoDe.Value=earlierNoDe.Value-1;
					newNoDe.keys.add(key);
					key_Val.put(key, newNoDe);
					newNoDe.nexT=earlierNoDe.nexT;
					newNoDe.nexT.preV=newNoDe;
					newNoDe.preV=earlierNoDe;
					earlierNoDe.nexT=newNoDe;
					//ifDelPoss(earlierNoDe);
				}
			}
		}
	}
	public void  getMax()
	{
		System.out.println(head.keys);
	}
	public  void getMin()
	{
		System.out.println(tail.keys);
	}
	public void printHashMap()
	{
		key_Val.forEach((k, v) -> System.out.println(k + " : " + (v.Value))); 
		
	}
	public void traverseList()
	{
		NoDe start=head;
		System.out.println(head.Value+" "+start.Value+" "+head.nexT.Value);
		while(start.nexT != null)
		{
			System.out.print(start.Value);
			start=start.nexT;
			
		}
	}
	public static void main(String s[])
	{
		All_in_Oof1_DS ds=new All_in_Oof1_DS();
		NoDe NoDeList=ds.getDLL();
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1 to add    2 to minus  3 to get max   4 to get min  5 to get hashMap  6 to exit");
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
			case 3: ds.getMax();
					break;
			case 4: ds.getMin();
					break;
			case 5: ds.printHashMap();
					break;
			case 6: ds.traverseList();
			        break;
			case 7: System.exit(0);
			}
			
		}
		
	}
}
/*public class All_in_Oof1_DS
{
	public static void main(String s[])
	{
		DLL ds=new DLL();
		NoDe NoDeList=ds.getDLL();
		HashMap<Integer,NoDe> key_Val=new HashMap<Integer,NoDe>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1 to add    2 to minus  3 to get max   4 to get min  5 to get hashMap  6 to exit");
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
			case 3: ds.getMax();
					break;
			case 4: ds.getMin();
					break;
			case 5: ds.printHashMap();
					break;
			case 6: System.exit(0);
			}
			
		}
		
	}
}*/

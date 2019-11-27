/*
Given a number in Roman numeral format, convert it to decimal.

The values of Roman numerals are as follows:

{
    'M': 1000,
    'D': 500,
    'C': 100,
    'L': 50,
    'X': 10,
    'V': 5,
    'I': 1
}

In addition, note that the Roman numeral system uses subtractive notation for numbers such as IV and XL.

For the input XIV, for instance, you should return 14.


*/
import java.util.*;
import java.lang.*;
class ex
{
	public static int convertToD(String str,int start,int end,int value)
	{	
		if(end<str.length())
		{
			char ch1=str.charAt(start);
			char ch2=str.charAt(end);
		}
		return 90;	
		
	}
	public static void main(String s[])
	{	
		Map<Character, Integer> dict=new HashMap<Character, Integer>();
		dict.put('M',1000);
		dict.put('D',500);
		dict.put('C',100);
		dict.put('L',50);
		dict.put('X',10);
		dict.put('V',5);
		dict.put('I',1);
		System.out.println(dict.get('C'));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String st=sc.nextLine();
		int result=convertToD(st,0,1,0);
		System.out.println("ROMAN =  "+st+" "+result);
		System.out.println("DECIMAL ="+result);
	}
	
}

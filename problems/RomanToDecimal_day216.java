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
class RomanToDecimal
{	
		
	/* a function to convert the given string from rom... to normal decim... form.
	   its basic working principle is as follows:-
	        note: "ch1->" represents the corresponding dictionary value for ch1
	        1)take two character at a time let ch1 & ch2
	        2)compare the corresponding dictionary value 
	          2.1) if "ch1-> " > "ch2->"
	               means the first letter of the picked two is greater . example in XV X(10) > V(5) 
	               so we add the value of "ch1->" into the resultant and pass on the later for next recursion.
	               
	               if "ch1->" < "ch2->"
	               means the first letter of the picked two is lesser . example  IX(9)  I(1) > X(10)
	               so we add the value of "ch2-> * -1" into the resultant and pass on the later for next recursion.
	               
	        3) if only one character left take "ch1->"
	        
	*/
	public static int convertToD(String str,int start,int end)
	{	//System.out.println(str.length()+" "+end);
		//dictionary creation
		Map<Character, Integer> dict=new HashMap<Character, Integer>();
		dict.put('M',1000);
		dict.put('D',500);
		dict.put('C',100);
		dict.put('L',50);
		dict.put('X',10);
		dict.put('V',5);
		dict.put('I',1);
		int valueTobReturned=0;
		if(end<str.length())
		{
			char ch1=str.charAt(start);
			char ch2=str.charAt(end);
			//System.out.println(dict.get(ch1)+" "+dict.get(ch2));
			if(dict.get(ch1) >= dict.get(ch2))
				valueTobReturned= dict.get(ch1)+convertToD(str,start+1,end+1);
			if(dict.get(ch1) < dict.get(ch2))
				valueTobReturned= (dict.get(ch1)*-1)+convertToD(str,start+1,end+1);
		}
		else
		{	
			valueTobReturned= dict.get(str.charAt(start));
		}
		return valueTobReturned;	
		
	}
	public static void main(String s[])
	{	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String st=sc.nextLine();
		int result=convertToD(st,0,1);
		System.out.println("ROMAN =  "+st);
		System.out.println("DECIMAL ="+result);
	}
	
}

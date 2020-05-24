/*This problem was asked by  Facebook.

Given a string and a set of delimiters, reverse the words in the string 
while maintaining the relative order of the delimiters.
 For example, given "hello/world:here", return "here/world:hello"

Follow-up: Does your solution work for the following cases: "hello/world:here/", "hello//world:here"*/

package hanson;
import java.util.*;


public class WordsRevDay114 
{
	public static void reverse(String s)
	{
		
		int c=0;
		char delim[]=new char[10];Integer
		s=' '+s;
		int j=s.length();
		char ch=' ';int ord;
		for(int k=1;k<s.length();k++)
		{
			ch=s.charAt(k);
			ord=(int)ch;
			if((ord<65 || ord >122) || (ord >65 && ord < 90 ))
			{
				delim[c++]=ch;
			}
		}
		
		c=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{	
			
			ch=s.charAt(i);
			ord=(int)ch;
			if((ord<65 || ord >122) || (ord >65 && ord < 90 ))
			{  
				if(j==s.length())
				{
					
					System.out.print(s.substring(i+1, j));
					System.out.print(delim[c++]);
					j=i;
					
				}
				else
				{
					System.out.print(s.substring(i+1, j));
					System.out.print(delim[c++]);
					j=i;
					
				}
			}
			
		}
	}
	public static void main(String a[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the sentence");
		String  sen=sc.nextLine();
		reverse(sen); 
	}
}

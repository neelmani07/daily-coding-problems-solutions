/*This problem was asked by Google.

Given a string of words delimited by spaces, reverse the words in string. For example, given "hello world here", return "here world hello"

Follow-up: given a mutable string representation, can you perform this operation in-place?*/

package hanson;
import java.util.*;


public class WordsRevDay113 
{
	public static void reverse(String s)
	{
		
		int j=s.length();
		//System.out.println(s.charAt(j-1));
		s=' '+s;
		for(int i=s.length()-1;i>=0;i--)
		{	
			
			if(s.charAt(i)==' ' || i==0)
			{   
				//System.out.print(i+"\t"+j);
				System.out.print(s.substring(i, j+1));
				j=i;
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

package hanson;
/*
 * This problem was asked by Google.

Given a word W and a string S, find all starting indices in S which are anagrams of W.

For example, given that W is "ab", and S is "abxaba", return 0, 3, and 4.
 */

public class FirstIndexOfAnagram 
{
	// Function to check whether two strings are anagram of  
	// each other  
	static boolean areAnagram(String str1, String str2)  
	{  
	    // If two strings have different length  
	    if (str1.length() != str2.length())  
	    {  
	        return false;  
	    }  
	  
	    // To store the xor value  
	    int value = 0;  
	  
	    for (int i = 0; i < str1.length(); i++)  
	    {  
	        value = value ^ (int) str1.charAt(i);  
	        value = value ^ (int) str2.charAt(i);  
	    }  
	  
	    return value == 0;  
	  
	}  
	public static void main(String a[])
	{
		String word = "ab";  
	    String string = "abxaba"; 
	    for(int i=0;i<string.length()-1;i++)
	    {	
	    	 if (areAnagram("ab", string.substring(i,i+word.length())))//string.substring(i,i+word.length())));
	    	 {
	    		 System.out.println(i);
	    	 }
	    	
	    }
	   
	        
	}
}

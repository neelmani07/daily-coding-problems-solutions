/*
 * This problem was asked by Google.

Given an array of strictly the characters 'R', 'G', and 'B', 
segregate the values of the array so that all the Rs come first, 
the Gs come second, and the Bs come last. You can only swap elements of the array.

Do this in linear time and in-place.

For example, given the array ['G', 'B', 'R', 'R', 'B', 'R', 'G'], 
it should become ['R', 'R', 'R', 'G', 'G', 'B', 'B'].
 */
public class ArrangeColors
{
	public static void sortColors(char a[])
	{
        
        int lo = 0; 
        int hi = a.length-1; 
        int mid = 0;char temp =' '; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 'R': { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 'G': 
                mid++; 
                break; 
            case 'B': { 
                temp = a[mid]; 
                a[mid] = a[hi]; 
                a[hi] = temp; 
                hi--; 
                break; 
            } 
            } 
        }
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ,");
      
	}
	public static void main(String s[])
	{
		char colors[]=new char[] {'G', 'B', 'R', 'R', 'B', 'R', 'G'};
		sortColors(colors);
	}
}

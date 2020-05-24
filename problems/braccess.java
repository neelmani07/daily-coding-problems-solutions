package hanson;

public class braccess
{
     static int a=0;
	 static void _printParenthesis(char str[], int pos, int n, int open, int close) 
	    { 
	        if(close == n)  
	        { 
	            // print the possible combinations 
	            for(int i=0;i<str.length;i++) 
	                System.out.print(str[i]); 
	            System.out.println(); 
	            return; 
	        } 
	        else
	        { 
	           /* if(open > close) { 
	                str[pos] = '}'; 
	                _printParenthesis(str, pos+1, n, open, close+1); 
	            } */
	            if(open < n) { 
	                str[pos] = '{'; 
	                _printParenthesis(str, pos+1, n, open+1, close); 
	                System.out.println(open+" "+close);
	            }
	            if(open > close) { 
	                str[pos] = '}'; 
	                _printParenthesis(str, pos+1, n, open, close+1); 
	                System.out.println(open+" "+close
	                		);
	            } 
	        } 
	    } 
	      
	 
	 
	 static void printParenthesis(char str[], int n) 
	    { 
	        if(n > 0) 
	        _printParenthesis(str, 0, n, 0, 0); 
	        return; 
	    } 
	      
	    // driver program  
	 public static void main (String[] args)  
	    { 
	        int n = 3; 
	        char[] str = new char[2 * n]; 
	        printParenthesis(str, n); 
	    } 
}

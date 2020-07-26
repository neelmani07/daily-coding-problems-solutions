/*This problem was asked by Facebook.

There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. You can only move right or down.

For example, given a 2 by 2 matrix, you should return 2, since there are two ways to get to the bottom-right:

    Right, then down
    Down, then right

Given a 5 by 5 matrix, there are 70 ways to get to the bottom-right.*/

class uniquePathRightAndDown 
{
    public int uniquePaths(int m, int n) 
    {
        int ar[][]=new int[n][m];	     // this table hold the no. of ways to reach the current position for each [r][c]
        
        for(int j=0; j<n; j++) ar[j][0] = 1; // first row filled with 1
        for(int i=0; i<m; i++) ar[0][i] = 1; // first column filled with 1
        
        for(int r=1;r<n;r++)
        {
            for(int c=1;c<m;c++)
            {
              
                {   //System.out.print(r+" "+c);
                    ar[r][c]=ar[r-1][c]+ar[r][c-1];
                }
            }
        }
        return ar[n-1][m-1];
        
    }
}


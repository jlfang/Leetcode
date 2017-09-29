package array;

/**
 *	Problem 562
 *  Given a 01 matrix M, find the longest line of consecutive 
 *  one in the matrix. The line could be horizontal, vertical, 
 *  diagonal or anti-diagonal. 
 */

public class LongestLineOfConsecutiveOneInMatrix {
    public int longestLine(int[][] M) {
        if(M==null || M.length==0)
            return 0;
        
        int tmp = 0;
        int count =0;
        
        //horizontal check
        for(int i=0;i<M.length;i++)
        {
            tmp=0;
            for(int j=0;j<M[0].length;j++)
            {
                if(M[i][j]==1)
                {
                     tmp++;
                     count = Math.max(count,tmp);
                }
                else
                    tmp=0;
            }
        }
        
        //vertical check
        for(int i=0;i<M[0].length;i++)
        {
            tmp=0;
            for(int j=0;j<M.length;j++)
            {
                if(M[j][i]==1)
                {
                    tmp++;
                    count = Math.max(count,tmp);
                }
                else
                    tmp=0;
            }
        }
        
        //upper diagonal check
            
        for(int i=0; i<M[0].length;i++)
        {
            tmp=0;
            for(int x =0, y=i; x<M.length && y<M[0].length;x++,y++)
            {
                if(M[x][y]==1)
                {
                    tmp++;
                    count = Math.max(count,tmp);
                }
                else
                    tmp=0;
            }
        }
        
        //lower diagonal check
        for(int i=0;i<M.length;i++)
        {
            tmp=0;
            for(int x =i,y=0;x<M.length && y<M[0].length;x++,y++)
            {
                if(M[x][y]==1)
                {
                    tmp++;
                    count = Math.max(count,tmp);
                }
                else
                    tmp =0;
            }
        }
        
        //anti-diagonal upper check
        for(int i= 0; i<M.length;i++)
        {
            tmp=0;
            for(int x =0,y=M[0].length-i-1;x<M.length && y>=0;x++,y--)
            {
                System.out.println(x+" "+y);
                if(M[x][y]==1)
                {
                    tmp++;
                    count=Math.max(count,tmp);
                }
                else
                {
                    tmp=0;
                }
            }
        }
        
        //anti-diagonal lower check
        for(int i=0;i<M[0].length;i++)
        {
            tmp=0;
            for(int x = i,y=M[0].length-1;x<M.length && y>=0;x++,y--)
            {
                if(M[x][y]==1)
                {
                    tmp++;
                    count = Math.max(count,tmp);
                }
                else
                {
                    tmp =0;
                }
            }
        }
        
        return count;
    }
}

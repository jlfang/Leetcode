package array;

/**
 * Problem 667
 * Given two integers n and k, you need to construct a list 
 * which contains n different positive integers ranging from 1 to n 
 * and obeys the following requirement: 
 *Suppose this list is [a1, a2, a3, ... , an], 
 *then the list [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] 
 *has exactly k distinct integers.
 *
 *If there are multiple answers, print any of them.
 *
 */

public class BeautifulArrangementII {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        
        int start =0;
        
        for(int i=1;i<n-k;i++)
        {
            res[start]=i;
            start++;
        }
        
        
        for(int j=0;j<=k;j++)
        {
            res[start] = (j%2==0)?(n-k+j/2):(n-j/2);
            start++;
        }
        
        return res;
    }
}

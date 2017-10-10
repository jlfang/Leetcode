package dynamic_programming;

/**
 * Problem 647
 * 
 * Given a string, your task is to count how many 
 * palindromic substrings in this string.
 *
 * The substrings with different start indexes or 
 * end indexes are counted as different substrings 
 * even they consist of same characters.
 *
 */

public class PalindromicSubstrings {
    int count =0;
    
    public int countSubstrings(String s) {
        
        //empty String check
        if(s==null || s.length() == 0)
            return 0;     
        
        
        
        for(int i=0;i<s.length();i++)
        {
            //check odd substring
            checker(s,i,i);
            //check even substring
            checker(s,i,i+1);
        }
        return count;
    }
    
    public void checker(String s, int left, int right)
    {
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            count++;
            left--;
            right++;
        }
    }
}

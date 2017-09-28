package array;

public class LongestContinuousIncreasingSubsequence {
    /**
    ** Problem:
    ** Given an unsorted array of integers, find the length of longest continuous increasing subsequence.
    **/
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0  || nums == null)
            return 0;
        
        int tmp = 1;
        int max = 0;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
                tmp++;
            else
            {
                if(tmp>max)
                {
                    max = tmp;   
                }
                tmp = 1;
            }
        }
        return Math.max(tmp,max);
    }
}

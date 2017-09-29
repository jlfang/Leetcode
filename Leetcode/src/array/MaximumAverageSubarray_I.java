package array;


/**
 * Problem 643
 * 
 * Given an array consisting of n integers, 
 * find the contiguous subarray of given length k 
 * that has the maximum average value. And you need to 
 * output the maximum average value.
 *
 */

public class MaximumAverageSubarray_I {
    public double findMaxAverage(int[] nums, int k) {
    	   
        int[] sum = new int[nums.length];
        
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum[i]=sum[i-1]+nums[i];
        }
        
        
        double res = ((double)sum[k-1])/k;
        
        for(int i=k;i<nums.length;i++)
        {
            res = Math.max(res,((double)(sum[i]-sum[i-k]))/k);
        }
        return res;
    }
}

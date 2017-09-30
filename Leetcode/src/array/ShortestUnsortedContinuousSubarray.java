package array;

import java.util.Arrays;

/**
 * Problem 581
 * 
 * Given an integer array, you need to find one continuous subarray 
 * that if you only sort this subarray in ascending order, 
 * then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 */


public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {

        if(nums==null || nums.length==0 || nums.length==1)
            return 0;
        
        int[] nums_copy = nums.clone();
        Arrays.sort(nums_copy);
        int start = nums.length-1;
        int end = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums_copy[i]!=nums[i])
            {
                start = Math.min(i,start);
                end = Math.max(i,end);
            }
        }
        return end-start>=0 ? end-start+1 : 0;
    }
}

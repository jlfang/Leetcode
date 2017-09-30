package array;

import java.util.Arrays;

/**
 * Problem 532
 * 
 * Given an array of integers and an integer k, 
 * you need to find the number of unique k-diff pairs in the array. 
 * Here a k-diff pair is defined as an integer pair (i, j), 
 * where i and j are both numbers in the array 
 * and their absolute difference is k.
 *
 */

public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        int count =0;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])==k)
                {
                     count++;
                    //skip inner loop since each i can only have one pair of 
                    //integers which absolute difference equals to k
                    break;
                }   
            }
                while(i<nums.length-1 && nums[i]==nums[i+1])
                i++;

        }
        
        return count;
    }
}

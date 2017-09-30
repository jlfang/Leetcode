package array;

/**
 * 
 * Problem 665
 * 
 * Given an array with n integers, your task is to check if it could become 
 * non-decreasing by modifying at most 1 element.
 *
 * We define an array is non-decreasing 
 * if array[i] <= array[i + 1] holds for every i (1 <= i < n).
 * 
 *
 */


public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        if(nums==null || nums.length <=1)
            return true;
        
        int count =0;
        
        for(int i=1;i<nums.length && count<2;i++)
        {
            if(nums[i]<nums[i-1])
            {
                count++;
                if(i-2<0 || nums[i] >= nums[i-2])
                {
                    nums[i-1]=nums[i];
                }
                else
                {
                    nums[i]=nums[i-1];
                }
                    
            }
              System.out.println("After Modification: "+nums[i]);  
        }
        return count<2;
    }
}

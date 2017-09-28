package array;

import java.util.Arrays;


	/**
	 * Problem 611
	 * Given an array consists of non-negative integers, 
	 * your task is to count the number of triplets chosen 
	 * from the array that can make triangles if we take them as 
	 * side lengths of a triangle.
	 *
	 */
public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        if(nums==null || nums.length ==0)
            return 0;
        
        int count =0;
        int n = nums.length-1;
        
        Arrays.sort(nums);
        
        for(int i=n;i>=2;i--)
        {
            int low = 0;
            int high = i-1;
            
            while(low<high)
            {
                if(nums[low]+nums[high]>nums[i])
                {
                    count+=(high-low);
                    high--;
                }
                else
                    low++;

            }
        }
        return count;
        
    }
}

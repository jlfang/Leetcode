package array;


/**
 * 
 * Problem 31
 * 
 * Implement next permutation, which rearranges numbers into the lexicographically 
 * next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order 
 * (ie, sorted in ascending order).
 * The replacement must be in-place, do not allocate extra memory.
 * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 *
 */

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
            
        
        if(i>=0)
        {
            int j=nums.length-1;
            
            while(j>=0 && nums[i]>=nums[j])
            {
                j--;
            }
            swap(nums,i,j);
            
        }
        reverse(nums,i+1);
        
    }
    
    
    public void reverse(int[] nums,int start)
    {
        int i = start;
        int j = nums.length-1;
        
        while(i<j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
        
    }
    
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

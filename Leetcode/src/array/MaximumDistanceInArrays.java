package array;

import java.util.List;

/**
 * Problem 624
 * 
 * Given m arrays, and each array is sorted in ascending order. 
 * Now you can pick up two integers from two different arrays 
 * (each array picks one) and calculate the distance. 
 * We define the distance between two integers a and b to be 
 * their absolute difference |a-b|. 
 * Your task is to find the maximum distance.
 *
 */

public class MaximumDistanceInArrays {
    
    //  In this Problem we only have to keep track of 3 values: 
    //  current max distance, max value, min value
    //
    public int maxDistance(List<List<Integer>> arrays) 
    {
        if(arrays == null || arrays.size() == 0)
            return 0;
        
        
        int res = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        
        for(int i=1;i<arrays.size();i++)
        {
            res = Math.max(Math.abs(max-arrays.get(i).get(0)),res);
            res = Math.max(Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min),res);
            max = Math.max(arrays.get(i).get(arrays.get(i).size()-1),max);
            min = Math.min(arrays.get(i).get(0),min);
        }
        
        return res;
    }
}

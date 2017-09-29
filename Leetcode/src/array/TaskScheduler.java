package array;

import java.util.Arrays;

/**
 * Problem 621
 * 
 * Given a char array representing tasks CPU need to do. 
 * It contains capital letters A to Z where different letters 
 * represent different tasks.Tasks could be done without original 
 * order. Each task could be done in one interval. For each interval, 
 * CPU could finish one task or just be idle.
 * 
 * However, there is a non-negative cooling interval n that means 
 * between two same tasks, there must be at least n intervals that 
 *
 * CPU are doing different tasks or just be idle.
 * You need to return the least number of intervals the CPU will 
 * take to finish all the given tasks.
 *
 */


public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if(tasks==null || tasks.length == 0)
            return 0;
        
        
        int[] count = new int[26];
        
        for(char task:tasks)
        {
            count[task-'A']++;
        }
        
        
        Arrays.sort(count);
        
        int i=25;
        int maxCount = count[25];
        while(i>0 && count[i]==count[25])
            i--;
        
        return Math.max(tasks.length,((maxCount-1)*(n+1)+(25-i)));
        
    }
}

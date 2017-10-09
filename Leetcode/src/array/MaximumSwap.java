package array;

/**
 * 
 * Problem 670
 * 
 * Given a non-negative integer, you could swap two digits 
 * at most once to get the maximum valued number. 
 * Return the maximum valued number you could get.
 *
 */

public class MaximumSwap {
    public int maximumSwap(int num) {
        char[] num_array = Integer.toString(num).toCharArray();
        int[] index = new int[10];
        
        for(int i=0;i<num_array.length;i++)
        {
            index[num_array[i]-'0'] = i;
        }
        
        for(int i=0;i<num_array.length;i++)
        {
            for(int j=9;j>num_array[i]-'0';j--)
            {
                if(index[j]>i)
                {
                    char temp = num_array[i];
                    num_array[i] = num_array[index[j]];
                    num_array[index[j]] = temp;
                    return Integer.parseInt(new String(num_array));
                }
            }
        }
        return num;
    }
}

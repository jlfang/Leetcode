package array;

/**
 *
 * Problem 605
 * Suppose you have a long flowerbed in which some of the plots 
 * are planted and some are not. However, flowers cannot be planted 
 * in adjacent plots - they would compete for water and both would die.
 *
 * Given a flowerbed (represented as an array containing 0 and 1, 
 * where 0 means empty and 1 means not empty), and a number n,
 * return if n new flowers can be planted in it 
 * without violating the no-adjacent-flowers rule.
 *
 */

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int pos =0;
        int count =0;
        
        while(pos<flowerbed.length)
        {
            if(flowerbed[pos]==0 && (pos==0 || flowerbed[pos-1]==0) && (pos==flowerbed.length-1 || flowerbed[pos+1]==0))
            {
                count++;
                flowerbed[pos]=1;
            }
            if(count>=n)
                return true;
            
            pos++;
        }
        return false;
    }
}

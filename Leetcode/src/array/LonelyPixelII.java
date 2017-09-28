package array;

/**
 * Problem 533
 * Given a picture consisting of black and white pixels, 
 * and a positive integer N, find the number of black pixels 
 * located at some specific row R and column C that align with 
 * all the following rules:
 *
 *	1.	Row R and column C both contain exactly N black pixels.
 *	2.	For all rows that have a black pixel at column C, they should be exactly the same as row R
 *
 *	The picture is represented by a 2D char array 
 *  consisting of 'B' and 'W', which means black and 
 *  white pixels respectively.
**/
public class LonelyPixelII {
    public int findBlackPixel(char[][] picture, int N) {
        if(picture == null || picture.length == 0)
            return 0;
        
        int m = picture.length;
        int n = picture[0].length;       
        
        int[] row_count = new int[m];
        int[] col_count = new int[n];
        int res = 0;

        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(picture[i][j]=='B')
                {
                    row_count[i]++;
                    col_count[j]++;
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(picture[i][j]=='B' && row_count[i] == N && col_count[j] == N)
                {
                    String iString = String.valueOf(picture[i]);
                    
                    int count_k =0;
                    for(int k=0;k<m;k++)
                    {
                        if(k!= i && picture[k][j] == 'B')
                        {
                            String kString = String.valueOf(picture[k]);
                            if(!iString.equals(kString))
                                break;
                            else
                                count_k++;
                        }
                    }
                    if(count_k == (N-1))
                        res++;
                    
                }
            }
        }
            return res;
    }
}

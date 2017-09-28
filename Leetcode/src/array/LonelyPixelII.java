package array;

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

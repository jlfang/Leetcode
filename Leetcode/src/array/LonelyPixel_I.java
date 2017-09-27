package array;

public class LonelyPixel_I {
    public int findLonelyPixel(char[][] picture) {
        if(picture.length ==0 || picture == null)
            return 0;
        
        int count =0;
            
        int[] row_count = new int[picture.length];
        int[] col_count = new int[picture[0].length];
        int[] in_row_index = new int[picture.length];
        
            for(int i=0;i<picture.length;i++)
            {
                for(int j=0;j<picture[0].length;j++)
                {
                    
                    if(picture[i][j] == 'B')
                    {
                        in_row_index[i] = j;
                        row_count[i]++;
                        col_count[j]++;
                    }
    
                }
            }
        
        for(int i=0;i<picture.length;i++)
        {
            if(row_count[i]==1)
            {
                if(col_count[in_row_index[i]]==1)
                {
                    count++;
                }
            }
        }
        
        
        return count;
    }
}

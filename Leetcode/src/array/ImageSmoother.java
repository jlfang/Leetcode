package array;

public class ImageSmoother {
	
	/**
	 * Given a 2D integer matrix M representing the gray scale of
	 * an image, you need to design a smoother to make the gray 
	 * scale of each cell becomes the average gray scale (rounding down) 
	 * of all the 8 surrounding cells and itself. If a cell has less than 
	 * 8 surrounding cells, then use as many as you can.
	 */
	
    public int[][] imageSmoother(int[][] M) {
        if(M.length ==0 || M==null)
            return M;
        int m = M.length;
        int n = M[0].length;
        int[][] result = new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int avg = getAverage(M,i,j,m,n);
                result[i][j] = avg;
            }
        }
        return result;
    }
    
    public int getAverage(int[][] M, int i, int j, int m, int n)
    {
        int sum =0;
        sum+=M[i][j];
        int count =1;
        
        //top left corner
        if(i-1>=0 && j-1>=0)
        {
            sum+=M[i-1][j-1];
            count++;
        }
        
        //top 
        if(i-1>=0)
        {
            sum+=M[i-1][j];
            count++;
        }
        
        //top right corner
        if(i-1>=0 && j+1<n)
        {
            sum+=M[i-1][j+1];
            count++;
        }
        
        //left
        if(j-1>=0)
        {
            sum+=M[i][j-1];
            count++;
        }
        
        //right
        if(j+1<n)
        {
            sum+=M[i][j+1];
            count++;
        }
        
        //bottom left corner
        if(i+1<m && j-1>=0)
        {
            sum+=M[i+1][j-1];
            count++;
        }
        
        //bottom
        if(i+1<m)
        {
            sum+=M[i+1][j];
            count++;
        }
        //bottom right corner
        if(i+1 <m && j+1<n)
        {
            sum+=M[i+1][j+1];
            count++;
        }
        
        int result = (int)Math.floor((double)sum/count);
        
        return result;
        
        
    }
}

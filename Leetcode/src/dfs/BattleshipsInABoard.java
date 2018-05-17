package dfs;

public class BattleshipsInABoard {
    private int[] dir_x = {0,1, 0,-1};
    private int[] dir_y = {1,0,-1, 0};
    
    public BattleshipsInABoard() {
    	
    }
    
    public int countBattleships(char[][] board) {
        int height = board.length;
        int width  = board[0].length;
        int res= 0;
        
        boolean[][] visited = new boolean[height][width];

        for(int k=0;k<height;k++){
            for(int l=0;l<width;l++){
                if(!visited[k][l] && board[k][l]=='X'){
                    DFS(board,visited,k,l,height,width);
                    res++;
                }
            }
        }
        return res;
    }
    
    
    public void DFS(char[][] board,boolean[][] visited,int i,int j,int height,int width){
        
        int x = 0;
        int y = 0;
        visited[i][j] = true;
        for(int k=0;k<4;k++){
            x = i + dir_x[k];
            y = j + dir_y[k];
        
        if(x>0 && x<board.length && y>0 && y<board[0].length && board[x][y]=='X'&& !visited[x][y]){
            DFS(board,visited,x,y,height,width);
            }
        }
    }
    
    public static void main(String[] args) {
    	char[][] board = new char[1][3];
/*    	
    	board[0][0] = 'X';
    	board[0][1] = '.';
    	board[0][2] = '.';
    	board[0][3] = 'X';
    	board[1][0] = '.';
    	board[1][1] = '.';
    	board[1][2] = '.';
    	board[1][3] = 'X';
    	board[2][0] = '.';
    	board[2][1] = '.';
    	board[2][2] = '.';
    	board[2][3] = 'X';
    	*/
    	board[0][0] = 'X';
    	board[0][1] = 'X';
    	board[0][2] = 'X';
    	
    	BattleshipsInABoard cons = new BattleshipsInABoard();
    	cons.countBattleships(board);
    }
}

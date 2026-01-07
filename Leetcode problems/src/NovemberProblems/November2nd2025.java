package NovemberProblems;

public class November2nd2025 {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] board =new int[m][n];
        int uo=0;
        for (int[] guard:guards) {
            board[guard[0]][guard[1]]=1;
        }
        for(int[] wall:walls){
            board[wall[0]][wall[1]]=2;
        }
        for (int i = 0; i <guards.length ; i++) {
            int r=guards[i][0];
            int c=guards[i][1];
            //up
            for (int row=r-1;r>=0;r--){
                if (board[row][c]==1||board[row][c]==2)break;
                board[row][c]=3;
            }
            //down
            for (int row=r+1;r<m;row++){
                if (board[row][c]==1||board[row][c]==2)break;
                board[row][c]=3;
            }
            //left
            for (int col=c-1;c>=0;c--){
                if (board[r][col]==1||board[r][col]==2)break;
                board[r][col]=3;
            }
            //right
            for(int col=c+1;c<n;col++){
                if (board[r][col]==1||board[r][col]==2)break;
                board[r][col]=3;
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (board[i][j]==0)uo++;
            }
        }
        return uo;
    }
}

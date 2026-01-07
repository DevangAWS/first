void main() {
    int n=4;
    boolean[][] board=new boolean[n][n];
    queens(board,0);
}

int queens(boolean[][] board, int row){
    if (row==board.length){
        display(board);
        IO.println();
        return 1;
    }
    int count=0;
    for (int col=0;col<board.length;col++){
        if (isSafe(board,row,col)){
            board[row][col]=true;
            count+=queens(board,row+1);
            board[row][col]=false;
        }
    }
    return count;
}

boolean isSafe(boolean[][] board, int row, int col){
    for (int i = 0; i <row; i++) {
        if (board[i][col])return false;
    }
    int leftMost=Math.min(row,col);
    for (int i = 1; i <=leftMost; i++) {
        if (board[row-i][col-i])return false;
    }
    int rightMost=Math.min(row, board.length-col-1);
    for (int i = 1; i <=rightMost; i++) {
        if (board[row-i][col+i])return false;
    }
    return true;
}

void display(boolean[][] board){
    for (boolean[] row :board){
        for (boolean element:row){
            if (element)IO.print("Q ");
            else IO.print("X ");
        }
        IO.println();
    }
}
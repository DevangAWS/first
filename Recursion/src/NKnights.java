void main() {
    int n=4;
    boolean[][] board=new boolean[n][n];
    knight(board,0,0,5);
}

void knight(boolean[][] board, int row, int col, int knights){
    if (knights==0){
        display(board);
        IO.println();
        return;
    }
    if (row== board.length-1 && col==board[0].length-1){
        return;
    }
    if (col==board.length){
        knight(board,row+1,0,knights);
        return;
    }
    if (isSafe(board,row,col)){
        board[row][col]=true;
        knight(board,row,col+1,knights-1);
        board[row][col]=false;
    }
    knight(board,row,col+1,knights);
}

boolean isSafe(boolean[][] board, int row, int col){
    if (isValid(board,row,col)){
        if (board[row][col])return false;
    }
    if (isValid(board,row-2,col+1)){
        if (board[row-2][col+1])return false;
    }
    if (isValid(board,row-2,col-1)){
        if (board[row-2][col-1])return false;
    }
    if (isValid(board,row-1,col+2)){
        if (board[row-1][col+2])return false;
    }
    if (isValid(board,row-1,col-2)){
        return !board[row - 1][col - 2];
    }
    return true;
}

boolean isValid(boolean[][] board, int row, int col){
    return row >= 0 && row < board.length && col >= 0 && col < board.length;
}

void display(boolean[][] board){
    for (boolean[] row:board){
        for (boolean element: row){
            if (element)IO.print("K ");
            else IO.print("X ");
        }
        IO.println();
    }
}
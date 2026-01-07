//void main() {
//
//}
//
//boolean solve(int[][] board){
//    int n= board.length;
//    int row=-1;
//    int col=-1;
//
//}
//
//boolean isSafe(int[][] board, int row, int col, int num){
//    for (int i = 0; i < board.length; i++) {
//        if ((board[row][col]==num)){return false;}
//    }
//    for (int[] nums:board){
//        if (nums[col]==num){return false;}
//    }
//    int sqrt=(int)(Math.sqrt(board.length));
//    int startRow=row-row%sqrt;
//    int startCol=col-col%sqrt;
//    for (int r=startRow;r<startRow+sqrt;r++){
//        for (int c=startCol;c<startCol+sqrt;r++){
//            if (board[r][c]==num)return false;
//        }
//    }
//    return true;
//}
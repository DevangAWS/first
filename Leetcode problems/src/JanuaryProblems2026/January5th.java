package JanuaryProblems2026;

public class January5th {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int m= matrix.length;
        for (int i=0;i<m;i++){
            for (int j = 0; j <m-1; j++) {
                if ((matrix[i][j]+matrix[i][j+1])<matrix[i][j])rowOps(matrix,i);
                if ((matrix[i][j]+matrix[i+1][j])<matrix[i][j])colOps(matrix,j);
            }
        }
        return sum;
    }
    public boolean testing(int[][] arr, int r, int c){
        int a=arr.length;
        return false;
    }
    public int[][] rowOps(int[][] arr, int r){
        int a=arr.length;
        for (int i = 0; i < a; i++) {
            arr[r][i]=-1*arr[r][i];
        }
        return arr;
    }
    public int[][] colOps(int[][] arr, int c){
        int a=arr.length;
        for (int i = 0; i < a; i++) {
            arr[i][c]=-1*arr[i][c];
        }
        return arr;
    }
}

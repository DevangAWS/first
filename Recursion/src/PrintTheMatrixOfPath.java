void main() {
    boolean[][] arr={{true,true,true,true},{true,true,true,true},{true,true,true,true},{true,true,true,true}};
    int[][] path=new int[arr.length][arr[0].length];
    pathTraceAndPrint("",arr,0,0,path,1);
}

void pathTraceAndPrint(String p,boolean[][] arr, int r, int c,int[][] path,int step){
    if (r==arr.length-1&&c==arr[0].length-1){
        path[r][c]=step;
        for(int[] i:path){
            IO.println(Arrays.toString(i));
        }
        IO.println(p);
        IO.println();
        return;
    }
    if (!arr[r][c])return;
    arr[r][c]=false;
    path[r][c]=step;
    if (r<arr.length-1)pathTraceAndPrint(p+'D',arr,r+1,c,path,step+1);
    if (c<arr[0].length-1)pathTraceAndPrint(p+'R',arr,r,c+1,path,step+1);
    if (r>0)pathTraceAndPrint(p+'U',arr,r-1,c,path,step+1);
    if (c>0)pathTraceAndPrint(p+'L',arr,r,c-1,path,step+1);
    if(r<arr.length-1 && c<arr[0].length-1)pathTraceAndPrint(p+'S',arr,r+1,c+1,path,step+1);
    if(r>0 && c>0)pathTraceAndPrint(p+'V',arr,r-1,c-1,path,step+1);
    path[r][c]=0;
    arr[r][c]=true;
}
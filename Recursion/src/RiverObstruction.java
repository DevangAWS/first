void main(){
    boolean[][] arr={{true,true,true},{true,false,true},{true,true,true}};
    obstruction(0,0,"",arr);
}

void obstruction(int r, int c, String p, boolean[][] arr){
    if (r==arr.length-1 && c==arr[0].length-1){
        IO.println(p);
        return;
    }
    if (!arr[r][c])return;
    if (r<arr.length-1)obstruction(r+1,c,p+'L',arr);
    if (c<arr[0].length-1)obstruction(r,c+1,p+'R',arr);
}
void main() {
    boolean[][] arr={{true,true,true},{true,true,true},{true,true,true}};
    allPaths("",arr,0,0);
}

void allPaths(String p, boolean[][] maze, int r, int c){
    if (r== maze.length-1 && c==maze[0].length-1){
        IO.println(p);
        return;
    }
    if (!maze[r][c])return;
    maze[r][c]=false;
    if (r<maze.length-1)allPaths(p+'D',maze,r+1,c);
    if (c<maze[0].length-1)allPaths(p+'R',maze,r,c+1);
    if (r>0)allPaths(p+'U',maze,r-1,c);
    if (c>0)allPaths(p+'L',maze,r,c-1);
    maze[r][c]=true;
}
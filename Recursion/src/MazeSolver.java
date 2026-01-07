void main() {
    int a=noOfWays(3,3);
    IO.println(a);

    noOfWaysStr(3,3,"");

    IO.println(noOfWaysList(3,3,""));
}

int noOfWays(int r, int c){
    if (r==1||c==1){
        return 1;
    }
    int left=noOfWays(r-1,c);
    int right=noOfWays(r,c-1);
    return left+right;
}

void noOfWaysStr(int r, int c, String p){
    if (r==1||c==1){
        IO.println(p);
        return;
    }
    if (r>1)noOfWaysStr(r-1,c,p+'L');
    if (c>1)noOfWaysStr(r,c-1,p+'R');
}

ArrayList<String> noOfWaysList(int r, int c, String p){
    if (r==1||c==1){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> list=new ArrayList<>();
    if (r>1&&c>1)list.addAll(noOfWaysList(r-1,c-1,p+'D'));
    if (r>1)list.addAll(noOfWaysList(r-1,c,p+'L'));
    if (c>1)list.addAll(noOfWaysList(r,c-1,p+'R'));
    return list;
}

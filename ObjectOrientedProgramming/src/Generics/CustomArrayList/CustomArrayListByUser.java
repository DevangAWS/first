package Generics.CustomArrayList;

public class CustomArrayListByUser {
    private int length=0;
    private String[] data;
    private static final int DEFAULT_SIZE=10;
    private boolean isFull(){
        return length==data.length;
    }

    public CustomArrayListByUser(){
        data= new String[DEFAULT_SIZE];
    }

    public void add(String num){
        if (isFull()){
            resize();
        }
        data[length++]=num;
    }

    public void sizeOfList(){
        System.out.println(length);
    }

    public void remove(String nums){
        for (int i = 0; i < data.length; i++) {
            if (data[i]==null)continue;
            if (data[i].equals(nums)){
                data[i]=null;
            }
        }
    }

    private void resize() {
        String[] temp = new String[data.length*2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data=temp;
    }

    public String getIndex(int index){
        return data[index];
    }

    public String setIndex(int index, String word){
        return data[index]=word;
    }

    public void print(){
        int i=0;
        System.out.print("\n[");
        while (i<data.length){
            boolean nullCheck=(data[i]==null);
            if (i==data.length-1)System.out.print("]");
            if (!nullCheck) {
                System.out.print(data[i]);
                System.out.print(", ");
            }
            i++;
        }
    }
}

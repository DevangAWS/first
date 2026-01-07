package Generics.CustomGenericsArrayList;

public class CustomArrayListUserDefined<T extends Number>{
    private int length=0;
    private Object[] data;
    private static final int DEFAULT_SIZE=10;


    private boolean isFull(){return length==data.length;}

    public CustomArrayListUserDefined() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T addToList){
        if (isFull()){
            resize();
        }
        data[length++]=addToList;
    }

    public void remove(T removeFromList){
        for (int i = 0; i < data.length; i++) {
            if (data[i]==null)continue;
            if (data[i].equals(removeFromList)){
                data[i]=data[data.length-1];
                data[data.length-1]=null;
                length--;
            }
        }
    }

    public void getIndex(int index){
        System.out.println("\nThe data at index "+index+" is "+data[index]);
    }

    public void setIndex(int index, T dataToBeReplaced){
        data[index]=dataToBeReplaced;
    }

    private void resize() {
        Object[] temp=new Object[2*data.length];
        System.arraycopy(data, 0, temp, 0, data.length);
        data=temp;
    }

    public void sizeOfArrayList(){
        System.out.println("\nthe length of arrayList is "+length);
    }


    public void print() {
        int i=0;
        System.out.print("\nCustomer Array List \ndata=[");
        while (i<data.length){
            boolean nullCheck=(data[i]==null);
            if (i == data.length-1) {
                System.out.print("]");
                break;
            }
            if (!nullCheck){
                System.out.print(data[i]);
                if (i < length-1)
                    System.out.print(", ");
                i++;
            }
        }
    }
}

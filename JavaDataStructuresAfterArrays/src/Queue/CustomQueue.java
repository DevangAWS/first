package Queue;
public class CustomQueue<T> {
    private final T[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public CustomQueue() {this(DEFAULT_SIZE);}
    @SuppressWarnings("unchecked")
    public CustomQueue(int size) {this.data=(T[]) new Object[size];}
    public boolean isFull(){return end==data.length;}
    public boolean isEmpty(){return end==0;}
    public boolean insert(T item){
        if (isFull()){return false;}
        data[end++]=item;
        return true;
    }
    public T remove() throws Exception{
        if (isEmpty()){throw new Exception("Queue is Empty");}
        T removed=data[0];
        for (int i = 1; i <end ; i++) {data[i-1]=data[i];}
        end--;
        return removed;
    }
    public T front() throws Exception{
        if (isEmpty()){throw new Exception("Queue is Empty");}
        return data[0];
    }
}
class RunCustomQueue{
    static void main() throws Exception {
        CustomQueue<Integer> queue=new CustomQueue<>();
        for(int i=0;i<10;i++){queue.insert(i);}
        for(int i = 0; i <10 ; i++){System.out.println(queue.remove());}
        queue.remove();
    }
}
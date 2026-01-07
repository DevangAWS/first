package Stacks;
public class CustomStack<T> {
    protected T[] data;
    private static final int Default_Size=10;
    int ptr=-1;
    public CustomStack() {
        this(Default_Size);
    }
    @SuppressWarnings("unchecked")
    public CustomStack(int size) {
        this.data=(T[]) new Object[size];
    }
    public boolean push(T item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public T pop() throws StackExceptions{
        if (isEmpty()){
            throw new StackExceptions("Cannot pop from Empty Stack");
        }
        T removed=data[ptr];
        ptr--;
        return removed;
    }
    public T peek() throws StackExceptions{
        if (isEmpty()){
            throw new StackExceptions("Cannot Peek into Empty Stack");
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}

class RunCustomStack{
    static void main() throws StackExceptions {
        CustomStack<Integer> stack=new CustomStack<>();
        stack.push(55);
        stack.push(45);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
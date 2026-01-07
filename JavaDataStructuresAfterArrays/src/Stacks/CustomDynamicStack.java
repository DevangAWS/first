package Stacks;

public class CustomDynamicStack<T> extends CustomStack{
    public CustomDynamicStack() {
    }
    public CustomDynamicStack(int size) {
        super(size);
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean push(Object item) {
        if (this.isFull()){
            T[] temp=(T[]) new Object[data.length*2];
            for (int i = 0; i <data.length ; i++) {
                temp[i]= (T) data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}

class RunCustomDynamicStack{
    static void main() throws StackExceptions{
        CustomDynamicStack<Integer> customDynamicStack=new CustomDynamicStack<>();
        for (int i = 0; i <20 ; i++) {
            customDynamicStack.push(i);
        }
        for (int i = 0; i <20 ; i++) {
            System.out.println(customDynamicStack.pop());
        }
    }
}
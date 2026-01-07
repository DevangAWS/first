package LinkedListKK.singleLinkedList;

public class CustomNode<T>{
    private CustomNode<T> head;
    private CustomNode<T> tail;
    private T val;
    private CustomNode<T> next;
    private int size;

    public CustomNode() {
        this.size=0;
    }

    public CustomNode(T val) {
        this.val = val;
    }

    public CustomNode(T val, CustomNode<T> next) {
        this.val = val;
        this.next = next;
    }

    public void sizeOfList(){
        System.out.println("\nSize of list is "+size);
    }

    public void insertAtFirst(T val){
        CustomNode<T> node = new CustomNode<>(val);
        node.next=head;
        head=node;
        if (tail==null)tail=head;
        size+=1;
    }

    public void insertAtLast(T val){
        if (tail==null){
            insertAtFirst(val);
            return;
        }
        CustomNode<T> node = new CustomNode<>(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insertInMiddle(int position, T val){
        if (position==0){
            insertAtFirst(val);
            return;
        }
        if (position==size){
            insertAtLast(val);
            return;
        }
        CustomNode<T> temp=head;
        for (int i = 1; i < position; i++) {
            temp=temp.next;
        }
        CustomNode<T> node = new CustomNode<>(val,temp.next);
        temp.next=node;
        size++;
    }

    public void deleteFirst(){
        T val= head.val;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        System.out.println("\n"+val+" has been removed");
    }

    public void deleteLast(){
        if (size <= 1){
            deleteFirst();
            return;
        }
        CustomNode<T> secondLast = get(size-1);
        T val=tail.val;
        tail=secondLast;
        tail.next=null;
        size--;
        System.out.println("\n"+val+" has been deleted");
    }

    public void deleteFromPosition(int index){
        if (index==0){
            deleteFirst();
            return;
        }
        if (index==(size)){
            deleteLast();
            return;
        }
        CustomNode<T> node=get(index-1);
        node.next=get(index+1);
        size--;
        System.out.println("value at position "+index+" has been removed");
    }

    public void clear(){
        head=tail=null;
        size=0;
    }

/*    public void deleteByValue(T value){
        boolean removed=false;
        for (int i = 1; i <=size; i++) {
            T check=(T)get(i);
            if (check==value){
                CustomNode<T> node=get(i-1);
                node.next=get(i+1);
                removed=true;
                size--;
            }
        }
        if (removed)System.out.println("\n"+value+" has been removed");
        else System.out.println("No matching values found");
    }*/

    public CustomNode<T> get(int index){
        CustomNode<T> node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        CustomNode<T> temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
}

class RunCustomNode{
    static void main() {
        CustomNode<Integer> node = new CustomNode<>();
        for (int i = 5; i>0; i--) {
            node.insertAtFirst(i);
        }
        node.insertAtLast(6);
        node.insertAtLast(7);
//        node.insertInMiddle(3,50);
//        node.display();
        node.deleteFromPosition(4);
        node.display();
        node.sizeOfList();
        node.clear();
        node.display();
//        CustomNode<String> node1 = new CustomNode<>();
//        node1.insertAtFirst("dev");
//        node1.insertAtFirst("dish");
//        node1.insertAtFirst("damn");
//        node1.insertAtLast("lol");
//        node1.insertInMiddle(2,"gouba");
//        node1.display();
    }
}
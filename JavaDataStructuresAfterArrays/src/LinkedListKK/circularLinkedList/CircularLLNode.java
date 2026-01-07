package LinkedListKK.circularLinkedList;

public class CircularLLNode<T> {
    private CircularLLNode<T> prev;
    private T value;
    private CircularLLNode<T> next;
    private CircularLLNode<T> head;
    private CircularLLNode<T> tail;
    private int size;

    public CircularLLNode() {
        this.size=0;
    }

    public CircularLLNode(T value) {
        this.value = value;
    }

    public void insertFirst(T value){
        CircularLLNode<T> newNode=new CircularLLNode<>(value);
        if (head==null){
            head=tail=newNode;
            head.prev=head;
            head.next=head;
        }
        else {
            newNode.next=head;
            newNode.prev=tail;
            head.prev=newNode;
            tail.next=newNode;
            head=newNode;
        }
        size++;
    }

    public void insertLast(T value){
        CircularLLNode<T> newNode=new CircularLLNode<>(value);
        if (tail==null){
            insertFirst(value);
        }
        newNode.prev=tail;
        newNode.next=head;
        tail.next=newNode;
        head.prev=newNode;
        tail=newNode;
        size++;
    }

    public void insertGivenIndex(int index,T value){
        CircularLLNode<T> newNode=new CircularLLNode<>(value);
        if (index==1){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
        int end=size-index;
        if (index<end){
            boolean start=true;
            CircularLLNode<T> temp=get(index,start);
            newNode.prev=temp;
            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;
        }
        else {
            boolean start=false;
            CircularLLNode<T> temp=get(index,start);
            newNode.next=temp;
            newNode.prev=temp.prev;
            temp.prev.next=newNode;
            temp.prev=newNode;
        }
        size++;
    }

    public void deleteFirst(){
        tail.next=head.next;
        head.next.prev=tail;
        head=head.next;
        size--;
    }

    public void deleteLast(){
        head.prev=tail.prev;
        tail.prev.next=head;
        tail=tail.prev;
        size--;
    }

    public void deleteGivenIndex(int index){
        if (index==1){
            deleteFirst();
            return;
        }
        if (index==size){
            deleteLast();
            return;
        }
        int end=size-index;
        if (index<end){
            boolean start=true;
            CircularLLNode<T> temp=get(index,start);
            temp.next.next.prev=temp;
            temp.next=temp.next.next;
        }
        else {
            boolean start=false;
            CircularLLNode<T> temp=get(index,start);
            temp.prev.prev.next=temp;
            temp.prev=temp.prev.prev;
        }
        size--;
    }

    public void clear(){
        head=tail=null;
        size=0;
    }

    public CircularLLNode<T> get(int index,boolean startPoint){
        CircularLLNode<T> temp;
        if (startPoint) {
            temp = head;
            for (int i = 1; i <index; i++) {
                temp=temp.next;
            }
        }
        else {
            temp = tail;
            for (int i = size; i>index; i--) {
                temp=temp.prev;
            }
        }
        return temp;
    }

    public void print(boolean forOrBack) {
        if (size == 0 || head == null || tail == null) {
            System.out.println("List is empty.");
            return;
        }
        int a=size;
        if (forOrBack){
            CircularLLNode<T> temp=head;
            System.out.println("Forward printing of Circular Linked List");
            while (a>0){
                System.out.print(temp.value+"->");
                temp=temp.next;
                a--;
            }
        }
        else {
            CircularLLNode<T> temp=tail;
            System.out.println("Backward printing of Circular Linked List");
            while (a>0){
                System.out.print(temp.value+"->");
                temp=temp.prev;
                a--;
            }
        }
        System.out.println("END");
    }
}

class runCircularNode{
    static void main() {
        CircularLLNode<Integer> cllNode=new CircularLLNode<>();
        for (int i = 5; i >0 ; i--) {
            cllNode.insertFirst(i);
        }
        cllNode.print(true);
        cllNode.print(false);
        cllNode.insertLast(6);
        cllNode.insertGivenIndex(3,55);
        cllNode.print(true);
        cllNode.print(false);
        cllNode.deleteGivenIndex(3);
        cllNode.print(true);
        cllNode.print(false);
        cllNode.clear();
        cllNode.print(true);
        cllNode.print(false);
    }
}
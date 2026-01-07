//package LinkedListKK.doubleLinkedList;
//
//public class NodeDoubleLL<T> {
//    private NodeDoubleLL<T> prev;
//    private T value;
//    private NodeDoubleLL<T> next;
//    private NodeDoubleLL<T> head;
//    private NodeDoubleLL<T> tail;
//    private int size;
//
//    public NodeDoubleLL() {
//        this.size=0;
//    }
//
//    public NodeDoubleLL(T value) {
//        this.value = value;
//    }
//
//    public NodeDoubleLL(NodeDoubleLL<T> prev, T value, NodeDoubleLL<T> next) {
//        this.prev = prev;
//        this.value = value;
//        this.next = next;
//    }
//
//    public void insertFirst(T value){
//        NodeDoubleLL<T> nodeDoubleLL=new NodeDoubleLL<>(value);
//        nodeDoubleLL.prev=null;
//        nodeDoubleLL.next=head;
//        if (head!=null){
//            head.prev=nodeDoubleLL;
//        }
//        head=nodeDoubleLL;
//        if (tail==null)tail=head;
//        size++;
//    }
//
//    public void insertLast(T value){
//        if (tail==null){
//            insertFirst(value);
//            return;
//        }
//        NodeDoubleLL<T> nodeDoubleLL=new NodeDoubleLL<>(value);
//        nodeDoubleLL.prev=tail;
//        tail.next=nodeDoubleLL;
//        tail=nodeDoubleLL;
//        size++;
//    }
//
//    public void insertInBetween(int index,T value){
//        if (index==1){
//            insertFirst(value);
//            return;
//        }
//        if (index==size+1 || index==size){
//            insertLast(value);
//            return;
//        }
//        NodeDoubleLL<T> temp=head;
//        for (int i = 1; i <index-1 ; i++) {
//            temp=temp.next;
//        }
//        NodeDoubleLL<T> nextNode=temp.next;
//        NodeDoubleLL<T> newNode=new NodeDoubleLL<>(temp,value,nextNode);
//        temp.next=newNode;
//        nextNode.prev=newNode;
//        size++;
//    }
//
//    public void insertAfter(T value,T insertValue){
//        NodeDoubleLL<T> newNode=new NodeDoubleLL<>(insertValue);
//        NodeDoubleLL<T> temp=head;
//        for (int i = 1; i <=size ; i++) {
//            if (value.equals(temp.value)){
//                newNode.insertInBetween(i+1,insertValue);
//                return;
//            }
//            temp=temp.next;
//        }
//        System.out.println("Value not found "+value);
//    }
//
//    public void deleteStart(){
//        if (head==null)return;
//        head=head.next;
//        if (head != null) head.prev = null;
//        else tail=null;
//        size--;
//    }
//
//    public void deleteLast(){
//        if (tail == null) return;
//        tail=tail.prev;
//        if (tail != null) tail.next = null;
//        else head=null;
//        size--;
//    }
//
//    public void deletePosition(int index){
//        if (index < 1 || index > size) return;
//        if (index==1){
//            deleteStart();
//            return;
//        }
//        if (index==size){
//            deleteLast();
//            return;
//        }
//        NodeDoubleLL<T> prevNode=get(index-1);
//        NodeDoubleLL<T> nextNode=get(index+1);
//        prevNode.next=nextNode;
//        nextNode.prev=prevNode;
//        size--;
//    }
//
//    private NodeDoubleLL<T> get(int index){
//        NodeDoubleLL<T> temp=head;
//        for (int i = 1; i <index; i++) {
//            temp=temp.next;
//        }
//        return temp;
//    }
//
//    public void print(boolean forOrBack){
//        if (forOrBack) {
//            System.out.println("Printing Normally");
//            NodeDoubleLL<T> temp = head;
//            while (temp != null) {
//                System.out.print(temp.value + "->");
//                temp = temp.next;
//            }
//            System.out.println("END");
//        }
//        else {
//            System.out.println("Printing in reverse");
//            NodeDoubleLL<T> temp=tail;
//            while (temp!=null){
//                System.out.print(temp.value+"->");
//                temp=temp.prev;
//            }
//            System.out.println("START");
//        }
//    }
//}
//
//class runNodeDoubleLL{
//    static void main() {
//        NodeDoubleLL<Integer> node=new NodeDoubleLL<>();
//        for (int i = 5; i >0 ; i--) {
//            node.insertFirst(i);
//        }
//        node.insertLast(6);
//        node.insertInBetween(3,-3);
//        node.print(true);
//        node.print(false);
//        node.deleteStart();
//        node.deleteLast();
//        node.print(true);
//        node.print(false);
//        node.deletePosition(2);
//        node.print(true);
//        node.insertAfter(5,55);
//        node.print(true);
//    }
//}

package LinkedListKK.doubleLinkedList;

public class NodeDoubleLL<T> {
    private NodeDoubleLL<T> prev;
    private T value;
    private NodeDoubleLL<T> next;

    private NodeDoubleLL<T> head;
    private NodeDoubleLL<T> tail;
    private int size;

    public NodeDoubleLL() {
        this.size = 0;
    }

    public NodeDoubleLL(T value) {
        this.value = value;
    }

    public NodeDoubleLL(NodeDoubleLL<T> prev, T value, NodeDoubleLL<T> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    // ---------------- INSERT METHODS ----------------

    public void insertFirst(T value) {
        NodeDoubleLL<T> newNode = new NodeDoubleLL<>(value);
        newNode.prev = null;
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(T value) {
        if (tail == null) {  // list empty
            insertFirst(value);
            return;
        }

        NodeDoubleLL<T> newNode = new NodeDoubleLL<>(value);
        newNode.prev = tail;
        newNode.next = null;

        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insertInBetween(int index, T value) {
        if (index < 1 || index > size + 1) {
            System.out.println("Invalid index: " + index);
            return;
        }

        if (index == 1) {
            insertFirst(value);
            return;
        }

        if (index == size + 1) {
            insertLast(value);
            return;
        }

        NodeDoubleLL<T> temp = head;
        for (int i = 1; i < index - 1; i++) {
            temp = temp.next;
        }

        NodeDoubleLL<T> nextNode = temp.next;
        NodeDoubleLL<T> newNode = new NodeDoubleLL<>(temp, value, nextNode);

        temp.next = newNode;
        nextNode.prev = newNode;

        size++;
    }

    public void insertAfter(T value, T insertValue) {
        NodeDoubleLL<T> temp = head;

        for (int i = 1; i <= size; i++) {
            if (value.equals(temp.value)) {
                insertInBetween(i + 1, insertValue);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value not found: " + value);
    }

    // ---------------- DELETE METHODS ----------------

    public void deleteStart() {
        if (head == null) return;

        head = head.next;

        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // list is now empty
        }

        size--;
    }

    public void deleteLast() {
        if (tail == null) return;

        tail = tail.prev;

        if (tail != null) {
            tail.next = null;
        } else {
            head = null; // list is now empty
        }

        size--;
    }

    public void deletePosition(int index) {
        if (index < 1 || index > size) {
            System.out.println("Invalid index: " + index);
            return;
        }

        if (index == 1) {
            deleteStart();
            return;
        }

        if (index == size) {
            deleteLast();
            return;
        }

        NodeDoubleLL<T> prevNode = get(index - 1);
        NodeDoubleLL<T> nextNode = prevNode.next.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        size--;
    }

    public void clear(){
        head=tail=null;
    }

    // ---------------- GET METHOD ----------------

    private NodeDoubleLL<T> get(int index) {
        if (index < 1 || index > size) {
            System.out.println("Invalid index: " + index);
            return null;
        }

        NodeDoubleLL<T> temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // ---------------- PRINT METHOD ----------------

    public void print(boolean forOrBack) {
        if (forOrBack) {
            System.out.println("Printing Normally");
            NodeDoubleLL<T> temp = head;
            while (temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("END");
            return;
        }
        System.out.println("Printing in reverse");
        NodeDoubleLL<T> temp = tail;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("START");
    }
}

class runNodeDoubleLL {
    static void main() {
        NodeDoubleLL<Integer> node = new NodeDoubleLL<>();

        for (int i = 5; i > 0; i--) {
            node.insertFirst(i);
        }

        node.insertLast(6);
        node.insertInBetween(3, -3);
        node.print(true);
        node.print(false);

        node.deleteStart();
        node.deleteLast();
        node.print(true);
        node.print(false);

        node.deletePosition(2);
        node.print(true);

        node.insertAfter(5, 55);
        node.print(true);

        node.clear();
        node.print(true);
        node.print(false);

    }
}

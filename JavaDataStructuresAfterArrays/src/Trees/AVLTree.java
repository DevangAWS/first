package Trees;

public class AVLTree {
    public static class Node{
        int value,height;
        Node left,right;
        public Node(int value) {this.value = value;this.height=0;}
        public int getValue() {return value;}
    }
    private Node root;
    public AVLTree() {}

    public Node getRoot() {
        return root;
    }

    public int height(Node node){
        if (node==null)return -1;
        return node.height;
    }
    public boolean isEmpty(){return root==null;}
    public void insert(int value){root=insert(value,root);}
    public Node insert(int value, Node node){
        if (node==null)return new Node(value);
        if (value<node.value)node.left=insert(value,node.left);
        else if (value>node.value)node.right=insert(value,node.right);
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    private Node rotate(Node node){
//        if (balanced(node))return node;
        if ((height(node.left)-height(node.right))>1){
            //left heavy
            if ((height(node.left.left)-height(node.left.right))>0){
                //left-left case
                return rightRotate(node);
            }
            if ((height(node.left.left)-height(node.left.right))<0){
                //left-right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if ((height(node.left)-height(node.right))<-1){
            //right heavy
            if ((height(node.right.left)-height(node.right.right))<0){
                //right-right case
                return leftRotate(node);
            }
            if ((height(node.right.left)-height(node.right.right))>0){
                //left-right case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    private Node leftRotate(Node node){
        Node p=node.right;
        Node t=p.left;
        p.left=node;
        node.right=t;
        node.height=Math.max(height(node.left),height(node.right))+1;
        p.height=Math.max(height(p.left),height(p.right));
        return p;
    }
    private Node rightRotate(Node node){
        Node c=node.left;
        Node t=c.right;
        c.right=node;
        node.left=t;
        node.height=Math.max(height(node.left),height(node.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;
    }
    public boolean balanced(){return balanced(root);}
    public boolean balanced(Node node){
        if (node==null)return true;
        return Math.abs(height(node.left)-height(node.right))<=1&&balanced(node.left)&&balanced(node.right);
    }
    public void populate(int[] nums){
        for(int num:nums)insert(num);
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("----AVL TREE IS EMPTY----");
            return;
        }
        System.out.println("----AVL TREE----");
        display(root,"ROOT NODE : ");
        System.out.println("----END----");
    }
    private void display(Node node,String details){
        if (node==null)return;
        System.out.println(details+node.value);
        display(node.left,"LEFT OF "+node.value+" IS ");
        display(node.right,"RIGHT OF "+node.value+" IS ");
    }

    static void main() {
        AVLTree avlTree=new AVLTree();
        int[] arr1={1,2,3,4,5,6,7,8,9};
//        int[] arr1=new int[1000];
//        for (int i = 0; i <1000 ; i++) {
//            arr1[i]=i;
//        }
        avlTree.populate(arr1);
        avlTree.display();
        System.out.println(avlTree.height(avlTree.root));
    }
}

package Trees;
import java.util.Arrays;

public class BinarySearchTree {
    private static class Node{
        int value;
        Node left;
        Node right;
        int height;
        public Node(int value) {
            this.value = value;
            this.height=0;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;
    public BinarySearchTree(){}
    public int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root=insert(value, root);
    }
    private Node insert(int value, Node node){
        if (node==null){
            return new Node(value);
        }
        if (value<node.value){
            node.left=insert(value,node.left);
        }
        else if (value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.right),height(node.left))+1;
        return node;
    }
    public void populate(int[] nums){
        for (int num : nums) {
            this.insert(num);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }

    private void populateSorted(int[] nums, int start, int end){
        if (start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
    }

    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if (node==null)return;
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if (node==null)return;
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if (node==null)return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        if (isEmpty()){
            System.out.println("BST IS EMPTY");
            return;
        }
        System.out.println("----BST----");
        display(this.root, "Root Node: ");
        System.out.println("----END----");
    }
    private void display(Node node, String details){
        if (node==null)return;
        System.out.println(details+ node.value);
        display(node.left,"Left of "+node.value+" is ");
        display(node.right,"Right of "+node.value+" is ");
    }

    static void main() {
        int[] arr={4,2,6,1,3,5,7};
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.populate(arr);
        binarySearchTree.display();
        binarySearchTree.preOrder();
        System.out.println();
        binarySearchTree.inOrder();
        System.out.println();
        binarySearchTree.postOrder();
        System.out.println(binarySearchTree.balanced());
        int[] arr1={8,6,4,7,5,5,58,7,4,41,5,58,521,4,5,14,5,24,4,2};
        Arrays.sort(arr1);
        BinarySearchTree binarySearchTree1=new BinarySearchTree();
        binarySearchTree1.populateSorted(arr1);
        binarySearchTree1.display();
        System.out.println(binarySearchTree1.balanced());
    }
}
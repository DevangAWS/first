//package Trees;
//
//import javax.management.modelmbean.ModelMBeanNotificationBroadcaster;
//
//public class SegmentTrees {
//    private static class Node{
//        int data;
//        int startInterval;
//        int endInterval;
//        Node left;
//        Node right;
//
//        public Node(int startInterval, int endInterval) {
//            this.startInterval = startInterval;
//            this.endInterval = endInterval;
//        }
//    }
//    Node root;
//    public SegmentTrees(int[] arr){
//        this.root=constructTree(arr,0,arr.length-1);
//    }
//    public Node constructTree(int[] arr, int start, int end){
//        if (start==end){
//            Node leaf=new Node(start,end);
//            leaf.data=arr[start];
//            return leaf;
//        }
//        Node node=new Node(start,end);
//        int mid=(start+end)/2;
//        node.left=constructTree(arr,start,mid);
//        node.right=constructTree(arr,mid+1,end);
//        node.data= node.left.data+node.right.data;
//        return node;
//    }
//    public void print(){
//       print(this.root);
//    }
//    public void print(Node node){
//        String str="";
//        if(node.left!=null){
//            str=str+"Interval=["+node.left.startInterval+"-"+node.left.endInterval+"] and data is "+node.left.data+" -> ";
//        }
//        else {
//            str=str+" no left child";
//        }
//        str=str+"Interval=["+node.startInterval+node.endInterval+"] and data is "+node.data+" <- ";
//        if(node.right!=null){
//            str=str+"Interval=["+node.right.startInterval+"-"+node.right.endInterval+"] and data is "+node.right.data+" -> ";
//        }
//        else {
//            str=str+" no right child";
//        }
//        System.out.println(str);
//        if (node.left!=null)print(node.left);
//        if (node.right!=null)print(node.right);
//    }
//
//    public int query(int qsi, int qei){
//        return this.query(this.root,qsi,qei);
//    }
//    private int query(Node node, int qsi, int qei){
//
//    }
//}

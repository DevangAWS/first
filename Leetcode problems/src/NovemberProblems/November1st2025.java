package NovemberProblems;
import java.util.*;
public class November1st2025 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode listNode=new ListNode(0);
        listNode.next=head;
        ListNode current=listNode;
        while (current.next!=null){
            if(set.contains(current.next.val)){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return listNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

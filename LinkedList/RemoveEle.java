import java.util.*;
class RemoveEle{
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode removeElements(ListNode head, int val) {
        
        // Handle the case where the head itself has the value
        // while (head != null && head.val == val) {
        //     head = head.next;
        // }
        // ListNode temp=head;
        // ListNode prev=head;

        // while(temp!=null){
        //     if(temp.val==val){
        //         prev.next=temp.next;
        //     }else{
        //         prev = temp;
        //     }
        //     temp = temp.next;
        // }
        // return head;

        // to handle the case where ist ele can also be the node to remove
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=dummy;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
            
        }
        return dummy.next;
    }
}
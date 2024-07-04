/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class LinkedListCycle{
    public boolean hasCycle(ListNode head) {
        //Using hashmap
        //t.c-> O(N * 2 * log(N)). 
        if(head==null || head.next==null){
            return false;
        }
        //why node type not integer?
        //Storing the entire node to distg btw nodes with identical val but diff pos in the list
        HashMap <ListNode,Integer> map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            if(map.containsKey(temp)){
                return true;
            }
            else{
                map.put(temp,1);
            }
            temp=temp.next;
        }
        return false;

        //t.c-> O(n)
        
        // if(head==null|| head.next==null){
        //     return false;
        // }
        // ListNode slow=head;
        // ListNode fast=head;
        // while(slow!=null && fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next.next;

        //     if(slow==fast){
        //         return true;
        //     }
        // }
        // return false;
    }
}
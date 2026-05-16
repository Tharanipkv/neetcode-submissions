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

class Solution {
    public boolean hasCycle(ListNode head) {
        // Set<ListNode> collect = new HashSet<>();
        // ListNode curr = head;
        // while(curr!=null){
        //     if(collect.contains(curr)){
        //         return true;
        //     }
        //     collect.add(curr);
        //     curr= curr.next;
        // }
        // return false;

        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;

        
    }
}

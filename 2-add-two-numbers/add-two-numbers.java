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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //creating dummy node
        ListNode ans = new ListNode();
        //assigning pointer
        ListNode curr = ans;

        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){

            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;


            int val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            curr.next = new ListNode(val);
            
            //update pointers
            curr = curr.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;


        }

        return ans.next;
    }
}
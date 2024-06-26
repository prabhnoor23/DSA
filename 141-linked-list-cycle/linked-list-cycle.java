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
public class Solution {
    public boolean hasCycle(ListNode head) {

        // HashSet<ListNode> set = new HashSet<>();
        // ListNode curr = head;
        // while(curr != null){
            
        //     if(set.contains(curr)) {
        //         return true;
        //     }
        //     set.add(curr);
        //     curr = curr.next;

        // }
        // return false;

//**************************************************************** */        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;


// ******************************* Beats 14% *************************************

        //    ListNode curr = head;
        // int count = 1;
        // while(curr != null){
        //     count ++;
        //     if(count > 100000) return true;
        //     curr = curr.next;
        // }

        // return false;
        


    }
}
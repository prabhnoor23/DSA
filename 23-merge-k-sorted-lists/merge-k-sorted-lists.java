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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        
        ListNode ans1 = lists[0];
        ListNode ans2 = lists[lists.length / 2];
        // System.out.println(ans.next.val);
        // System.out.println(ans.next.next.val);
        // ListNode ansCurr = ans;
        for(int i = 1; i < lists.length / 2; i ++){

                ans1 = mergeTwoLists(ans1, lists[i]);
        
            }

        for(int i = lists.length / 2 + 1; i < lists.length; i ++){

            ans2 = mergeTwoLists(ans2, lists[i]);

        }
            return mergeTwoLists(ans1, ans2);

        }


        public ListNode mergeTwoLists(ListNode head1, ListNode head2){

            if(head1 == null) return head2;
            if(head2 == null) return head1;

            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;

            while(head1 != null && head2 != null){

                if(head1.val < head2.val){
                    curr.next = head1;
                    head1 = head1.next;
                }
                else{
                    curr.next = head2;
                    head2 = head2.next;
                }

                curr = curr.next;

            }

            curr.next = head2 == null ? head1 : head2;
            return dummy.next;
        }
        
    }

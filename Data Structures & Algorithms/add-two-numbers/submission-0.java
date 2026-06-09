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
       ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int retenue = 0;

        while(p1 != null || p2 != null || retenue != 0){
            int sum = retenue;

            if(p1 != null){
                sum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                sum += p2.val;
                p2 = p2.next;
            }
            ListNode digit = new ListNode(0);
            digit.val = sum%10;
            current.next = digit;
            current = current.next;
            retenue = sum/10;

        }
        return dummy.next; 
    }
}

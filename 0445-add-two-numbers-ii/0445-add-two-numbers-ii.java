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
    public ListNode rev (ListNode head ){
        ListNode prev = null;
        ListNode curr = head ;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = rev(l1);
        ListNode t2 = rev(l2);
        int carry = 0 ;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(t1!=null || t2!=null || carry == 1){
            int d1 = t1!=null ? t1.val : 0;
            int d2 = t2!=null ? t2.val : 0;
            int d = d1+d2+carry;
            carry = d/10;
            d = d%10;
            temp.next = new ListNode(d);
            temp = temp.next;
            if(t1 !=null) t1 = t1.next;
            if(t2 !=null) t2 = t2.next;
        } 
        return rev(dummy.next);
    }
}
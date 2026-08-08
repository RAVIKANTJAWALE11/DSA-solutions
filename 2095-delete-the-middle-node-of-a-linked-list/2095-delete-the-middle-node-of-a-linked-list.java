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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0 ;
        if(head.next == null){
            head = null;
            return head ;
        }
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int start = count/2 ;
        temp = head ;
        for(int i = 1;i<start;i++){
            temp = temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Node start = head , slow = head , fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                while(start!=slow){
                    slow = slow.next;
                    start = start.next;
                }
                return start.data;
            }
        }
        return -1;
    }
}
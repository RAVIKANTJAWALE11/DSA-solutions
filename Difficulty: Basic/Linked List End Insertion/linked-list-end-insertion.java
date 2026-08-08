/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = new Node(x);
        if(head==null) return temp;
        Node m= head;
        while(m.next != null){
            m = m.next;
        }
        m.next = temp;
        return head;
    }
}
/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int a) {
        data = a;
        next = null;
        prev = null;
    }
} */

class Solution {
    public int findSize(Node head) {
        // Code Here
        int count = 0 ;
        Node temp = head;
        while( temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

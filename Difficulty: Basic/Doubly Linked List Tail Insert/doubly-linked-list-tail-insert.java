/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;
    Node(int x) {
        data = x;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node insertInTail(Node head, int data) {
        // code here
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
}
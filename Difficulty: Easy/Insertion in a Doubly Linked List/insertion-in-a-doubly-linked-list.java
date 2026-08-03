/* Structure of Doubly Linked List Node
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node temp = head;
        for(int i=0;i<p;i++){
            temp = temp.next;
        }
        Node newNode = new Node(x);
        if(temp.next!=null) newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp ;
        return head;
    }
}
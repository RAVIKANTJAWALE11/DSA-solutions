/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

// class Solution {
//     public Node sortedInsert(Node head, int data) {
//         // code here
//         Node temp = head;
//         temp = temp.next;
//         while(temp!=head){
//             if(temp.data<=data && temp.next.data>=data){
//                 Node newnode = new Node(data);
//                 newnode.next = temp.next;
//                 temp.next = newnode;
//                 break;
//             }
//             temp = temp.next;
//         }
//         if(temp.next == head && temp.data<=data && temp.next.data>=data){
//             Node newnode = new Node(data);
//             newnode.next = temp.next;
//             temp.next = newnode;
//         }
//         if(temp.next == head && temp.data>=data && temp.next.data>=data){
//              Node newnode = new Node(data);
//             newnode.next = temp.next;
//             temp.next = newnode;
//             head = newnode;
//         }
//         return head;
//     }
// }


class Solution {
    public Node sortedInsert(Node head, int data) {
        Node newNode = new Node(data);
        Node curr = head, next = head.next;

        while(true) {
            if(curr.data <= data && data <= next.data) {
                newNode.next = next;
                curr.next = newNode;
                break;
            }
            else if(curr.data > next.data && data >= curr.data) {
                newNode.next = next;
                curr.next = newNode;
                break;
            }
            else if(curr.data > next.data && data < next.data) {
                newNode.next = next;
                curr.next = newNode;
                head = newNode;
                break;
            }
            curr = curr.next;
            next = next.next;
        }
        return head;
    }
}
/*
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
}
*/

class Solution {
	public boolean detectLoop(Node head) {
		// code here
		HashSet<Node> st = new HashSet<>();
		while (head != null) {
			if (st.contains(head)) return true;
			st.add(head);
			head = head.next;
		}
		return false;
	}
}

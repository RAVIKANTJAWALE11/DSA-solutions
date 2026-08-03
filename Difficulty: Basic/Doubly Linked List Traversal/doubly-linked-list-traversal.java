/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> back = new ArrayList<>();
        List<Integer> frow = new ArrayList<>();
        
        Node temp = head;
        Node last = head;
        while(temp!=null){
            frow.add(temp.data);
            last = temp;
            temp=temp.next;
        }
        while(last!=null){
            back.add(last.data);
            last = last.prev;
        }
        res.add(frow);
        res.add(back);
        return res;
    }
}
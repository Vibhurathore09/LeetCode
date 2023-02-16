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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((ListNode a, ListNode b) -> a.val - b.val);
        for(int i = 0 ; i < lists.length ; i++){
            if(lists[i] != null){
                pq.add(lists[i]);
            }
        }
        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;
        while(!pq.isEmpty()){
            ListNode r = pq.poll();
            Dummy.next = r;
            Dummy = Dummy.next ; 
            if(r.next != null){
                pq.add(r.next);
            }
            
        }
        return temp.next;
    }
}
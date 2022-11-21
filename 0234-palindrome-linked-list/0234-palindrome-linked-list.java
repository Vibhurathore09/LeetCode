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
    static ListNode ptr = null;
    public boolean isPalindrome(ListNode head) {
        ptr = head;
        return PalindromeCheck(head);
    }
    public static boolean PalindromeCheck(ListNode list){
        if(list == null){
            return true;
        }
        
        boolean res = PalindromeCheck(list.next);
        if(res){
            if(list.val == ptr.val){
                ptr = ptr.next;
                return true;
            }
        }
        return false;
    }
}
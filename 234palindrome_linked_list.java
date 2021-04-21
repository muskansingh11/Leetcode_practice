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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<Integer>();
        ListNode curr = head;
        while(curr!=null)
        {
            st.push(curr.val);
            curr = curr.next;
        }
        while(head!=null)
        {
            if(head.val!=st.peek())return false;
            st.pop();
            head = head.next;
        }
        return true;
        
    }
}
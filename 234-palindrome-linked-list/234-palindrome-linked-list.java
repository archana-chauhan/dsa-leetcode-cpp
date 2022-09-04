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
    
    ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    ListNode reverseSecondHalf(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
        
    }
    
    public boolean isPalindrome(ListNode head) {
        
        if (head == null || head.next == null) return true;
        
        ListNode middleNode = findMiddle(head);
        ListNode secondHalfStart = reverseSecondHalf(middleNode.next);
        
        ListNode firstHalf = head;
        
        while (secondHalfStart != null) {
            if (firstHalf.val != secondHalfStart.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;    
    }
}
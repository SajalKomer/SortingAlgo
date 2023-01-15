package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    // Reverse Second Half In-place
    // Time complexity : O(n)
    // Space complexity : O(1)
    public boolean isPalindrome(ListNode head) {

        if (head == null) return true;

        // Find the end of first half and reverse second half.
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        // Check whether or not there is a palindrome.
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) result = false;
            p1 = p1.next;
            p2 = p2.next;
        }

        // Restore the list and return the result.
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    // Taken from https://leetcode.com/problems/reverse-linked-list/solution/
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /****************************************/
    // Approach: Copy into Array List and then Use Two Pointer Technique
    // Time complexity : O(n)
    // Space complexity : O(n)
/*    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null){
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }

        int front = 0;
        int back = values.size() - 1;
        while (front < back){
            if (!values.get(front).equals(values.get(back)))
                return false;
            front++;
            back--;
        }
        return true;
    }*/

    /*****************************************/
    // recursive approach
    // Time complexity : O(n)
    // Space complexity : O(n)
    /*private ListNode frontPointer;
    public boolean isPalindrome(ListNode head){
        frontPointer = head;
        return recursivelyCheck(head);
    }

    private boolean recursivelyCheck(ListNode head) {
        ListNode currentNode = head;
        if (currentNode != null){
            if (!recursivelyCheck(currentNode.next)) return false;
            if (frontPointer.val != currentNode.val) return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }*/
}

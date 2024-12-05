/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * 
 * There is a cycle in a linked list if there is some node in the list that can be reached again 
 * by continuously following the next pointer. Internally, pos is used to denote the index of 
 * the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * 
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * 
 * Example 1:
 * 
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 * 
 * Example 2:
 * 
 * Input: head = [1,2], pos = 0
 * Output: true
 * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
 * 
 * Example 3:
 * 
 * Input: head = [1], pos = -1
 * Output: false
 * Explanation: There is no cycle in the linked list.
 */


package LinkedList;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    // Constructor to create a node
    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListCycle {

    // Function to detect if there is a cycle in the linked list
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list with slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1 step
            fast = fast.next.next; // Move fast pointer by 2 steps

            if (slow == fast) { // Cycle detected
                return true;
            }
        }

        return false; // No cycle detected
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Example 1: Linked List with a cycle
        ListNode head1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle (node4 points to node2)

        LinkedListCycle solution = new LinkedListCycle();
        System.out.println("Example 1: " + solution.hasCycle(head1)); // Output: true

        // Example 2: Linked List with a cycle
        ListNode head2 = new ListNode(1);
        ListNode node5 = new ListNode(2);

        head2.next = node5;
        node5.next = head2; // Creates a cycle (node5 points to head2)

        System.out.println("Example 2: " + solution.hasCycle(head2)); // Output: true

        // Example 3: Linked List without a cycle
        ListNode head3 = new ListNode(1);

        System.out.println("Example 3: " + solution.hasCycle(head3)); // Output: false
    }
}

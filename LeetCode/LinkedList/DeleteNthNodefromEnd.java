package LinkedList;


class Node {
    int val;
    Node next;
    
    Node() {}
    
    Node(int val) { 
        this.val = val; 
    }
    
    Node(int val, Node next) { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution1 {
	
	
	
    public Node removeNthFromEnd(Node head, int n) {

        Node dummy = new Node(0); 
        dummy.next = head; 
        
        Node fast = dummy;
        Node slow = dummy;
        
        // Move fast pointer n steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next; 
            slow = slow.next;
        }
        
        // Now slow points to the node just before the node to be removed
        slow.next = slow.next.next;
        
        // Return the modified list, dummy.next points to the actual head after removal
        return dummy.next;
    }
}

public class DeleteNthNodefromEnd {

	
    public static void main(String[] args) {
    	
    	
        // Example usage:
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        // Print original list
        System.out.println("Original List:");
        printList(head);
        
        // Remove 2nd node from the end (which is 4)
        int n = 5;
        Solution1 solution = new Solution1();
        Node modifiedHead = solution.removeNthFromEnd(head, n);
        
        // Print modified list
        System.out.println("\nList after removing " + n + "th node from end:");
        printList(modifiedHead);
    }
    
    // Helper method to print a linked list
    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

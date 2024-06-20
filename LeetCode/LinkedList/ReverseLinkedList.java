/**
 * Reverse a Linked List
 *
 * Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.
 *
 * Example 1:
 *
 * Input: head = [0,1,2,3]
 * Output: [3,2,1,0]
 * 
 * Example 2:
 *
 * Input: head = []
 * Output: []
 * 
 */


package LinkedList;

class ListNodes {
    int val;
    ListNodes next;

    ListNodes(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNodes reverseList(ListNodes head) {
    	
    	//       1 	-> 	2 	-> 	3 	-> 	4 	-> 	null
    	// prev	 temp	next 				 - after the first step is done 
    	
    	// <-	1 		2	-> 	3 	->	4 	-> 	null
    	//	 	prev	temp	next
    	
    	// After shifting all pointer from "2" will change it's direction ...
    	
        ListNodes current = head; // 1 is the head, make that a current (temporarily/temp)
        ListNodes prev = null; 
        ListNodes next; 

       
        while (current != null) { 
        	
            next = current.next; // temporarily store the next node
            
           
            current.next = prev; // reverse the current node's pointer to previous node.
            
           
            prev = current; // move prev and current one step forward in the list
            
            
            current = next; // move current one step forward in the list
        }

        return prev; 
    }

    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> null
        ListNodes head = new ListNodes(1);
        head.next = new ListNodes(2);
        head.next.next = new ListNodes(3);
        head.next.next.next = new ListNodes(4);

        ReverseLinkedList reversal = new ReverseLinkedList();
        ListNodes reversedHead = reversal.reverseList(head);

        // Printing the reversed linked list: 4 -> 3 -> 2 -> 1 -> null
        ListNodes current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}


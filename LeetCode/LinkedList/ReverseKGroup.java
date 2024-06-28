package LinkedList;

/**
 * Definition for singly-linked list.
 */
//class List_Node {
//    int val;
//    List_Node next;
//    
//    List_Node() {}
//    
//    List_Node(int val) {
//        this.val = val;
//    }
//    
//    List_Node(int val, List_Node next) {
//        this.val = val;
//        this.next = next;
//    }
//}

class KGroupSolution {
    
    public List_Node reverseKGroup(List_Node head, int k) {
    	
        List_Node dummy = new List_Node(0);
        dummy.next = head;
        List_Node groupPrev = dummy;

        while (true) {
            List_Node kth = getKth(groupPrev, k);
            if (kth == null) {
                break;
            }
            List_Node groupNext = kth.next;

            List_Node prev = groupNext;
            List_Node curr = groupPrev.next;
            while (curr != groupNext) {
                List_Node tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            List_Node tmp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = tmp;
        }
        return dummy.next;
    }

    private List_Node getKth(List_Node curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}

public class ReverseKGroup {
    // Helper method to create a linked list from an array
    public static List_Node createLinkedList(int[] arr) {
        List_Node dummy = new List_Node();
        List_Node current = dummy;
        
        for (int num : arr) {
            current.next = new List_Node(num);
            current = current.next;
        }
        
        return dummy.next;
    }
    
    // Helper method to print a linked list
    public static void printLinkedList(List_Node head) {
        List_Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	KGroupSolution solution = new KGroupSolution();
        
        // Example 1: [1,2,3,4,5], k = 3
        int[] arr1 = {1, 2, 3, 4, 5};
        List_Node head1 = createLinkedList(arr1);
        int k1 = 3;
        
        System.out.println("Original List:");
        printLinkedList(head1);
        
        List_Node reversedHead1 = solution.reverseKGroup(head1, k1);
        
        System.out.println("After reversing in groups of " + k1 + ":");
        printLinkedList(reversedHead1);
        
        // Example 2: [1,2,3,4,5], k = 2
        int[] arr2 = {1, 2, 3, 4, 5};
        List_Node head2 = createLinkedList(arr2);
        int k2 = 2;
        
        System.out.println("Original List:");
        printLinkedList(head2);
        
        List_Node reversedHead2 = solution.reverseKGroup(head2, k2);
        
        System.out.println("After reversing in groups of " + k2 + ":");
        printLinkedList(reversedHead2);
    }
}

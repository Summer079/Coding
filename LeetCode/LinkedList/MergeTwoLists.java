package LinkedList;

/**
 * Definition for singly-linked list.
 */
class NodeList {
    int val;
    NodeList next;
    
    NodeList() {}
    NodeList(int val) { this.val = val; }
    NodeList(int val, NodeList next) { this.val = val; this.next = next; }
}

public class MergeTwoLists {
    public NodeList mergeTwoLists(NodeList list1, NodeList list2) {
        // Create a dummy head to ease the insertion
        NodeList dummyHead = new NodeList(-1);
        NodeList current = dummyHead;
        
        // Traverse both lists and merge
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        
        // Append remaining nodes if any
        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        
        // Return the merged list, excluding the dummy head
        return dummyHead.next;
    }
    
    // Main function to demonstrate the usage with examples
    public static void main(String[] args) {
        // Example 1 list1: [1,2,4], list2: [1,3,4]
        NodeList list1 = new NodeList(1, new NodeList(2, new NodeList(4)));
        NodeList list2 = new NodeList(1, new NodeList(3, new NodeList(4)));
        
        MergeTwoLists solution = new MergeTwoLists();
        NodeList mergedList = solution.mergeTwoLists(list1, list2);
        
        printList(mergedList); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> null
        
        // Example 2
        NodeList list3 = null;
        NodeList list4 = null;
        
        NodeList mergedList2 = solution.mergeTwoLists(list3, list4);
        
        printList(mergedList2); // Output: null
        
        // Example 3
        NodeList list5 = null;
        NodeList list6 = new NodeList(0);
        
        NodeList mergedList3 = solution.mergeTwoLists(list5, list6);
        
        printList(mergedList3); // Output: 0 -> null
    }
    
    // Helper method to print the linked list
    private static void printList(NodeList head) {
        NodeList current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(" -> null");
    }
}

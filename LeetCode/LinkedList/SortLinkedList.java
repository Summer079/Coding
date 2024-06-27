package LinkedList;

class NodeList {
   int val;
   NodeList next;
   
   NodeList() {}
   NodeList(int val) { this.val = val; }
   NodeList(int val, NodeList next) { this.val = val; this.next = next; }
}

public class SortLinkedList {

	public NodeList sortList(NodeList head) {
		
		if (head == null || head.next == null) {
			return head; 
		}

		// Find the middle of the linked list
		NodeList middle = findMiddle(head); 
		NodeList nextToMiddle = middle.next; 

		// Split the linked list into two halves
		middle.next = null; 

		// Recursively sort the two halves
		NodeList left = sortList(head);
		NodeList right = sortList(nextToMiddle);

		// Merge the sorted halves
		return merge(left, right);
	}


	private NodeList merge(NodeList list1, NodeList list2) { 
		
		NodeList dummyHead = new NodeList(-1); 
		NodeList current = dummyHead;

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

		
		if (list1 != null) { 
			current.next = list1;
		}
		if (list2 != null) {
			current.next = list2;
		}

		return dummyHead.next; // returning the next head from the dummy
	}


	private NodeList findMiddle(NodeList head) {
		
		if (head == null) {
			return head;
		}
		//
		NodeList slow = head;
		NodeList fast = head.next;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public static void main(String[] args) {
		// Example 1
		NodeList list1 = new NodeList(4, new NodeList(2, new NodeList(1, new NodeList(3))));
		SortLinkedList solution = new SortLinkedList();
		NodeList sortedList1 = solution.sortList(list1);
		printList(sortedList1); // Output: 1 -> 2 -> 3 -> 4 -> null

		// Example 2
		NodeList list2 = new NodeList(-1, new NodeList(5, new NodeList(3, new NodeList(4, new NodeList(0)))));
		NodeList sortedList2 = solution.sortList(list2);
		printList(sortedList2); // Output: -1 -> 0 -> 3 -> 4 -> 5 -> null

		// Example 3
		NodeList list3 = null;
		NodeList sortedList3 = solution.sortList(list3);
		printList(sortedList3); // Output: null
	}

	// Helper method to print the linked list
	private static void printList(NodeList head) {
		NodeList current = head;
		while (current != null) {
			System.out.print(current.val);
			if (current.next != null) {
				System.out.print(" → ");
			}
			current = current.next;
		}
		System.out.println(" → null");
	}
}

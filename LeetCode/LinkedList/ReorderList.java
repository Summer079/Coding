package LinkedList;


//class NodeList {
//    int val;
//    NodeList next;
//    NodeList() {}
//    NodeList(int val) { this.val = val; }
//    NodeList(int val, NodeList next) { this.val = val; this.next = next; }
//}


//Define the ReorderList class
public class ReorderList {

	
	class Solution {

		// Recursive function to reorder nodes
		NodeList reorder(NodeList n1, NodeList n2) {
			if (n2.next == null) { // odd number of nodes, move n1.next to front of n1
				NodeList tail = n1.next;
				n1.next = null;
				return tail;
			} else if (n2.next.next == null) { // even number of nodes, move n1.next.next to front of n1
				NodeList tail = n1.next.next;
				n1.next.next = null;
				return tail;
			}

			NodeList tail = reorder(n1.next, n2.next.next);
			NodeList tail2 = tail.next;
			tail.next = n1.next;
			n1.next = tail;
			return tail2;
		}

		// Main method to reorder the list
		public void reorderList(NodeList head) {
			if (head == null || head.next == null || head.next.next == null)
				return;

			reorder(head, head);
		}
	}

	// Testing function
	public static void main(String[] args) {
		ReorderList reorderList = new ReorderList();
		ReorderList.Solution solution = reorderList.new Solution();

		// Example 1: Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
		NodeList node5 = new NodeList(5);
		NodeList node4 = new NodeList(4, node5);
		NodeList node3 = new NodeList(3, node4);
		NodeList node2 = new NodeList(2, node3);
		NodeList node1 = new NodeList(1, node2);

		// Print the original list
		System.out.println("Original list:");
		printList(node1);

		// Reorder the list
		solution.reorderList(node1);

		// Print the reordered list
		System.out.println("\nReordered list:");
		printList(node1);
	}

	// Helper method to print the NodeList
	private static void printList(NodeList head) {
		NodeList curr = head;
		while (curr != null) {
			System.out.print(curr.val + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}

class Node4 {
	int data;
	Node4 next;
}


public class RemoveMiddleNode_Estrella {
	public static void main(String[] args) {

	// STEP 1: Create three nodes manually
	Node4 first = new Node4();
	Node4 second = new Node4();
	Node4 third = new Node4();

	// STEP 2: Assign data values
	first.data = 10;
	second.data = 20;
	third.data = 30;


	// STEP 3: Link nodes to form: 10 -> 20 -> 30 -> null
	first.next = second;
	second.next = third;
	third.next = null;


	// STEP 4: Display original list
	System.out.println("Original List:");
	printList(first);

	// STEP 5: Remove the middle node (data = 20)
	// We need to skip 'second' by linking 'first' directly to third
	first.next = third;


	// STEP 6: Display updated list
	System.out.println("\nAfter removing the middle node (20):");
	printList(first);
}

	// Method to print the list
	public static void printList(Node4 current) {
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
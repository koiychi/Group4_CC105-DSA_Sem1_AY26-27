class Node { int data; Node next; }
public class RemoveMiddleNode_Tiongson {
	public static void main(String[] args) {
		Node first = new Node(), second = new Node(), third = new Node();
                first.data = 10; second.data = 20; third.data = 30;
                first.next = second; second.next = third; third.next = null;
		System.out.print("Original list: ");
		printList(first);
		first.next = third;
		System.out.print("After removing the middle node (20): ");
		printList(first);
	}

	static void printList(Node currentNode) {
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}
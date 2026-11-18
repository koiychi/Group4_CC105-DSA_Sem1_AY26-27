class Node {
	int data;
	Node next;
}

public class BasicLinkedList_Estrella {
	public static void main(String[] args) {

		//Create three nodes
		Node first = new Node();
		Node second = new Node();
		Node third = new Node();

		//Assign data to each node
		first.data = 10;
		second.data = 20;
		third.data = 30;

		// linked nodes: 1st > 2nd > 3rd > null
		first.next = second;
		second.next = third;
		third.next = null;

		//traverse and print list starting from first
		Node temp = first;
		System.out.print("Linked List: ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
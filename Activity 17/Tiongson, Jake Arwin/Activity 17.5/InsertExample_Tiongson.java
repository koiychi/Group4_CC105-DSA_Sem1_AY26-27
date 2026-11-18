class Node { int data; Node next; }
public class InsertExample_Tiongson {
	public static void main(String[] args) {
		Node first = new Node(), second = new Node(), third = new Node();
		first.data = 10; second.data = 20; third.data = 30;
		first.next = second; second.next = third; third.next = null;
		Node newNode = new Node();
		newNode.data = 25;
		newNode.next = second.next;
		second.next = newNode;

		Node node = first;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
class Node1 {
int data;
Node1 next;
}
	public class InsertExample_Estrella {
		public static void main(String[] args) {

		// create nodes and linked
		Node1 first = new Node1();
		Node1 second = new Node1();
		Node1 third = new Node1();
		first.data = 10;
		second.data = 20;
		third.data = 30;
		first.next = second;
		second.next = third;
		third.next = null;

		// create new node to insert
		Node1 newNode = new Node1();
		newNode.data = 25;

		//Insertion step
		newNode.next = second.next;
		second.next = newNode;

		// traverse and print to verify
		Node1 temp = first;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
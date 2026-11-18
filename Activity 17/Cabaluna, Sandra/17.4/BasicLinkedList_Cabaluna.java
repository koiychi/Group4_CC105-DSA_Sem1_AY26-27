// Node class (defined first)
class Node {
    int data;   // store the value
    Node next;  // reference  to the next code
}

public class BasicLinkedList_Cabaluna {
    public static void main(String[] args) {
        
        // Create three nodes
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        // Assign data to each node
        first.data = 10;
        second.data = 20;
        third.data = 30;

        // Link nodes: first -> second -> third -> null
        first.next = second;
        second.next = third;
        third.next = null;

        // Traverse and print list starting from 'first'
        Node temp = first;      // start at the first node
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;   // move to next node
        }
        System.out.println();   // new line
    }
}
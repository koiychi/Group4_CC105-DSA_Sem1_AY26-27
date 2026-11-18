class Node1 {
    int data;
    Node1 next;
}

public class InsertExample_Cabaluna {
    public static void main(String[] args) {
        
        // create nodees and link: first -> second -> third -> null
        Node1 first = new Node1();
        Node1 second = new Node1();
        Node1 third = new Node1();
        first.data = 10;
        second.data = 20;
        third.data = 30;
        first.next = second;
        second.next = third;
        third.next = null;

        // create node to insert
        Node1 newNode = new Node1();
        newNode.data = 25;      // the value we went to insert

        // insertion step
        newNode.next = second.next; // Step A
        second.next = newNode;      // Step B

        // Traverse and print to verify
        Node1 temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
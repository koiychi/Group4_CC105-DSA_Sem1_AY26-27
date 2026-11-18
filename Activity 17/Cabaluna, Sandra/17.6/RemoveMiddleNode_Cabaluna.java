class Node4 {
    int data;
    Node4 next;
}

public class RemoveMiddleNode_Cabaluna {
    public static void main(String[] args) {
        
        // create three nodes
        Node4 first = new Node4();
        Node4 second = new Node4();
        Node4 third = new Node4();

        // assign data value
        first.data = 10;
        second.data = 20;
        third.data = 30;

        // link nodes to form: 10 -> 20 -> 30 -> null
        first.next = second;
        second.next = third;
        third.next = null;

        // display the origina list
        System.out.println("Original List: ");
        printList(first);

        // remove the middle node (data = 20)
        // we need to skip 'second' by linking 'first' directly to 'third'
        first.next = third;     // now list is 10 -> 30

        // display updated list
        System.out.println("\nAfter removing the middle node (20):");
        printList(first);
    }
    
    // method to print the list
    public static void printList(Node4 current) {
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;     // move to the next node
        }
         System.out.println();
    }
    
}

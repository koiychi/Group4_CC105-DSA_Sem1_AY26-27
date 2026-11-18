public class Prob03_IndexValueTraversal_Cristalee {
    public static void main(String[] args) {
        // Initialize the array with the given names
        String[] names = {"Alice", "Bob", "Charlie"};

       System.out.println("Array elements with index: ");

        // Traverse the array using a standard for loop to access indices
        for (int i = 0; i < names.length; i++) {
            System.out.println("Index " + i + ": " + names[i]);
        }
    }
}
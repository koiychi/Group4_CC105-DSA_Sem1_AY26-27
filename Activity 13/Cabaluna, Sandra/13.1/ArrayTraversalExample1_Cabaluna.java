public class ArrayTraversalExample1_Cabaluna {

    public static void main(String[] args) {
        
        // Step 1: Create an integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Step 2: Display the array using an enhance for loop
        System.out.println("Displaying all elements in the array:");
        for (int num : numbers) {       // for-each loop
            System.out.println(num);    // prints each elements
        }
    }
}
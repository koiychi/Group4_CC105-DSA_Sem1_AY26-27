public class Prob04_CountElementsTraversed_Cristalee {
    public static void main(String[] args) {
        // Store the floating-point values in a double array
        double[] numbers = {85.5, 90.0, 78.5};
        
        // Counter variable to keep track of visited elements
        int count = 0;

        // Traverse the array using an enhanced for-loop (for-each loop)
        for (double num : numbers) {
            count++;
        }

        // Print the total count
        System.out.println("Number of elements traversed: " + count);
    }
}
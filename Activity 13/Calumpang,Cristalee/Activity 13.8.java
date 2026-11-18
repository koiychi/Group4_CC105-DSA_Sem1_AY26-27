public class Prob05_FormatOutputTraversal_Cristalee {
    public static void main(String[] args) {
        // Store the numbers in an integer array
        int[] numbers = {1, 2, 3, 4, 5};
  
        System.out.print("Array elements: ");

        // Traverse the array and format the output
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            
            // Print a comma and space after every element EXCEPT the last one
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        // Print a new line at the end
        System.out.println("");
    }
}
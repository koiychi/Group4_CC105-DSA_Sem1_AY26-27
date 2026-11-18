import java.util.Scanner;

public class ArrayTraversalScanner_Cabaluna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user how many grades to input
        System.out.print("How many grades do you want to enter? ");
        int size  = sc.nextInt();

        // Step 2: Create an array with the given size
        double[] grades = new double[size];

        // Step 3: Use a for loop to input eeach grade
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        // Step 4: Display all grades using enhanced for loop
        System.out.println("\nGrades you entered:");
        for (double g : grades) { // for-each loop to traverse
            System.out.println(g);
        }

        // Step 5: Compute total and average using another for-each loop
        double total = 0;
        for (double g : grades) {
            total += g; // add each grade to total
        }
        double average = total / grades.length;

        // Step 6: Display total and average
        System.out.println("\nTotal of all grades: " + total);
        System.out.println("Average grade: " + average);

        sc.close();
    }
}

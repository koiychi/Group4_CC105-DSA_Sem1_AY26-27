public class ArrayTraversalExample2_Cabaluna {
    public static void main(String[] args) {
        
        // Step 1: Create an array of quiz scores
        double[] scores = {85.5, 90.0, 78.5, 88.0, 92.5};

        // Step 2: Initialize total variable
        double total = 0;

        // Step 3: Use for-each loop to compute total
        for (double s : scores) {
            total += s; // addeach score to total
        }

        // Step 4: Compute average
        double average = total / scores.length;

        // Step 5: Displayy results
        System.out.println("Scores of the class:");
        for (double  s  : scores) {
            System.out.println(s);
        }

        System.out.println("\nTotal score: " + total);
        System.out.println("Average score: " + average);
    }
}

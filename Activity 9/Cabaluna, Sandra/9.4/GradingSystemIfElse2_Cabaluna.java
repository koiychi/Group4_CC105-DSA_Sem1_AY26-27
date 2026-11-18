import java.util.Scanner;

public class GradingSystemIfElse2_Cabaluna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask the user for a grade
        System.out.print("Enter numeric grade (0 - 100): ");
        double grade = sc.nextDouble();

        double equivalent; // holds the grade equivalent

        // Step 2: Check ranges using if-else if ladder
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Enter a number between 0 and 100.");
            sc.close();
            return; // exit the program

        } else if (grade >= 0 && grade <= 74.49) {
            equivalent = 5.00;
        } else if (grade >= 74.50 && grade <= 75.49) {
            equivalent = 3.00;
        } else if (grade >= 75.50 && grade <= 78.49) {
            equivalent = 2.75;
        } else if (grade >= 78.50 && grade <= 81.49) {
            equivalent = 2.50;
        } else if (grade >= 81.50 && grade <= 84.49) {
            equivalent = 2.25;
        } else if (grade >= 84.50 && grade <= 87.49) {
            equivalent = 2.00;
        } else if (grade >= 87.50 && grade <= 90.49) {
            equivalent = 1.75;
        } else if (grade >= 90.50 && grade <= 93.49) {
            equivalent = 1.50;
        } else if (grade >= 93.50 && grade <= 96.49) {
            equivalent = 1.25;
        } else { // 96.50 - 100
            equivalent = 1.00;
        }

        // Step 3: Show result
        System.out.println("Grade equivalent: " + equivalent);
        sc.close();
    }
}
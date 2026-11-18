import java.util.Scanner;

public class VotingCheck_Cabaluna {
    public static void main(String[] sandra) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");

        } else {
            System.out.println("You are NOT eligible to vote yet.");
        }

        System.out.println("Program finished.");
    }
}
import java.util.Scanner;

public class SimpleCalculator_Cabaluna {
    public static void main(String[] sandra) {
        Scanner sc = new Scanner(System.in);

        // 1. Show menu and read selector
        System.out.println("Menu: 1:Add 2:Subtract 3:Multiply 4:Divide");
        System.out.print("Choose (1-4): ");

        int choice = sc.nextInt();

        // 2. Read numbers
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        // 3. Classic switch on the selector
        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b == 0) {
                   System.out.println("Error: divide by zero"); 
                } else {
                System.out.println("Result = " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid choice. Use 1 - 4.");
        }
        sc.close();
    }
}
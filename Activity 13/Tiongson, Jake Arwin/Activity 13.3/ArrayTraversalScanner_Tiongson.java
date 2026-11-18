import java.util.Scanner;
class ArrayTraversalScanner_Tiongson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades to you want to input? ");
        int length = scanner.nextInt();
        double[] grades = new double[length];
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }
        System.out.println("\nGrades you entered: ");
        double total = 0;
        for (double grade : grades) {
            System.out.println(grade);
            total += grade;
        }
        double average = total / grades.length;
        System.out.println("\nTotal of all grades: " + total);
        System.out.println("Average of all grades: " + average);
        scanner.close();
    }
}

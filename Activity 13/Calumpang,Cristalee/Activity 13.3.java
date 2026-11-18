import java.util.Scanner;

public class ArrayTraversalScanner_Calumpang {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("How many grades do you want to enter?");
int size =sc.nextInt();

double[] grade = new double[size];

for(int i = 0; i < grade.length; i++) {
  System.out.print("Enter grade #" + (i + 1) + ": ");
  grade[i] = sc.nextDouble();

}

System.out.println("\nGrades you entered:");
for(double g : grade) {
System.out.println(g);

}

double total = 0;
for (double g : grade) {
   total += g;
}
double average = total / grade.length;

System.out.println("/nTotal of all grades: " + total);
System.out.println("Average grade: " + average);
}
}
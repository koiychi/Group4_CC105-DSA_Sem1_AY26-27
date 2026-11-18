import java.util.Scanner;

public class SimpleCalculator_talee {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Menu: 1: Add, 2:Substract, 3:Multiply, 4: Division" );
System.out.print("Choose (1-4) ");

int choice = sc.nextInt();

System.out.println("Enter first number: ");
double a = sc.nextDouble();
System.out.println("Enter second number: ");
double b = sc.nextDouble();

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
if ( b == 0) 
{
System.out.println("Error: divide by zero");
} else {
System.out.println("Result = " + (a /b));
}
break;
default:
System.out.println("Invalid choice. Use 1 - 4");





}
sc.close();

}
}
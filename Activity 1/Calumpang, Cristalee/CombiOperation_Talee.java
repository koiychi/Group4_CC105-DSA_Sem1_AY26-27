public class CombiOperation_Talee {

public static void main (String[] args) {

int a = 10, b = 3;
System.out.println("Arithmetic Operators: ");
System.out.println(" a + b = " + (a + b));
System.out.println(" a - b = " + (a - b));
System.out.println(" a * b = " + (a * b));
System.out.println(" a / b + " + (a / b));
System.out.println(" a % b + " + (a % b));

System.out.println("\nRelational Operators:");
System.out.println("a == b: " + (a == b));
System.out.println("a != b: " + (a != b));
System.out.println("a > b: " + (a > b));
System.out.println("a < b: " + (a < b));

boolean x = true, y = false;
System.out.println("\nlogical Operators: " );
System.out.println(" x && y: " + ( x && y));
System.out.println(" x || y: " + ( x || y ));
System.out.println(" !x: " + (!x));

int c = 5;
System.out.println("\nAssignment Operators:");
System.out.println("c += 3: " + c);
System.out.println("c -= 2: " + c);
System.out.println("c *= 4: " + c);
System.out.println("c /= 2: " + c);

int d = 7;
System.out.println("\nUnary Operators:");
System.out.println("d = " + d);
System.out.println("++d = " + (++d));
System.out.println("--d = " + (--d));
System.out.println("-d = " + (-d));

int age = 20; 
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println("\nTernary Operator:");
System.out.println("Age: " + age + " -> " + result);
 }
}
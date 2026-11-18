
     public class  CombiOperation_Estrella {
       public static void main (String[] args) {
    
      int a = 10, b = 3;
     System.out.println("Arithmetic Operators:");
     System.out.println("a + b = " + (a + b)); // Add
     System.out.println("a - b = " + (a - b)); // Subtract
     System.out.println("a * b = " + (a * b)); // Multiply
     System.out.println("a / b = " + (a / b)); // Division
     System.out.println("a % b = " + (a % b)); // Modulus

     System.out.println("\nRelational Operators:");
     System.out.println("a == b: " + (a == b)); // Equal to
     System.out.println("a != b: " + (a != b)); // Not Equal to
     System.out.println("a > b: " + (a > b));   // Greater than
     System.out.println("a < b: " + (a < b));   // Less than
     System.out.println("a >= b: " + (a >= b)); // Greater or Equal
     System.out.println("a <= b: " + (a <= b)); // Less or Equal
     
     boolean x = true, y = false;
     System.out.println("\nLogical Operators:");
     System.out.println("x && y: " + (x && y));  // AND
     System.out.println("x || y: " + (x || y));  // OR
     System.out.println("!x: " + (!x));          // NOT

     int c = 5;
     System.out.println("\nAssignment Operators:");
     c += 3;
     System.out.println("c += 3: " + c);
     c -= 2;
     System.out.println("c -= 2: " + c);
     c *= 4;
     System.out.println("c *= 4: " + c);
     c /= 2;
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
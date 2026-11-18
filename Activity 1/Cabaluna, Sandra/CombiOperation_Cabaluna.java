public class CombiOperation_Cabaluna {

	public static void main(String[] Sandra) {
	
	// 1. Arithmetic Operators
	int a = 10, b = 3;
	System.out.println("Arithmetic Operators: ");
	System.out.println("a + b = " + (a + b));
	System.out.println("a - b = " + (a - b));
	System.out.println("a * b = " + (a * b));
	System.out.println("a / b = " + (a / b));
	System.out.println("a % b = " + (a % b));

	// 2. Relational Operators
	System.out.println("\nRelational Operators:");
	System.out.println("a == b: " + (a == b));
	System.out.println("a != b: " + (a != b));
	System.out.println("a > b: " + (a > b));
	System.out.println("a < b: " + (a < b));
	System.out.println("a >= b: " + (a >= b));
	System.out.println("a <= b: " + (a <= b));

	// 3. Logical Operators
	Boolean x = true, y = false;
	System.out.println("\nLogical Operators:");
	System.out.println("x && y: " + (x && y));
	System.out.println("x || y: " + (x || y));
	System.out.println("!x: " + (!x));

	// 4. Assignment Operators
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

	// 5. Unary Operators
	int d = 7;
	System.out.println("\nUnary Operators:");
	System.out.println("d = " + d);
	System.out.println("++d = " + (++d));
	System.out.println("--d = " + (--d));
	System.out.println("-d = " + (-d));

	// 6. Ternary Operator
	int age = 20;
	String result = (age >= 18) ? "Adult" : "Minor";
	System.out.println("\nTernary Operators:");
	System.out.println("Age: " + age + " -> " + result); 
	}
}

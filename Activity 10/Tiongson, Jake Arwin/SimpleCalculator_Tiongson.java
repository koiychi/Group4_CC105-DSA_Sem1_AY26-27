import java.util.Scanner;
class SimpleCalculator_Tiongson {
	public static void main(String[] args) throws ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("""
		
		     [MENU]
		 [1] Add
		 [2] Subtract
		 [3] Multiply
		 [4] Divide
		
		""");
		System.out.print("Please enter an integer (1-4): ");
		int choice = scanner.nextInt();
		System.out.print("Please enter two numbers, separated by spaces: ");
		double a = scanner.nextDouble(), b = scanner.nextDouble(), result;
		switch (choice) {
			case 1: result = a + b; break;
			case 2: result = a - b; break;
			case 3: result = a * b; break;
			case 4:
				if (b == 0) {
					System.out.println("Error: Division by zero."); return;
				} else {
					result = a / b; break;
				}
			default: System.out.println("Error: Input not 1, 2, 3, or 4."); return;
		}
		if (result == (int) result) {
			System.out.printf("""
				
			 [RESULT] %d
			""", (int) result);
		} else {
			System.out.printf("""
			
			 [RESULT] %f
			""", result);
		}
		scanner.close();
	}
}
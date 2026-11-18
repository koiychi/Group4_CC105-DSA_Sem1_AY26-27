import java.util.Scanner;
class PositiveCheck_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter any number: ");
		int number = scanner.nextInt();
		
		if (number > 0)
			System.out.println(number + " is a positive number.");

		System.out.println("Program finished.");
	}
}
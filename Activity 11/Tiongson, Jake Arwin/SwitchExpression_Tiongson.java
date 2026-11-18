import java.util.Scanner;
class SwitchExpression_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a day number (1 = Monday, 2 = Tuesday, ...): ");
		if (scanner.hasNextInt()) {
			int dayNumber = scanner.nextInt();
			String message = switch (dayNumber) {
				case 1 -> "[Monday] Start of the week!";
				case 2 -> "[Tuesday] Keep going!";
				case 3 -> "[Wednesday] Midweek!";
				case 4 -> "[Thursday] Almost Friday!";
				case 5 -> "[Friday] Weekends are near!";
				case 6, 7 -> "[Weekends] Time to relax!";
				default -> "Invalid input. Please enter a number from 1-7.";
			};
			System.out.println("Message: " + message);
		} else
			System.out.println("Error: Invalid input. Please enter a NUMBER from 1-7.");
		scanner.close();
	}
}
import java.util.Scanner;
class GradingSystemIfElse2_Tiongson {
	public static void main(String[] jake) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter numeric grade (0-100): ");
		double grade = scanner.nextDouble(), equivalent;
		if (grade < 0 || grade > 100) {
			System.out.println("Error: Invalid grade. Please enter a grade from 0 to 100.");
			scanner.close();
			return;
		} else if (grade >= 0 && grade <= 74.49)
			equivalent = 5;
		else if (grade >= 74.5 && grade <= 75.49)
			equivalent = 3;
		else if (grade >= 75.5 && grade <= 78.49)
			equivalent = 2.75;
		else if (grade >= 78.5 && grade <= 81.49)
			equivalent = 2.5;
		else if (grade >= 81.5 && grade <= 84.49)
			equivalent = 2.25;
		else if (grade >= 84.5 && grade <= 87.49)
			equivalent = 2;
		else if (grade >= 87.5 && grade <= 90.49)
			equivalent = 1.75;
		else if (grade >= 90.5 && grade <= 93.49)
			equivalent = 1.5;
		else if (grade >= 93.5 && grade <= 96.49)
			equivalent = 1.25;
		else
			equivalent = 1;
		System.out.println("Grade equivalent: " + equivalent);
		scanner.close();
	}
}
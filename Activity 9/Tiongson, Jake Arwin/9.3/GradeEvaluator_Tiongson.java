import java.util.Scanner;
class GradeEvaluator_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a score from 0 to 100: ");
		int score = scanner.nextInt();
		
		if (score >= 90)
			System.out.println("Your score of " + score + " deserves an A.");
		else if (score >= 80)
			System.out.println("Your score of " + score + " deserves a B.");
		else if (score >= 70)
			System.out.println("Your score of " + score + " deserves a C.");
		else if (score >= 60)
			System.out.println("Your score of " + score + " deserves a D.");
		else
			System.out.println("Your score of " + score + " deserves an F.");

		System.out.println("Evaluation complete.");
	}
}
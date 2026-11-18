import java.util.Scanner;
class RandomNumberGuessingGame_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toGuess = (int) (Math.random() * 100) + 1, guess = 0;
		System.out.println("Try to guess the secret number (1-100) without using any tricks.");
		do {
			System.out.print("Enter your guess: ");
			if (scanner.hasNextInt()) {
				guess = scanner.nextInt();
				if (guess > toGuess)
					System.out.println("Too high. Try again.");
				else if (guess < toGuess)
					System.out.println("Too low. Try again.");
				else
					System.out.println("Congratulations, you guessed the secret number!");
			} else
				System.out.println("Please enter an integer from 0 to 100.");
		} while (guess != toGuess);
		scanner.close();
	}
}
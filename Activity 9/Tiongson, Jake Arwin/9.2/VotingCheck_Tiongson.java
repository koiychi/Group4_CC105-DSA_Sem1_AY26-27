import java.util.Scanner;
class VotingCheck_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();
		
		if (age >= 18)
			System.out.println("You are eligible to vote.");
		else
			System.out.println("You aren't eligible to vote yet.");
		
		System.out.println("Program finished.");
	}
}
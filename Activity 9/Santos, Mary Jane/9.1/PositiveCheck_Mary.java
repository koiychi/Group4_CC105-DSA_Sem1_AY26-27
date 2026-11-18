import java.util.Scanner ;

public class PositiveCheck_Mary {
	public static void main(String[] args) {
	

	Scanner input = new Scanner(System.in);

	System.out.print("Enter any number: ");
	int number = input.nextInt();

		if (number > 0) {
		System.out.print("The number is positive.");
		}

		System.out.println("Program finished.");
	}
}
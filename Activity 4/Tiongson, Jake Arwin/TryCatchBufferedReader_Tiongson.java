import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class TryCatchBufferedReader_Tiongson {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = reader.readLine();
		System.out.println("Hello, " + name + "!");
		System.out.print("Enter your age: ");
		String age = reader.readLine();
		try {
			int ageInt = Integer.parseInt(age);
			System.out.println("You are " + ageInt + " years old.");
			System.out.println("Next year, you will be " + (ageInt + 1) + " years old.");
		} catch (NumberFormatException e) {
			System.out.println("Oops! That is not a valid whole number.");
		}
		System.out.print("Enter your GPA: ");
		String gpa = reader.readLine();
		try {
			Double gpaDouble = Double.parseDouble(gpa);
			System.out.println("Your GPA is " + gpaDouble + ".");
			System.out.println("If it improves by 0.5, it will be " + (gpaDouble + 0.5) + ".");
		} catch (NumberFormatException e) {
			System.out.println("Oops! That is not a valid decimal number.");
		}
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class MyBufferedReader_Tiongson {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");
		String name = reader.readLine();
		System.out.println("Hello, " + name + "!");
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(reader.readLine());
		System.out.println("You are " + age + " years old.");
		System.out.println("Next year, you will be " + (age + 1) + " years old.");
		System.out.print("Enter your GPA: ");
		double gpa = Double.parseDouble(reader.readLine());
		System.out.println("Your GPA is " + gpa + ".");
		System.out.println("If it improves by 0.5, it will be " + (gpa + 0.5) + ".");
	}
}
import java.util.Scanner;
class MyScanner_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		System.out.print("Enter the price of an item: ");
		double price = scanner.nextDouble();
		System.out.println();
		System.out.println("=============");
		System.out.println(" O U T P U T ");
		System.out.println("=============");
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Price: $" + price);
		scanner.close();
	}
}
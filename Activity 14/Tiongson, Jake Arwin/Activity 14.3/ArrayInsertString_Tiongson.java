import java.util.Scanner;
class ArrayInsertString_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = new String[4];
		int size = 3;
		names[0] = "Anna";
		names[1] = "Ben";
		names[2] = "Chris";
		System.out.println("Before insertion:");

		for (int i = 0; i < size; i++) {
			System.out.print(names[i] + " ");
		}

		System.out.print("\nEnter name to insert: ");
		String name = scanner.nextLine();
		System.out.print("Enter index to insert (0 to " + size + "): ");
		int index = scanner.nextInt();

		for (int i = size - 1; i >= index; i--) {
			names[i + 1] = names[i];
		}

		names[index] = name;
		size++;
		System.out.println("After insertion:");

		for (int i = 0; i < size; i++) {
			System.out.print(names[i] + " ");
		}

		scanner.close();
	}
}
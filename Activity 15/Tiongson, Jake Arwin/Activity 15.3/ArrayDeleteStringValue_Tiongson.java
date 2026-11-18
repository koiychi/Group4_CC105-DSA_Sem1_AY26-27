import java.util.Scanner;
class ArrayDeleteStringValue_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = {"Anna", "Brian", "Carla", "David", "Ella"};
		int size = 5;
		System.out.println("Before deletion:");

		for (int i = 0; i < size; i++) {
			System.out.print(names[i] + " ");
		}

		System.out.println("\n\nEnter name to delete: ");
		String name = scanner.nextLine();
		int position = -1;

		for (int i = 0; i < size; i++) {
			if (names[i].equals(name)) {
				position = i;
				break;
			}
		}

		if (position == -1)
			System.out.println("\nName not found.");
		else {
			for (int i = 0; i < size - 1; i++) {
				names[i] = names[i + 1];
			}

			size--;
			System.out.println("\nAfter deleting \"" + name + "\":");

			for (int i = 0; i < size; i++) {
				System.out.print(names[i] + " ");
			}
		}

		scanner.close();
	}
}
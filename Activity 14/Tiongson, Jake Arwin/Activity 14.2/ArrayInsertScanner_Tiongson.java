import java.util.Scanner;
class ArrayInsertScanner_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		System.out.print("Enter number of elements: ");
		int size = scanner.nextInt();
		System.out.println("Enter " + size + " elements:");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter position to insert (0 to " + size + "): ");
		int index = scanner.nextInt();
		System.out.print("Enter value to insert: ");
		int value = scanner.nextInt();

		if (size == array.length)
			System.out.println("Array is full! Cannot insert.");
		else if (index < 0 || index > size)
			System.out.println("Invalid index.");
		else {
			for (int i = size - 1; i >= index; i--) {
				array[i + 1] = array[i];
			}

			array[index] = value;
			size++;
			System.out.println("Array after insertion:");

			for (int i = 0; i < size; i++) {
				System.out.print(array[i] + " ");
			}
		}

		scanner.close();
	}
}
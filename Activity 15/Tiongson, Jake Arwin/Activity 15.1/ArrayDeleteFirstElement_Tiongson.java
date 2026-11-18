class ArrayDeleteFirstElement_Tiongson {
	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50}, size = 5;
		System.out.println("Before deletion:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < size - 1; i++) {
			array[i] = array[i + 1];
		}

		size--;
		System.out.println("\nAfter deleting the first element:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
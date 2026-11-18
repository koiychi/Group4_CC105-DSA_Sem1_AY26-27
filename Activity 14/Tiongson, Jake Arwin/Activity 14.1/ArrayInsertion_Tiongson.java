class ArrayInsertion_Tiongson {
	public static void main(String[] args) {
		int[] array = new int[5];
		int size = 4;
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		int index = 2;
		int value = 99;
		System.out.println("Before insertion:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		if (size == array.length) {
			System.out.println("\nArray full. Cannot insert.");
			System.out.println("Size is " + size + ".");
			return;
		}

		for (int i = size - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}

		array[index] = value;
		size++;
		System.out.println("\nAfter insertion:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
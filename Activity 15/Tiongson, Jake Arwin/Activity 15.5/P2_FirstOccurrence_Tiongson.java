class P2_FirstOccurrence_Tiongson {
	public static void main(String[] args) {
		int array[] = {5, 15, 25, 15, 35}, size = array.length, index = -1;
		System.out.println("Array before deletion:");

		for (int i = 0; i < size; i++) {
			if (array[i] == 15 && index == -1)
				index = i;

			System.out.print(array[i] + " ");
		}

		if (index == -1) {
			System.out.println("\n\nIndex not found.");
			return;
		} else {
			for (int i = index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}

			size--;
			System.out.println("\n\nArray after deletion:");

			for (int i = 0; i < size; i++) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
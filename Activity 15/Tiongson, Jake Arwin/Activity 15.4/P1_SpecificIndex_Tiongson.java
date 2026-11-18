class P1_SpecificIndex_Tiongson {
	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50}, size = array.length;
		System.out.println("Array before deletion:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 2; i < size - 1; i++) {
			array[i] = array[i + 1];
		}

		size--;
		System.out.println("\n\nArray after deletion:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
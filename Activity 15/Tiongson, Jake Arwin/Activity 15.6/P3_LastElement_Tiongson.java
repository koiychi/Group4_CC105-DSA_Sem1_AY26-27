class P3_LastElement_Tiongson {
	public static void main(String[] args) {
		int array[] = {100, 200, 300, 400, 500}, size = array.length;
		System.out.println("Array before deletion:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		size--;
		System.out.println("\n\nArray after deletion:");

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
class InsertionSort_Tiongson {
	public static void main(String[] args) {
		int[] array = {8, 3, 5, 2, 9};

		insertionSort(array);

		for (int number : array) {
			System.out.print(number + " ");
		}
	}

	static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int number = array[i], j = i - 1;

			while (j >= 0 && array[j] > number) {
				array[j + 1] = array[j];
				j--;
			}

			array[j + 1] = number;
		}
	}
}
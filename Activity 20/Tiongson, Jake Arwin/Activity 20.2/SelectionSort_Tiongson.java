class SelectionSort_Tiongson {
	public static void main(String[] args) {
		int[] array = {42, 11, 28, 7, 34};

		selectionSort(array);

		System.out.print("Sorted array: {");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

			if (i < array.length - 1)
				System.out.print(", ");
		}

		System.out.println("}");
	}

	static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minimumValueIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minimumValueIndex])
					minimumValueIndex = j;
			}

			int temporary = array[minimumValueIndex];
			array[minimumValueIndex] = array[i];
			array[i] = temporary;
		}
	}
}
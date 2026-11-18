class BinarySearch_Jake {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		System.out.print("Please enter a number to search: ");
		int number = (new java.util.Scanner(System.in)).nextInt(),
			lowest = 0, highest = array.length - 1;

		while (lowest <= highest) {
			int middle = (highest + lowest) / 2;

			if (array[middle] == number) {
				System.out.println("Number " + number + " was found in the array at index " + middle + ".");
				return;
			} else if (array[middle] < number)
				lowest = middle + 1;
			else
				highest = middle - 1;
		}

		System.out.println("Number " + number + " could not be found in the array.");
	}
}
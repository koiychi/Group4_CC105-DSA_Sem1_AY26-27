class LinearSearch_Tiongson {
	public static void main(String[] args) {
		int array[] = {10, 20, 30, 40, 50}, position = -1;
		System.out.print("Enter a number to search the array: ");
		int number = (new java.util.Scanner(System.in)).nextInt();
		boolean found = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				found = true;
				position = i;
				break;
			}
		}

		if (found)
			System.out.println("Number " + number + " was found in the array at index " + position + ".");
		else
			System.out.println("Number " + number + " could not be found in the array.");
	}
}
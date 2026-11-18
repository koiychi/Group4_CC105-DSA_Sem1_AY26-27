public class ArrayDeleteLastElement_Estrella {
	public static void main(String[] args) {
	
		int[] arr = {10, 20, 30, 40, 50};
		int size = 5;

		System.out.println("Before Deletion:");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		size--;

		System.out.println("\n\nAfter deleting LAST elements:");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
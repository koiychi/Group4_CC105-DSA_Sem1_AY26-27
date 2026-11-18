public class Prob3_DeleteLastElement_Mary {
	public static void main(String[] args) {
	int[] arr = {100, 200, 300, 400, 500};
	int size = 5;

	System.out.println("Before deletion");
	for (int i = 0; i < size; i++) {
		System.out.print(arr[i] + " ");
	}
	
	for (int i = 4; i < size - 1; i++) {
		arr[i] = arr[i + 1];
	}
	size--;

	System.out.println("\n\nArray after deletion:");
	for (int i = 0; i < size; i++) {
		System.out.print(arr[i] + " ");
	}


	}
}
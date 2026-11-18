import java.util.LinkedList;

public class linkedlistProb2_LovelyJoyEstrella {
	public static void main(String[] lj) {
		LinkedList<String> product = new LinkedList<>();
	
	// Add 5 students Product.

		product.add("Keyboard");
		product.add("Mouse");
		product.add("Monitor");
		product.add("Printer");
		product.add("Webcam");
	
	// Display the original product list.
		System.out.println("\nOriginal Product List:");
		System.out.println(product);

	// Insert a new product at index 2.
 		product.add(2, "USB Hub");
		System.out.println("\nAfter inserting USB Hub:");
		System.out.println(product);


	//Update the product at index 3.
		product.set(3, "Mechanical Keyboard");
		System.out.println("\nAfter updating index 3:");
		System.out.println(product);
 


	// Search for a product.

		product.contains("Printer");

		if (product.contains("Printer")) {
		System.out.println("\nPrinter is available.");
		} else {
		System.out.println("Printer is not found");
		}
	

	// Remove one product.
	
	product.remove("Mouse");
	
	// Display all the product.

		System.out.println("\nFinal Product list: ");
		System.out.println(product);

	}
}


		

	
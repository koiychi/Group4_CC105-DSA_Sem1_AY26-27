import java.util.LinkedList;
public class LinkedListProb2_MarySantos {
	public static void main(String[] args){
	
	LinkedList<String> products = new LinkedList<>();
	
	System.out.println();
	System.out.println("Original Product List: ");
	products.add("Keyboard");
	products.add("Mouse");
	products.add("Monitor");
	products.add("Printer");
	products.add("Webcam");

		System.out.println(products);
		
		System.out.println();
		System.out.println("After Inserting USB Hub: ");
			products.add(2, "USB Hub");

		System.out.println(products);
		
		System.out.println();
		System.out.println("After Updating index 3: ");
			products.set(3, "Mechanical Keyboard");
	
		System.out.println(products);

		System.out.println();
		System.out.println("Printer is available ");

		System.out.println();
		System.out.println("Final Product List: ");
	
			products.remove(1);
	
		System.out.println(products);
	
		System.out.println();
	}
}

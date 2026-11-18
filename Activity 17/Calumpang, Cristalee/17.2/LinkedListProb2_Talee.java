import java.util.LinkedList;
public class LinkedListProb2_Talee {
     public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

    // Add five student names
        names.add("Keyboard");
        names.add("Mouse");
        names.add("Monitor");
        names.add("Printer");
        names.add("Webcam");
    // Display the original product list. 
        System.out.println("Original product list");
        System.out.println(names);
    // Insert a new product at index 2.
        names.add(2, "USB hub");
    System.out.println("\nAfter inserting USB hub");
        System.out.println(names);

    //Update the product at index 3. 
        names.set(3, "Mechanical keyboard");
        System.out.println("\nAfter updating index 3");
        System.out.println(names);
        
        // Search for a product
          names.contains("Printer");
        if(names.contains("Printer")) {
            System.out.println("\nPrinter is available");
        } else {
            System.out.println("Printer is not available");
        }
        // Remove one product. 
        names.remove("Mouse");
            System.out.println("\nFinal product list");
            System.out.println(names);
     }
}

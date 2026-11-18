import java.util.LinkedList;
public class LinkedListProb2_Cabaluna {
    public static void main(String[] args) {
        LinkedList<String>products = new LinkedList<>();

        // add  5 products
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Monitor");
        products.add("Printer");
        products.add("Webcam");

        // display the original list
        System.out.println("\nOriginal Product list:");
        System.out.println(products);

        // insert product at index 2
        products.add(2, "USB Hub");

        System.out.println("\nAfter inserting USB Hub:");
        System.out.println(products);

        products.set(3, "Mechanical Keyboard");
        System.out.println("\nAfter updating index 3:");
        System.out.println(products);

        // search for printer
        if(products.contains("Printer")) {
            System.out.println("\nPrinter is available.");
        } else {
            System.out.println("\nPrinter is not available.");
        }

        // remove mouse
        products.remove("Mouse");

        // display the final product list
        System.out.println("\nFinal Product List:");
        System.out.println(products);
    }  
}

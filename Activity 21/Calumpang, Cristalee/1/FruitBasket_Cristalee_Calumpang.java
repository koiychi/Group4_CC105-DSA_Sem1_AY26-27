import java.util.HashMap;

public class FruitBasket_Cristalee_Calumpang  {
    public static void main(String[] args) {
        
        HashMap<String, Integer> Fruit = new HashMap<>();

        Fruit.put("Apples", 10);
        Fruit.put("Bananas", 5);
        Fruit.put("Oranges", 8);

        System.out.println("--- My Fruit Basket ---");
        System.out.println("Initial Basket: " + Fruit);

        System.out.println("\nUpdating Apples...");
        Fruit.replace("Apples", 15);
        System.out.println("New Apple count: " + Fruit.get("Apples"));

        System.out.println("\nChecking for Grapes...");

        System.out.println("Does the basket have Grapes? " + Fruit.containsKey("Grapes"));
        
        System.out.println("Final Basket: " + Fruit);
    }
}

import java.util.HashMap;
public class FruitBasket_MaryJane_Santos {
    public static void main(String[] args) {

        HashMap<String, Integer> fruitBasket = new HashMap<>();

        System.out.println("--- My Fruit Basket ---");

        fruitBasket.put("Apples", 10);
        fruitBasket.put("Bananas", 5);
        fruitBasket.put("Oranges", 8);

        System.out.println("Initial Basket: " + fruitBasket);
        System.out.println();

        System.out.println("Updating Apples...");
        fruitBasket.put("Apples", 15);
        System.out.println("New Apple count: " + fruitBasket.get("Apples"));
        System.out.println();

        System.out.println("Checking for Grapes... ");
        fruitBasket.containsKey("Grapes");
        System.out.println("Does the basket have Grapes? " + fruitBasket.containsKey("Grapes"));

        System.out.println();
        System.out.println("Final Basket: " + fruitBasket);



    }
}
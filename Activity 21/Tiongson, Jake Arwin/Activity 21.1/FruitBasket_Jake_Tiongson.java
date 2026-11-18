import java.util.HashMap;
class FruitBasket_Jake_Tiongson {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("Apples", 10);
		map.put("Bananas", 5);
		map.put("Oranges", 8);

		System.out.println("Initial fruit basket: " + map + "\n\nUpdating apples...");

		map.put("Apples", 15);

		System.out.println("New quantity of apples: " + map.get("Apples") + "\n\nChecking for grapes...\nDoes the basket have grapes? " + map.containsKey("Grapes") + "\n\nFinal fruit basket: " + map);
	}
}
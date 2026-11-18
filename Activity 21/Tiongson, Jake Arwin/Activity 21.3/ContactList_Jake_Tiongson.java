import java.util.HashMap;

class ContactList_Jake_Tiongson {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("Mom", "555-0123");
		map.put("Dad", "555-4567");
		map.put("Alex", "555-9876");

		System.out.println("Original map: " + map + "\nTotal contacts in map: " + map.size() + "\n\nRemoving contact 'Alex'...");

		map.remove("Alex");

		System.out.println("\nUpdated map: " + map + "\nTotal contacts in map: " + map.size());		
	}
}
import java.util.HashMap;

class CodingDictionary_Jake_Tiongson {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("OOP", "Object-Oriented Programming");
		map.put("JDK", "Java Development Kit");
		map.put("RAM", "Random Access Memory");

		System.out.println("Looking up 'OOP': " + map.get("OOP"));
		System.out.println("Looking up 'AI': " + map.get("AI"));
	}
}
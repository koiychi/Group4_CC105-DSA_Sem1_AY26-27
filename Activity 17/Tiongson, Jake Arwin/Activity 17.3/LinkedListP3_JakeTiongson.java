import java.util.LinkedList;
class LinkedListP3_JakeTiongson {
	static void $(String s, boolean... b) {
		if (b.length > 0 && !b[0]) System.out.print(s);
		else System.out.println(s);
	}

	static String display(LinkedList<String> l) {
		return "[" + String.join(", ", l) + "]";
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Zachary");
		list.add("Liam");
		list.add("Pau");
		list.add("Eoin");
		list.add("Ryuunosuke");
		$("Original student list: " + display(list));
		list.addFirst("Eleftherios");
		list.addLast("Lakshya");
		$("Updated student list\n... after adding \"Eleftherios\" and \"Lakshya\": " + display(list));
		list.add(3, "Gyorgy");
		$("... after inserting \"Gyorgy\" at index 3: " + display(list) + "\n\nThe student at index 2 is " + list.get(2));

		if (list.contains("Pau"))
			$("\nPau is enrolled.");

		list.remove("Ryuunosuke");
		$("\nUpdated student list after removing \"Ryuunosuke\": " + display(list) + "\n\nThere are " + list.size() + " enrolled students in total.");

		if (list.isEmpty())
			$("\nThe student list is empty.");
		else
			$("\nThe student list is not empty.");
	}
}
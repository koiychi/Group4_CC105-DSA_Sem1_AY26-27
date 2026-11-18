import java.util.LinkedList;
class LinkedListP1_JakeTiongson {
	// helper method for easier printing
	static void $(String string, boolean... hasNewLine) {
		if (hasNewLine.length > 0 && !hasNewLine[0])
			System.out.print(string);
		else
			System.out.println(string);
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Carlos Yulo");
		list.add("EJ Obiena");
		list.add("Hidilyn Diaz");
		list.add("Rene Baterbonia");
		list.add("Sanford Vinuya");
		$("Original student list: [" + String.join(", ", list) + "]");
		list.addFirst("Alex Eala");
		list.addLast("Tachiana Mangin");
		$("\nUpdated student list: [" + String.join(", ", list) + "]");

		if (list.contains("Sanford Vinuya"))
			$("\nSanford Vinuya was found in the list.");

		$("\nThere are " + list.size() + " students in total.");
	}
}



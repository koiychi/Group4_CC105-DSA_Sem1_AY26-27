import java.util.LinkedList;
class LinkedListP2_JakeTiongson {
	// helper method for easier printing
	static void $(String string, boolean... hasNewLine) {
		if (hasNewLine.length > 0 && !hasNewLine[0])
			System.out.print(string);
		else
			System.out.println(string);
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Keyboard");
		list.add("Mouse");
		list.add("Monitor");
		list.add("Printer");
		list.add("Webcam");
		$("Original product list: [" + String.join(", ", list) + "]");
		list.add(2, "USB Hub");
		$("\nUpdated product list\n... after inserting \"USB Hub\": [" + String.join(", ", list) + "]");
		list.set(3, "Mechanical Keyboard");
		$("... after updating index 3: [" + String.join(", ", list) + "]");

		if (list.contains("Printer"))
			$("\nA printer is available.");

		list.remove("Mouse");
		$("\nFinal product list: [" + String.join(", ", list) + "]");
	}
}
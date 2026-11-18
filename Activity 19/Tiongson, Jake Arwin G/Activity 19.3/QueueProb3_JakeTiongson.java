class QueueProb3_JakeTiongson {
	public static void main(String[] args) {
		java.util.Queue<String> printQueue = new java.util.ArrayDeque<>();

		for (String file : new String[] {
			"Tax_Return_2026.pdf",
			"Quarterly_Report.docx",
			"Family_Photo.jpg"
		}) { printQueue.add(file); }

		System.out.println("Current print queue: " + printQueue);
		System.out.println("Next document to print: " + printQueue.element());
		System.out.println("\n--- Starting printing process ---");

		while (!printQueue.isEmpty()) {
			System.out.println("Printing: " + printQueue.remove() + " ... Done!");
		}

		System.out.println("\nIs the print queue empty? " + printQueue.isEmpty());
	}
}
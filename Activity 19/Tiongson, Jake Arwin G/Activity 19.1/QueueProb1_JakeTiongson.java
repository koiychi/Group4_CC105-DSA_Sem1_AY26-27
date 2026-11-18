class QueueProb1_JakeTiongson {
	public static void main(String[] args) {
		// initialization
		java.util.Queue<String> queue = new java.util.LinkedList<>();

		// enqueueing
		for (String name : new String[] {
			"Alice", "Bob", "Charlie"
		}) { queue.add(name); }

		System.out.println("Initial queue: " + queue);

		// inspecting
		System.out.println("Next person to be served: " + queue.element());

		// dequeueing
		System.out.println("Served: " + queue.remove());
		System.out.println("Queue after serving: " + queue);
	}
}
class QueueProb2_JakeTiongson {
	public static void main(String[] args) {
		java.util.Queue<Integer> queue = new java.util.PriorityQueue<>();
		queue.add(30); queue.add(20); queue.add(40); queue.add(10);
		System.out.println("Processing priority queue:");

		while (!queue.isEmpty()) {
			System.out.println("Removed: " + queue.remove());
		}
	}
}
import java.util.LinkedList;
import java.util.Queue;
public class QueueProb1_LovelyJoyEstrella  {
 	public static void main(String[] args) {

 	// 1. Create a Queue of Strings using LinkedList
 	Queue<String> line = new LinkedList<>();
 	
	// 2. Add elements (Enqueue)
 	line.add("Alice");
 	line.add("Bob");
 	line.add("Charlie");

	System.out.println("Initial Queue: " + line);
 
	// 3. Inspect the front element (Peek)
	 String nextUp = line.element();
	 System.out.println("Next person to be served: " + nextUp);

	// 4. Remove elements (Dequeue)
	 String served1 = line.remove();
	 System.out.println("Served: " + served1);
	 System.out.println("Queue after serving: " + line);

	// 5. Complete removal demonstration
	line.remove(); // Removes Bob
	line.remove(); // Removes Charlie

	 }
}
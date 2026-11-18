import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProb2_CristaleeCalumpang {
    public static void main(String[] args) {
        // 1. Create a Priority Queue of Integers
        Queue<Integer> pq = new PriorityQueue<>();

        // 2. Add numbers out of order
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        
        // 3. Remove and display elements one by one
        System.out.println("Processing Priority Queue:");
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.remove());
        }
    }
}
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProb2_MaryJaneSantos{
    public static void main(String[] args) {

        //Creating the queue Integer
        Queue<Integer> pq = new PriorityQueue<>();

        //Add elements
        pq.add(30);
        pq.add(10);
        pq.add(40);
        pq.add(20);

        //Removing one by one
        System.out.println("Processing Priority Queue: ");
        while(!pq.isEmpty()) {
            System.out.println("Removed: " + pq.remove());
        }
    }
}
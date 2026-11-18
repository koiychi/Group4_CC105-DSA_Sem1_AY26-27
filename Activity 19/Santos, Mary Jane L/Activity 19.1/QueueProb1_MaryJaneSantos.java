import java.util.LinkedList;
import java.util.Queue;

public class QueueProb1_MaryJaneSantos {
    public static void main(String[] args){

        //Create Queue String
        Queue<String> line = new LinkedList<>();

        //Add Elements
        line.add("Alice");
        line.add("Bob");
        line.add("Charlie");

        System.out.println("Initial Queue: " + line);

        //Inspect the front element (Peek)
        String nextUp = line.element();
        System.out.println("Next person to be served: " + nextUp);

        //Remove elements (Dequeue)
        String served1 = line.remove();
        System.out.println("Served: " + served1);
        System.out.println("Queue after serving: " + line);

        //Complete removal demonstration
        line.remove(); // Remove Bob
        line.remove();// Remove Charlie

    }
}
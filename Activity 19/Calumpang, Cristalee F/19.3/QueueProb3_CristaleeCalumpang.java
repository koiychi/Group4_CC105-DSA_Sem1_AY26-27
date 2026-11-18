import java.util.ArrayDeque;
import java.util.Queue;

public class QueueProb3_CristaleeCalumpang {
    public static void main(String[] args) {
        // 1. Create a Queue using ArrayDeque
        Queue<String> printQueue = new ArrayDeque<>();

        // 2. Add print jobs to the queue (Enqueue)
        printQueue.add("Tax_Return_2026.pdf");
        printQueue.add("Quarterly_Report.docx");
        printQueue.add("Family_Photo.jpg");
        System.out.println("Current Print Queue: " + printQueue);

        // 3. Look at the next document in line (Peek)
        String nextJob = printQueue.element();
        System.out.println("\nNext document to print: " + nextJob);

        // 4. Process and remove documents one by one (Dequeue)
        System.out.println("\n--- Starting Printing Process ---");
        while (!printQueue.isEmpty()) {
            String activeJob = printQueue.remove();
            System.out.println("Printing: " + activeJob + " ... Done!");
        }
        // 5. Verify the queue is now empty
        System.out.println("\nIs the print queue empty? " + printQueue.isEmpty());
    }
}
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueProb3_MaryJaneSantos {
    public static void main(String[] args) {

        //Creating Queue String
        Queue<String> printQueue = new ArrayDeque<>();

        //Add elements
        printQueue.add("Tax_Return_2026.pdf");
        printQueue.add("Quarterly_Report.docx");
        printQueue.add("Family_Photo.jpg");
        System.out.println("Current Print Queue: " + printQueue);

        //See the first element in the queue
        System.out.println();
        String nextJob = printQueue.peek();
        System.out.println("Next document to print: " + nextJob);

        //Displaying all the elements one by one
        System.out.println("\n--- Starting Printing Process ---");
        while(!printQueue.isEmpty()) {
            String activeJob = printQueue.poll();
            System.out.println("Printing: " + activeJob + "...Done!");
        }
            //Seeing if the queue is empty or not
            System.out.println("\nIs the print queue empty? " + printQueue.isEmpty());

    }
}

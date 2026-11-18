import java.util.Stack;

public class StackProb2_SandraCabaluna {
    public static void main(String[] args) {
        
        Stack<String>history = new Stack<>();

        history.push("Home");
        history.push("Student Portal");
        history.push("Course Materials");
        history.push("Java Lessons");

        System.out.println("Original Product List:");
        System.out.println(history);

        System.out.println("\nCurrent Page: " + history.peek());

        history.push("Quiz Page");
        System.out.println("\nAfter visiting Quiz Page:");
        System.out.println(history);

        if (history.contains("Student Portal")) {
            System.out.println("\nIs Student Portal in history? true");
        } else {
            System.out.println("\nIs Student Portal in history? false");
        }

        System.out.println("\nSimulating Back Button...");
        System.out.println("Remove page: " + history.pop());

        System.out.println("\nCurrent page after going back: " + history.peek());

        System.out.println("\nFinal Browser History:");
        System.out.println(history);

        System.out.println("Number of pages remaining: " + history.size());
    }
}
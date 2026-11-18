import java.util.Stack;

public class StackProb2_LovelyJoyEstrella {
    public static void main(String[] args) {
        Stack<String> browserHistory = new Stack<>();

        browserHistory.push("Home");
        browserHistory.push("Student Portal");
        browserHistory.push("Course Materials");
        browserHistory.push("Java Lessons");

        System.out.println("Original Product List:");
        System.out.println(browserHistory);
        System.out.println();

        System.out.println("Current page: " + browserHistory.peek());
        System.out.println();

        browserHistory.push("Quiz Page");

        System.out.println("After visiting Quiz Page:");
        System.out.println(browserHistory);
        System.out.println();

        boolean hasStudentPortal = browserHistory.contains("Student Portal");
        System.out.println("Is Student Portal in history? " + hasStudentPortal);
        System.out.println();

        System.out.println("Simulating Back button...");
        String removedPage = browserHistory.pop();
        System.out.println("Removed page: " + removedPage);
        System.out.println();

        System.out.println("Current page after going back: " + browserHistory.peek());
        System.out.println();

        System.out.println("Final Browser History:");
        System.out.println(browserHistory);
        System.out.println("Number of pages remaining: " + browserHistory.size());
    }
}
import java.util.Stack;

public class StackProb2_CristaleeCalumpang {
    public static void main(String[] args) {

        Stack<String> browser = new Stack<>();

        browser.push("Home");
        browser.push("Student Portal");
        browser.push("Course Material");
        browser.push("Java Lessons");

        System.out.println("Original Product List: ");
        System.out.println(browser);

        System.out.println();

        System.out.println("Current page: " + browser.peek());

        System.out.println();

        browser.push("Quiz page");

        System.out.println("After visiting Quiz Page");
        System.out.println(browser);

        System.out.println();

        System.out.println("Is Student portal in history? " + browser.contains("Student Portal"));

        System.out.println();

        System.out.println("Simulating Back Button...");

        System.out.println("Removerd page: " + browser.pop());

        System.out.println();

        System.out.println("Current page after going back: " + browser.peek());

        System.out.println();

        System.out.println("Final Browser History: ");
        System.out.println(browser);
        System.out.println("Number of pages remaining: " + browser.size());
    }
}
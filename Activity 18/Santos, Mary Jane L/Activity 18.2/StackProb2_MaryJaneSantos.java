 import java.util.Stack;

public class StackProb2_MaryJaneSantos {
    public static void main(String[] args){
        Stack<String> history = new Stack<>();

        history.push("Home");
        history.push("Student Portal");
        history.push("Course Materials");
        history.push("Java Lessons");

        System.out.println("Original Product List: ");
        System.out.println(history);
        System.out.println();

        System.out.println("Current page: " + history.peek());
        System.out.println();

        history.push("Quiz Page");

        System.out.println("After visiting Quiz Page: ");
        System.out.println(history);
        System.out.println();

        System.out.println("Is Student Portal in history? " + history.contains("Student Portal"));
        System.out.println();

        System.out.println("Simulating Back Button...");
        System.out.println("Remove page: " + history.pop());
        System.out.println();

        System.out.println("Current page after going back: " + history.peek());
        System.out.println();

        System.out.println("Final Browser History: ");
        System.out.println(history);
        System.out.println("Number of page remaining: " + history.size());


    }
}
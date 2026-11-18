import java.util.Stack;

public class StackProb3_CristaleeCalumpang {
    public static void main(String[] args) {
        Stack<String> action = new Stack<>();

        action.push("Typed Title");
        action.push("Added paragraph");
        action.push("Inserted Image");
        action.push("Changed font size");
        action.push("Changed text color");

        System.out.println("Original Student List");
        System.out.print(action);

        System.out.println();
        System.out.println();

        System.out.println("Most recent action: " + action.peek());
        System.out.println("Is 'Added paragraph' found? " + action.contains("Added paragraph"));

        System.out.println();

        System.out.println("Undoing most recent action: " + action.pop());
        System.out.println("Undoing next recent action: " + action.pop());

        System.out.println();

        System.out.println("Remaining actions in workspace: ");
        System.out.println(action);
        System.out.println();

        System.out.println("Numbers of action remaining: " + action.size());

        System.out.println();

        System.out.println("Clearing remaining actions from stack...");
        System.out.println("Removing: " + action.pop());
        System.out.println("Removing: " + action.pop());
        System.out.println("Removing: " + action.pop());

        System.out.println();

        System.out.println("Final Stack List : " + action);
        System.out.println("Is the actiong stack empty? " + action.isEmpty());
    }

}
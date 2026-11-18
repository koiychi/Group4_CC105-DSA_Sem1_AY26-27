import java.util.Stack;

public class StackProb3_LovelyJoyEstrella {
    public static void main(String[] args) {
        Stack<String> actionStack = new Stack<>();

        actionStack.push("Typed title");
        actionStack.push("Added paragraph");
        actionStack.push("Inserted image");
        actionStack.push("Changed font size");
        actionStack.push("Changed text color");

        System.out.println("\nOriginal Student List:");
        System.out.println(actionStack);

        System.out.println("\nMost recent action: " + actionStack.peek());

        boolean hasAddedParagraph = actionStack.contains("Added paragraph");
        System.out.println("Is 'Added paragraph' found? " + hasAddedParagraph);
        System.out.println();

        System.out.println("Undoing most recent action: " + actionStack.pop());

        System.out.println("Undoing next recent action: " + actionStack.pop());
        System.out.println();

        System.out.println("Remaining actions in workspace:");
        System.out.println(actionStack);
        System.out.println();

        System.out.println("Number of actions remaining: " + actionStack.size());
        System.out.println();

        System.out.println("Clearing remaining actions from stack...");
        while (!actionStack.isEmpty()) {
            System.out.println("Removing: " + actionStack.pop());
        }
        System.out.println();

        System.out.println("Final Stack List: "
                + actionStack);
        System.out.println("Is the action stack empty? "
                + actionStack.isEmpty());
    }
}
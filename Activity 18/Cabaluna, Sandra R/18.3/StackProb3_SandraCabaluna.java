import java.util.Stack;
public class StackProb3_SandraCabaluna {
    public static void main(String[] args) {
        Stack<String>actions = new Stack<>();

        actions.push("Typed title");
        actions.push("Added paragraph");
        actions.push("Inserted image");
        actions.push("Changed font size");
        actions.push("Changed text color");

        System.out.println("Original Stack List:");
        System.out.println(actions);

        System.out.println("\nMost recent action: " + actions.peek());

        if (actions.contains("Added paragraph")) {
            System.out.println("Is 'Added paragraph' found? true");
        } else {
            System.out.println("Is 'Added paragraph' found? false");
        }

        System.out.println("\nUndoing most recent action: " + actions.pop());
        System.out.println("Undoing next recent action: " + actions.pop());

        System.out.println("\nRemaining actions in workspace:");
        System.out.println(actions);

        System.out.println("\nNumber of actions remaining: " + actions.size());

        System.out.println("\nClearing remaining actions from stack...");
       
        System.out.println("Removing: " + actions.pop());
        System.out.println("Removing: " + actions.pop());
        System.out.println("Removing: " + actions.pop());

        System.out.println("\nFinal Stack List: " + actions);

        System.out.println("Is the action stack empty? " + actions.isEmpty());


    }
}

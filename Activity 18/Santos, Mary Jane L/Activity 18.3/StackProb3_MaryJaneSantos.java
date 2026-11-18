import java.util.Stack;

public class StackProb3_MaryJaneSantos {
	public static void main(String[] args){

	Stack<String> action = new Stack<>();
	
	action.push("Typed title");
	action.push("Added paragraph");
	action.push("Insert image");
	action.push("Changed font size");
	action.push("Change text color");

	System.out.println("Original Student List: ");
	System.out.println(action);
	System.out.println();

	System.out.println("Most recent action: " + action.peek());
	System.out.println("Is 'Added paragraph found? " + action.contains("Added paragraph"));
	System.out.println();

	System.out.println("Undoing most recent Action: " + action.pop());
	System.out.println("Undoing next recent action: " + action.pop());
	System.out.println();

	System.out.println("Remaining actions in workspace: ");
	System.out.println(action);
	System.out.println();

	System.out.println("Number of actions remaining: " + action.size());
	System.out.println();

	System.out.println("Clearing remaining actions from stack...");
	System.out.println("Removing: " + action.pop());
	System.out.println("Removing: " + action.pop());
	System.out.println("Removing: " + action.pop());
	System.out.println();

	System.out.println("Final Stack List: " + action);
	System.out.println("Is the action stack empty? " + action.isEmpty());
	}
}
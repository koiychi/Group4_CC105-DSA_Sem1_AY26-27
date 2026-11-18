import java.util.Stack;
class StackProb3_JakeTiongson {
	public static void main(String[] args) {
		Stack<String> actions = new Stack<>();
		actions.push("Typed title");
		actions.push("Added paragraph");
		actions.push("Inserted image");
		actions.push("Changed font size");
		actions.push("Changed text color");
		System.out.println("Original action list: [" + String.join(", ", actions) + "]");
		System.out.println("Most recent action: " + actions.peek());
		System.out.println("Is 'Added paragraph' found? " + actions.contains("Added paragraph"));
		System.out.println("Undoing most recent action: " + actions.pop());
		System.out.println("Undoing next recent action: " + actions.pop());
		System.out.println("Remaining actions in workspace: [" + String.join(", ", actions) + "]");
		System.out.println("Number of actions remaining: " + actions.size());
		System.out.println("Clearing remaining actions from stack...");
		while (!actions.isEmpty()) {
			System.out.println("Removing: " + actions.pop());
		}
		System.out.println("Final action list: [" + String.join(", ", actions) + "]");
		System.out.println("Is the action stack empty? " + actions.isEmpty());
	}
}
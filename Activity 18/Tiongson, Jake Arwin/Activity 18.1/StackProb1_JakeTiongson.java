import java.util.Stack;
class StackProb1_JakeTiongson {
	public static void main(String[] args) {
		Stack<String> students = new Stack<>();
		students.push("Ana");
		students.push("Ben");
		students.push("Carlo");
		students.push("Diana");
		students.push("Eric");
		System.out.println("Original student stack: [" + String.join(", ", students) + "]");
		System.out.println("Top student name (peek): " + students.peek());
		System.out.println("Removed student name (pop): " + students.pop());
		System.out.println("Updated student stack: [" + String.join(", ", students) + "]");
		System.out.println("Number of students remaining: " + students.size());
	}
}
import java.util.Stack;

public class StackProb1_MaryJaneSantos {
	public static void main(String[] args) {

	Stack<String> student = new Stack<>();

	student.push("Ana");
	student.push("Ben");
	student.push("Carlo");
	student.push("Diana");
	student.push("Eric");

	System.out.println("Original Student Stack: ");
	System.out.println(student);
	System.out.println();

	System.out.println("Top student name (peek): " + student.peek());
	System.out.println("Remove student name (pop): " + student.pop());
	System.out.println();

	System.out.println("Update Student Stack: ");
	System.out.println(student);
	System.out.println();

	System.out.println("Number of students remaining: " + student.size());
	}
}
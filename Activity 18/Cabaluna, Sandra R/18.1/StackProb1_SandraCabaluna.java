import java.util.Stack;

public class StackProb1_SandraCabaluna {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Ana");
        names.push("Ben");
        names.push("Carlo");
        names.push("Diana");
        names.push("Eric");

        System.out.println("Original Student Stack:");
        System.out.println(names);

        System.out.println("\nTop student name (peek): " + names.peek());

        System.out.println("Remove student name (pop): " + names.pop());

        System.out.println("\nUpdated Student Stack");
        System.out.println(names);

        System.out.println("\nNumber of students remaining: " + names.size());
    } 
}
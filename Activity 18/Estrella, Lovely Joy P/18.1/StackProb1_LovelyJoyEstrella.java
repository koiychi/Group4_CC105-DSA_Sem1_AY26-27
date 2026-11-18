import java.util.Stack;

public class StackProb1_LovelyJoyEstrella {
    public static void main(String[] lj) {
        Stack<String> students = new Stack<>();

        students.push("Ana");
        students.push("Ben");
        students.push("Carlo");
        students.push("Diana");
        students.push("Eric");

        System.out.println("Original Student Stack:");
        System.out.println(students);
        System.out.println();

        System.out.println("Top student name (peek): " + students.peek());

        String removedStudent = students.pop();
        System.out.println("Removed student name (pop): " + removedStudent);
        System.out.println();

        System.out.println("Updated Student Stack:");
        System.out.println(students);
        System.out.println();
        System.out.println("Number of students remaining: " + students.size());
    }
}
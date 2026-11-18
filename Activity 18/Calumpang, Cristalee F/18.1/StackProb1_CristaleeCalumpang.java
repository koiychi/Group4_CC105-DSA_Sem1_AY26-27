import java.util.Stack;

public class StackProb1_CristaleeCalumpang {
  public static void main(String[] args) {


    Stack<String> names = new Stack<>();

names.push("Ana");
names.push("Ben");
names.push("Carlo");
names.push("Diana");
names.push("Eric");

System.out.println("Original Student Stack: ");
System.out.println(names);

System.out.println();

System.out.println("Top student name (peek): " + names.peek());
System.out.println("Removed student name (pop): " + names.pop());

System.out.println();

System.out.println("Update Student Stack: " );
System.out.println(names);

System.out.println();

System.out.println("Number of students remaining: " + names.size());
  }

}
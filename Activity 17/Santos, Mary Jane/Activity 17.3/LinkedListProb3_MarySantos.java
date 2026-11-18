import java.util.LinkedList;

public class LinkedListProb3_MarySantos {
	public static void main(String[] args) {
	LinkedList<String>students = new LinkedList<>();
	
	System.out.println();
	System.out.println("original Student List: ");
	
	students.add("Juan");
	students.add("Maria");
	students.add("Pedro");
	students.add("Anna");
	students.add("Luis");
	
	System.out.println(students);

	System.out.println();
	System.out.println("After adding Carlo and Sofia: ");
	
	students.add(0, "Carlo");
	students.add(6, "Sofia");

	System.out.println(students);
	
	System.out.println();
	System.out.println("After inserting Daniel at index 3: ");


	students.add(3,"Daniel");
	
	System.out.println(students);

	System.out.println();
	System.out.println("Student at index 2: " + students.get(2));
	
	System.out.println();
	System.out.print("Maria is enrolled.");

	System.out.println();
	System.out.println("After removing pedro: ");
	students.remove(4);
	
	System.out.println(students);

	System.out.println();
	System.out.println("Total students: " + students.size());

	System.out.println();
	System.out.println("The student list is not empty");
	}
}
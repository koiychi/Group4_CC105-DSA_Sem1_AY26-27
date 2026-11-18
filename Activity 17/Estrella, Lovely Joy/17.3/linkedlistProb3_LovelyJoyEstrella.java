import java.util.LinkedList;

public class linkedlistProb3_LovelyJoyEstrella {
	public static void main(String[] lj) {
		LinkedList<String> students = new LinkedList<>();


	// Add 5 Students.
		students.add("Juan");
		students.add("Maria");
		students.add("Pedro");
		students.add("Anna");
		students.add("Luis");

	// Display the original student list.
		System.out.println("\nOriginal Student List:");
		System.out.println(students);

	// Add another student's name at the beginning.
		students.addFirst("Carlo");

	// Add another students's name at the end.
		students.addLast("Sofia");

	// Display after adding carlo and sofia
		System.out.println("\nAfter adding Carlo and Sofia:");
		System.out.println(students);

	// Add another student in index 3.
		students.add(3, "Daniel");
		System.out.println("\nAfter inserting Daniel at index 3:");
		System.out.println(students);

 	// Display the student at index 2.
		
		System.out.println("\nStudent at index 2: " + students.get(2));
		

	// Search for a particular student.
		students.contains("Maria");

		if (students.contains("Maria")) {
		System.out.println("Maria is enrolled.");
		} else {
		System.out.println("Maria is not enrolled.");
		}

	// Remove one student.
		students.remove("Pedro");

	// Display the final list.
		System.out.println("\nAfter removing Pedro:");
		System.out.println(students);

	// Display the total numbers of students.
		students.size();
	        System.out.println("\nTotal students: " + students.size() );

	// Check if the list is empty.
		students.isEmpty();

		if (students.isEmpty()) {
		System.out.println("\nThe student list is empty.");
		} else {
		System.out.println("The student list is not empty.");
		}

		
	}
}





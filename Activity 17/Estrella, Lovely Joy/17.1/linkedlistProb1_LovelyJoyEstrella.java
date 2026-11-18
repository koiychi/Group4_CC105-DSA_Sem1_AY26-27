import java.util.LinkedList;

public class linkedlistProb1_LovelyJoyEstrella {
	public static void main(String[] lj) {
		LinkedList<String> names = new LinkedList<>();
	
	// Add 5 students names.

		names.add("Ana");
		names.add("Ben");
		names.add("Carlo");
		names.add("Diana");
		names.add("Edward");
	
	//Display the original list.
		System.out.println("\nOriginal Student List");
		System.out.println(names);

	// Add another student's name at the beginning.
		names.addFirst("Maria");

	// Add another students's name at the end.
		names.addLast("Felix");

	// Display the updated list.
		System.out.println("\nUpdated Student List:");
		System.out.println(names);
	
	// Search for a particular student's name.

		names.contains("Carlo");

		if (names.contains("Carlo")) {
		System.out.println("\nCarlo is found in the list.");
		} else {
		System.out.println("Carlo is not found");
                }

	// Display the number of student's name in the list.
		
		names.size();
	        System.out.println("Number of students: " + names.size() );
		
                	
		

	}
}

	
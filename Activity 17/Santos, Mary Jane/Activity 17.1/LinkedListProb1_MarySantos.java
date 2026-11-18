import java.util.LinkedList;

public class LinkedListProb1_MarySantos {
	public static void main(String[] args) {
	LinkedList<String>names = new LinkedList<>();
	
	System.out.println("original Student List: ");
	
	names.add("Jhen");
	names.add("Noli");
	names.add("Minjing");
	names.add("Napoleon");
	names.add("Janey");

	System.out.println(names);
	
	names.add(0, "Jing");
	names.add(5, "Mary");

	System.out.println();
	System.out.println("Updated Student List: ");
	System.out.println(names);

	System.out.println("Number of Names: " + names.size()); 
	}
}
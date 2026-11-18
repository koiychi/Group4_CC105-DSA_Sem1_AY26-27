import java.util.LinkedList;

public class LinkedListProb1_Talee {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        // Add five student names.
        names.add("talee");
        names.add("sandra");
        names.add("miles");
        names.add("mj");
        names.add("lj");
        //Display the original list. 
        System.out.println("Original Student List");
        System.out.println(names);

        // Add another student's name at the beginning.  
        names.addFirst("jake");
        // Add another student's name at the end. 
        names.addLast( "theo");

        // Display the updated list. 
        System.out.println("\nUpdated Student List");
        System.out.println(names);
        
        //Search for a particular student's name. 
        names.contains("jake");
        if(names.contains("jake")) {
            System.out.println("\nJake found in the list");
        } else {
            System.out.println("jake not found in the list");
        }

        //Display the number of students in the list. 
       System.out.println("\nNumber of students: " + names.size());
    }
}


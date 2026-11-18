import java.util.LinkedList;
public class LinkedListProb3_Cabaluna {
    public static void main(String[] args) {
        LinkedList<String>names = new LinkedList<>();

        // add five students
        names.add("Juan");
        names.add("Maria");
        names.add("Pedro");
        names.add("Anna");
        names.add("Luis");
        
        //display the students
        System.out.println("\nOriginal Students List:");
        System.out.println(names);

        // add at begginging
        names.addFirst("Carlo");
        // add at end
        names.addLast("Sofia");

        System.out.println("\nAfter inserting Carlo and Sofia:");
        System.out.println(names);

        // insert at index 3
        names.add(3, "Daniel");
        System.out.println("\nAfter inserting Daniel at index 3:");
        System.out.println(names);

        // get index 2
        System.out.println("\nStudents at index 2: " + names.get(2));
        
        // search
        if(names.contains("Maria")) {
            System.out.println("Maria is enrolled.");
        }else{
            System.out.println("Maria is not erolled.");
        }

        // remove pedro
        names.remove("Pedro");
        System.out.println("\nAfter removing Pedro:");
        System.out.println(names);

        //display the final list
        System.out.println("\nTotal students: " + names.size());

        if(names.isEmpty()) {
            System.out.println("The student list is empty.");
        } else {
            System.out.println("The student list is not empty.");
        }
    }
}

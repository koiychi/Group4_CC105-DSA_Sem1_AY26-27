import java.util.LinkedList;
public class LinkedListProb1_Cabaluna {
    public static void main(String[] args) {
        LinkedList<String>names = new LinkedList<>();

        // Add 5 student names
        names.add("Ben");
        names.add("Julie");
        names.add("Ana");
        names.add("Rob");
        names.add("Rey");

        // Display the original list
        System.out.println("\nOriginal Student List:");
        System.out.println(names);

        // add another name at the beggining
        names.addFirst("Thea");
        // add another name at the end
        names.addLast("Boyet");

        // display the  updated list
        System.out.println("\nUpdated Student List:");
        System.out.println(names);

        //Search for a particular name. 
        if (names.contains("Ana")) {
            System.out.println("\nAna is found in the list.");
        }else{
            System.out.println("\nAna is not found in the list.");
        }

        //Display the number of names in the list
        System.out.println("Number of students: " + names.size());
    }
}

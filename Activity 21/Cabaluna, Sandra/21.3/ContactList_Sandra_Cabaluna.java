import java.util.HashMap;

public class ContactList_Sandra_Cabaluna {
    public static void main(String[] args) {
        
        HashMap<String,String> cl = new HashMap<>();

        cl.put("Mom", "555-0123");
        cl.put("Dad", "555-4567");
        cl.put("Alex", "555-9876");

        System.out.println("--- Contact List Manager ---");
        System.out.println("Original List: " + cl);

        System.out.println("Total contacts stored: " + cl.size());

        System.out.println("\nRemoving contact 'Alex'...");
        cl.remove("Alex");

        System.out.println("\nUpdated List: " + cl);
        System.out.println("Total contacts stored now: " + cl.size());
    }
}

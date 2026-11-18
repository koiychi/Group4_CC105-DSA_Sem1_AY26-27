import java.util.HashMap;

public class ContactList_Cristalee_Calumpang {
    public static void main(String[] args) {
        
        HashMap<String,String> contact = new HashMap<>();

        contact.put("Mom", "555-0123");
        contact.put("Dad", "555-4567");
        contact.put("Alex", "555-9876");

        System.out.println("--- Contact List Manager ---");
        System.out.println("Original List: " + contact);

        System.out.println("Total contacts stored: " + contact.size());

        System.out.println("\nRemoving contact 'Alex'...");
        contact.remove("Alex");

        System.out.println("\nUpdated List: " + contact);
        System.out.println("Total contacts stored now: " + contact.size());
    }
}

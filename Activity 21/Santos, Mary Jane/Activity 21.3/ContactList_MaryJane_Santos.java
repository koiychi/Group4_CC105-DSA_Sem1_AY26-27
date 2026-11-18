import java.util.HashMap;
public class ContactList_MaryJane_Santos {
    public static void main(String[] args) {

        HashMap<String, String> contactList = new HashMap<>();

        contactList.put("Mom", "555-0123");
        contactList.put("Dad", "555-4567");
        contactList.put("Alex", "555-9876");

        System.out.println("--- Contact List Manager ---");
        System.out.println("Original List: " + contactList);
        System.out.println("Total Contact Stored: " + contactList.size());

        System.out.println();
        System.out.println("Removing contact 'Alex'");
        contactList.remove("Alex");

        System.out.println();
        System.out.println("Updated List: " + contactList);
        System.out.println("Total contact stored now: " + contactList.size());
    }
}
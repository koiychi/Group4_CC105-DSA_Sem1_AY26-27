import java.util.HashMap;
public class CodingDictionary_MaryJane_Santos {
    public static void main(String[] args) {

        HashMap<String, String> codingDictionary = new HashMap<>();


        codingDictionary.put("OOP", "Object Oriented Programming");
        codingDictionary.put("JDK", "Java Development Kit");
        codingDictionary.put("RAM", "Random Access Memory");

        System.out.println("--- Coding Dictionary ---");
        String course = codingDictionary.get("OOP");
        System.out.println("Looking Up OOP: " + course);

        System.out.println();
        System.out.println("Looking up 'AI'... ");
        System.out.println(codingDictionary.get("AI"));


    }
}
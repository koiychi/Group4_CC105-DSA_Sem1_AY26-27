import java.util.HashMap;

public class CodingDicitonary_Sandra_Cabaluna {
    public static void main(String[] args) {
        
        HashMap<String, String> cd = new HashMap<>();

        System.out.println("--- Coding Dictionary ---");
        cd.put("OOP", "Object-Oriented Programming");
        cd.put("JDK", "Java Development Kit");
        cd.put("RAM", "Random Access Memory");

        String name = cd.get("OOP");
        System.out.println("Looking up 'OOP': " + name );

        
  
        System.out.println("\nLooking up 'AI' " + cd.get("AI"));

    }
    
}

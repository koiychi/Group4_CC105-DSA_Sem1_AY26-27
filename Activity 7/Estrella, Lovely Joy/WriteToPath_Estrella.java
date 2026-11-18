import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class WriteToPath_Estrella {
      public static void main (String [] argrs) {
 
    String path = "C:\\Users\\lovely joy\\downloads\\Practice\\report_Estrella.txt";

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
       writer.write("Report Title: Weekly Summary");
       writer.newLine();
       writer.write("* Users: 120");
       writer.newLine();
       writer.write("\n* Errors: 0");

     } catch (IOException e) {
    System.out.println("An error occurred: " + e.getMessage());

     }
   }
 }
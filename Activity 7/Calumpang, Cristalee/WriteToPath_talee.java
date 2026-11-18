import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToPath_talee {
public static void main(String[] args) {

String path = "C:\\Users\\talee\\Downloads\\report_talee.txt";

try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
writer.write("Report Title: Weekly Summary");
writer.newLine();
writer.write("*User: 120");
writer.newLine();
writer.write("\n* Errors: 0");

} catch (IOException e) {

System.out.println("An error accurred: "+ e.getMessage());
}
}
}
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample_talee {
public static void main (String[] args) {

try{
BufferedWriter writer = new BufferedWriter(new FileWriter("output_talee.txt"));

writer.write("Hello, this is my first line using BufferedWriter!");
writer.newLine();
writer.write("BufferedWriter makes writing files easy and fast.");

writer.close();

System.out.println("File writing successful! Check output.txt");
} catch (IOException e) {
System.out.println("An error accured: " + e.getMessage());
}
}
}
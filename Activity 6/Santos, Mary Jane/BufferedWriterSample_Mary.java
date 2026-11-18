import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample_Mary {
	public static void main(String[] args) {
		try{
		BufferedWriter writer = new BufferedWriter(new FileWriter("output_Mary.txt"));
		
		writer.write("Hello, this is my first line using BufferedWriter!");
		writer.newLine();
		writer.write("BufferedWriter makes writing files easy and fast.");

		writer.close();

		System.out.println("File writing succesfull check output_Mary.txt");
		} catch (IOException e) {
		System.out.println("An error occured: " + e.getMessage());
		}

	}
}
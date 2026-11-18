import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class BufferedWriterSample_Tiongson {
	public static void main(String[] args) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output_tiongson.txt"));
			writer.write("Hello, this is (not) my first time using BufferedWriter!");
			writer.newLine();
			writer.write("BufferedWriter makes writing files easy and fast.");
			writer.newLine();
			writer.write("My name is Jake...Just to be clear. Oh, and...");
			writer.newLine();
			writer.write("By the way, these are my favorite languages in no particular order: Nivkh, Kawesqar, Yup'ik, Skolt Saami, Mari, Erzya, Haida, Pite Saami, Yakut, Miyakoan.");
			writer.close();
			System.out.println("File writing successful! Please check output.txt.");
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
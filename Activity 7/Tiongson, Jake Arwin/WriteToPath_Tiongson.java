import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
class WriteToPath_Tiongson {
	public static void main(String[] args) {
		String path = "C:\\Users\\PC16\\Documents\\TiongsonJAG\\report_tiongson.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			writer.write("Report Title: Weekly Summary");
			writer.newLine();
			writer.write("* Users: 120");
			writer.flush();
			writer.write("\n* Errors: 0");
			writer.newLine();
			writer.write("Current Languages: Nivkh, Kawesqar, Pite Sámi, Mari, Erzya, Miyakoan");
			writer.newLine();
			writer.write("Administrator: Jake Tiongson");
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
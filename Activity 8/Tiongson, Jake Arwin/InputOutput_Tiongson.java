import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class InputOutput_Tiongson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String file_name = "tala_tiongson.txt";
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file_name));
			writer.write("====== Kabuuang Talaan ======");
			writer.newLine();
			for (int i = 1; i <= 10; i++) {
				System.out.println("Mga tala para kay Student " + i);
				System.out.print("Pangalan: ");
				String name = scanner.nextLine().trim();
				System.out.print("Kurso: ");
				String course = scanner.nextLine().trim();
				System.out.print("Grado: ");
				String grade = scanner.nextLine().trim();
				System.out.print("Lengguwahe: ");
				String language = scanner.nextLine().trim();
				writer.write("-".repeat(20));
				writer.newLine();
				writer.write("| Student " + i);
				writer.newLine();
				writer.write("| Pangalan: " + name);
				writer.newLine();
				writer.write("| Kurso: " + course);
				writer.newLine();
				writer.write("| Grado: " + grade);
				writer.newLine();
				writer.write("| Language: " + language);
				writer.newLine();
				writer.write("-".repeat(20));
				writer.newLine();
				writer.newLine();
				System.out.print("Gusto mo bang magtala ng isa pang Student? ");
				String answer = scanner.nextLine().trim().toLowerCase();
				if (answer.equals("no") || answer.equals("n") || answer.equals("hindi")) {
					break;
				}
			}
			writer.close();
			System.out.println("Naitala na ang lahat sa " + file_name + ".\n");
			BufferedReader reader = new BufferedReader(new FileReader(file_name));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Nagkaroon ng problema: " + e.getMessage());
		}
		scanner.close();
	}
}
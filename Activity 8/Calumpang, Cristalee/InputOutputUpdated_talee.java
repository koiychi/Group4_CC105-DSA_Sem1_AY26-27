import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class InputOutputUpdated_talee {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String filePath = "student_report_talee.txt02";

try {
BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

writer.write("===Student Report ===");
writer.newLine();

for (int i = 1; i <= 10; i++) {
System.out.println("\nEnter details for Student " + i);

System.out.print("Enter student name: ");
String name = sc.nextLine().trim();

System.out.print("Enter course: ");
String course = sc.nextLine().trim();

System.out.print("Enter grade: ");
String grade = sc.nextLine().trim();

writer.write("Student " + i);
writer.newLine();
writer.write("Name   :" + name);
writer.newLine();
writer.write("Course  :" + course);
writer.newLine();
writer.write("Grade  :" + grade);
writer.newLine();
writer.write("------------------");
writer.newLine(); 

System.out.print("Do you want to add another student? (yes/no): ");
String choice = sc.nextLine().trim().toLowerCase();
if (choice.equals("no") || choice.equals("n")) {
break; 
}
}

writer.close();
System.out.println("\nAll student reports saved successfully to " + filePath);

System.out.println("\n---Reading Report ---");
BufferedReader reader = new BufferedReader(new FileReader(filePath));

String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
reader.close();

} catch (IOException e) {
System.out.println("An error occurred: " + e.getMessage());
}

sc.close();
}
}

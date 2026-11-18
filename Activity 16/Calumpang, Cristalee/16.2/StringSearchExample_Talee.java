import java.util.Scanner;

public class StringSearchExample_Talee {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String[] names = {"Anna", "Brian", "Carla", "David", "Ella"};

System.out.println("List of names:");
for (int i = 0; i < names.length; i++) {
   System.out.println((i + 1) + ". " + names[i]);
}

System.out.print("\nEnter a name to search: ");
String target = input.nextLine();

Boolean found = false;

for (int i = 0; i < names.length; i++) {
  if (names[i].equalsIgnoreCase(target)) {
    System.out.println("\n " + target + " found at index " + i);
  found = true;
  break;
}
}
if (!found) {
  System.out.println("\n " + target + " not found in the list.");
}
input.close();
}
}
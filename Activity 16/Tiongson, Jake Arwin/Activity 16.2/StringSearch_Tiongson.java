class StringSearch_Tiongson {
	public static void main(String[] args) {
		String[] names = {"Anna", "Brian", "Carla", "David", "Ella"};
		System.out.print("List of names: " + String.join(", ", names) + "\nEnter a name to search the array: ");
		String name = (new java.util.Scanner(System.in)).nextLine();

		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				System.out.println("Name \"" + name + "\" was found in the array at index " + i + ".");
				return;
			}
		}

		System.out.println("Name \"" + name + "\" could not be found in the array.");
	}
}
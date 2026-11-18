import java.util.Stack;
class StackProb2_JakeTiongson {
	public static void main(String[] args) {
		Stack<String> pages = new Stack<>();
		pages.push("Home");
		pages.push("Student Portal");
		pages.push("Course Materials");
		pages.push("Java Lessons");
		System.out.println("Original page list: [" + String.join(", ", pages) + "]");
		System.out.println("Current page: " + pages.peek());
		pages.push("Quiz Page");
		System.out.println("After visiting Quiz Page: [" + String.join(", ", pages) + "]");
		System.out.println("Is Student Portal in history? " + pages.contains("Student Portal"));
		System.out.println("Simulating back button...\nRemoved page: " + pages.pop());
		System.out.println("Current page after going back: " + pages.peek());
		System.out.println("Final browser history: [" + String.join(", " , pages) + "]");
		System.out.println("Number of pages remaining: " + pages.size());
	}
}
class CombiOperation_Tiongson {
	static void tab(String operation, int result) {
		System.out.println(" " + operation + "\t\t" + result);
	}
	static void tab(String operation, String result) {
		System.out.println(" " + operation + "\t\t" + result);
	}
	static void tab(String operation, boolean result) {
		System.out.println(" " + operation + "\t\t" + result);
	}
	static void title(String text) {
		System.out.println("=".repeat(text.length() + 2));
		System.out.println(" " + text);
		System.out.println("=".repeat(text.length() + 2));
		System.out.println();
	}
	public static void main(String[] args) {
		int a = 10, b = 3;
		title("Arithmetic Operators");
		tab("a + b", a+b);
		tab("a - b", a-b);
		tab("a * b", a*b);
		tab("a / b", a/b);
		tab("a % b", a%b);
		System.out.println();
		title("Relational Operators");
		tab("a == b", a==b);
		tab("a != b", a!=b);
		tab("a > b", a>b);
		tab("a < b", a<b);
		tab("a >= b", a>=b);
		tab("a <= b", a<=b);
		System.out.println();
		title("Logical Operators");
		tab("x", a!=b);
		tab("y", a==b);
		tab("x && y", (a!=b)&&(a==b));
		tab("x || y", (a!=b)||(a==b));
		tab("!x", !(a!=b));
		System.out.println();
		title("Assignment Operators");
		a = 5;
		tab("a", a);
		a += 3;
		tab("a += 3", a);
		a -= 2;
		tab("a -= 2", a);
		a *= 4;
		tab("a *= 4", a);
		a /= 2;
		tab("a /= 2", a);
		a %= 3;
		tab("a %= 3", a);
		System.out.println();
		title("Unary Operators");
		b = 7;
		tab("b", b);
		tab("++b", ++b);
		tab("--b", --b);
		tab("-b", -b);
		System.out.println();
		title("Ternary Operator");
		int age = 20;
		tab("age", 20);
		String result = age >= 18 ? "Adult" : "Minor";
		tab("age >= 18", age >= 18 ? "Adult" : "Minor");
	}
}
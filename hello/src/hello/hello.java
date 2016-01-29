package hello;

/**
 * Created by Scott Shuffler.
 */

public class hello {
	public static void main(String[] args) {
		String input = args[0];
		if (!input.equals("")) {
			checkCase(input);
			input = buildHello(input);
			printHello(input);
		}
	}

	public static String buildHello(String input) {
		return "Hello, " + input + "!";
	}

	public static void printHello(String input) {

			checkCase(input);
			System.out.print(input);

	}

	public static String checkCase(String input) {
		return input;
	}
}

package hello;

/**
 * Created by Scott Shuffler.
 */

public class hello {
	public static void main(String[] args) {
		String input = args[0];
		if (!input.equals("")) {
			input = checkCase(input);
			input = buildHello(input);
			printHello(input);
		}
	}

    public static String checkCase(String input) {
        String newInput = input.toLowerCase();
        return newInput.substring(0, 1).toUpperCase() + newInput.substring(1);
    }

	public static String buildHello(String input) {
		return "Hello, " + input + "!";
	}

	public static void printHello(String input) {
			checkCase(input);
			System.out.print(input);
	}

}

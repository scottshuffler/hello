package hello;

/**
 * Created by Scott Shuffler.
 */

public class hello {
    private static String computerName = "Computer";

    public static void main(String[] args) {
        String userName;
        if (args.length == 0) {
            userName = "Scott";
            userName = checkCase(userName);
            userName = buildHello(userName);
            printHello(userName);
        }
        else if (args[0].equals("-me")) {
            computerName = args[1];
            userName = args[2];
            userName = checkCase(userName);
            computerName = checkCase(computerName);
            userName = buildHello(userName);
            printHello(userName);
        }
        else {
            userName = args[0];
            if (!userName.equals("")) {
                userName = checkCase(userName);
                userName = buildHello(userName);
                printHello(userName);
            }
        }
	}

    public static String checkCase(String input) {
        String newInput = input.toLowerCase();
        return newInput.substring(0, 1).toUpperCase() + newInput.substring(1);
    }

	public static String buildHello(String input) {
		return "Hello, " + input + ". My name is " + computerName + ". How are you " + input + "?";
	}

	public static void printHello(String input) {
			System.out.print(input);
	}

}

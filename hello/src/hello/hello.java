package hello;

/**
 * Created by Scott Shuffler.
 */

public class hello {
    private static String computerName = "Computer";

    public static void main(String[] args) {
        String userName;

        // If no arguments entered it will display the default name.
        if (args.length == 0) {
            String defaultName = "Scott";
            userName = buildHello(defaultName);
            printHello(userName);
        }

        // If you use the -me command it will use your specified
        // computer name and personal name
        else if (args[0].equals("-me")) {
            computerName = args[1];
            userName = args[2];
            userName = checkCase(userName);
            computerName = checkCase(computerName);
            userName = buildHello(userName);
            printHello(userName);
        }

        // If just your name is on the command line it will use it
        // and the default computer name
        else {
            userName = args[0];
            if (!userName.equals("")) {
                userName = checkCase(userName);
                userName = buildHello(userName);
                printHello(userName);
            }
        }
	}

    // Takes in the name, makes it all lower case
    // and then makes the first character capitalized
    public static String checkCase(String input) {
        String newInput = input.toLowerCase();
        return newInput.substring(0, 1).toUpperCase() + newInput.substring(1);
    }

    // Builds the print string that includes the computer name
	public static String buildHello(String input) {
		return "Hello, " + input + ". My name is " + computerName + ". How are you " + input + "?";
	}

    // Prints the string built in buildHello
	public static void printHello(String input) {
			System.out.print(input);
	}

}

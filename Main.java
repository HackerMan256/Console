import java.util.Scanner;
import java.awt.Toolkit;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Commands commands = new Commands();
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println(commands.info());
        System.out.println();
        System.out.println("Total memory: " + totalMemory + " bytes.");
        System.out.println("Memory in use: " + usedMemory + " bytes.");
        System.out.println();

        String input;
        
        do {
            System.out.print(">");
            input = scanner.nextLine();

            if (input.equals("")) {
				// Do nothing.
			} else if (input.equalsIgnoreCase("about")) {
				System.out.println(commands.info());
			} else if (input.equalsIgnoreCase("beep")) {
				Toolkit.getDefaultToolkit().beep();
			} else if (input.equalsIgnoreCase("hello")) {
				commands.hello();
			} else if (input.equalsIgnoreCase("help")) {
				commands.help();
            } else if (input.equalsIgnoreCase("games")) {
                commands.gameMenu();
            } else if (input.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.println("ERROR: INVALID COMMAND!");
            }
        } while(true);

        System.out.println("Good bye!");
		scanner.close();
    }
}

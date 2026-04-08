import java.util.Scanner;

class Main {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Commands commands = new Commands();
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println(GREEN);
        System.out.println(commands.info());
        System.out.println(BLUE);
        System.out.println("Total memory: " + totalMemory + " bytes.");
        System.out.println("Memory in use: " + usedMemory + " bytes.");
        System.out.println(RESET);

        String input;

        do {
            System.out.print(">");
            input = scanner.nextLine();
            System.out.print(GREEN);

            if (input.equals("")) {
                // Do nothing.
            } else if (input.equalsIgnoreCase("about")) {
                System.out.println(commands.info());
            } else if (input.equalsIgnoreCase("hello")) {
                commands.hello();
            } else if (input.equalsIgnoreCase("help")) {
                System.out.print(BLUE);
                commands.help();
            } else if (input.equalsIgnoreCase("games")) {
                commands.gameMenu();
            } else if (input.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out.print(RED);
                System.out.println("ERROR: INVALID COMMAND!");
            }

            System.out.print(RESET);
        } while (true);

        System.out.println("Good bye!");
        scanner.close();
    }
}

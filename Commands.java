import java.util.Scanner;

public class Commands {
    Scanner scanner = new Scanner(System.in);
    Runtime runtime = Runtime.getRuntime();
    Games games = new Games();

    long totalMemory = runtime.totalMemory();
    long freeMemory = runtime.freeMemory();

    public String info() {
        return "Program version 0.2 VERSION-DATE: 2026-04-07. Made by: HackerMan_256";
    }

    public void hello() {
        System.out.println("Hello, World!");
    }

    public void help() {
        String help[] = {"about", "games", "hello", "help", "quit"};
        System.out.println("Listing all avaliable commands:");
        for (int i = 0; i < help.length; i++) {
			System.out.println(" - " + help[i]);
		}
    }

    public void gameMenu() {
        int input;
        do {
            System.out.println("╔══════════════════════════╗");
            System.out.println("║ Select an option to play ║");
            System.out.println("╠══════════════════════════╣");
            System.out.println("║ 1. Guess the number.     ║");
            System.out.println("║ 2. Exit                  ║");
            System.out.println("╚══════════════════════════╝");

            input = scanner.nextInt();

            switch (input){
                case 1:
                    games.guessTheNumber();
                    break;
                case 2:
                    System.out.println("Quitting...");
                    System.out.println();
                    break;
                default:
                    System.out.println("Please input an valid option.");
            }
        } while (input != 2);
    }
    
}
// ╔ ╗ ╚ ╝ ═ ║ ╠ ╣ ╦ ╩ ╬
// ┌ ┐ └ ┘ ─ │ ├ ┤ ┬ ┴ ┼
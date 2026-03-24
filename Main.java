import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, World!");
        System.out.println("Welcome to the CONSOLE! Feel free to type commands and stuff.");

		String info = "Program version 0.1 VERSION-DATE: 2026-02-20. Made by: HackerMan_256";
        String input;
        String help[] = {"about", "beep", "hello", "help", "quit"};
        
        do {
			//System.out.println();
            System.out.print(">");
            input = scanner.nextLine();

            if (input.equals("")) {
				
			} else if (input.equalsIgnoreCase("about")) {
				System.out.println(info);
			} else if (input.equalsIgnoreCase("beep")) {
				System.out.println("beep!");
			} else if (input.equalsIgnoreCase("hello")) {
				System.out.println("Hello, World!");
			} else if (input.equalsIgnoreCase("help")) {
				System.out.println("Listing all the commands avaliable:");
				for (int i = 0; i < help.length; i++) {
					System.out.println(" - " + help[i]);
				}
            } else if (input.equalsIgnoreCase("quit")) {
				System.out.println("Good bye!");
				scanner.close();
				break;
            } else {
                System.out.println("ERROR: INVALID COMMAND!");
            }
        } while(true);
    }
}

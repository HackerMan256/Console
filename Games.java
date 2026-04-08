import java.util.Scanner;
import java.util.Random;

public class Games {
    public void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attemptsLeft = 15, correctNumber = random.nextInt(100);

        int input;

        System.out.println("Guess the number I'm thinking.");

        do {
            System.out.println("[" + attemptsLeft + "] attempst left.");
            System.out.print("INPUT NUMBER >");
            input = scanner.nextInt();

            System.out.println();

            if (input == correctNumber) {
                System.out.println("You won!. It was " + correctNumber + ".");
                System.out.println("Your score: " + attemptsLeft * 100 + " points.");
                break;
            } else if (input < correctNumber) {
                System.out.println("It's higher.");
            } else {
                System.out.println("It's lower.");
            }

            if (attemptsLeft == 0 ) {
                System.out.println("You lose!");
                break;
            }

            attemptsLeft--;

        } while (attemptsLeft > 0);

        System.out.println();
    }
}
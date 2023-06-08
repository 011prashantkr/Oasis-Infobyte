package Task1;


import java.util.Scanner;

public class NoGuessingGame {

    // Function that implements the number guessing game.
    public static void NumberGuessingGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100* Math.random());//type casting

        int T = 5;//t=trails
        int i, guess;

        System.out.println("A number is chosen between 1 to 100. \n" +
                "Guess the number within 5 trials.");

        // Iterate over 5 Trials
        for (i = 0; i < T; i++) {

            System.out.println(
                    "Guess the number:");

            // Take input for guessing the number
            guess = sc.nextInt();

            if (number == guess) {
                System.out.println(
                        "Congratulations! You guessed the number in "
                       +T );
                break;
            }
            else if (number > guess && i != T - 1) {
                System.out.println(
                        "The number is greater than " + guess);
            }
            else if (number < guess && i != T - 1) {
                System.out.println(
                        "The number is less than " + guess);
            }
        }

        if (i == T) {
            System.out.println(
                    "Sorry! You have exhausted your trials ;( \n" +
                            "Play again ;) ");

            System.out.println(
                    "The number was " + number);
        }
    }

    public static void main(String[] arg)
    {
        // Function Call
        NumberGuessingGame();
    }
}

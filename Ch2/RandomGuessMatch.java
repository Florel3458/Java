import java.util.Scanner;

public class RandomGuessMatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MIN = 1;
        final int MAX = 5;
        int random = MIN + (int)(Math.random() * MAX);

        System.out.println("-----------------------------------");
        System.out.print("Guess a number between " + MIN + " and " + MAX + "  >  ");
        int guess = in.nextInt();
        System.out.println("-----------------------------------");

        boolean isCorrect = (guess == random);

        System.out.println("=====================================");
        System.out.println("The difference between your guess of " + guess);
        System.out.println("And the random number " + random);
        System.out.println("... is " + (guess - random));
        System.out.println("\n Your guess was " + isCorrect);
        System.out.println("=====================================");

        in.close();
    }
}

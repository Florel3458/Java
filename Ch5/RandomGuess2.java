import java.util.Scanner;

public class RandomGuess2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        Scanner in = new Scanner(System.in);
        int randomNo = (int)(Math.random() * LIMIT + 1);

        System.out.print("Enter your guess for a random number between 1 and " + LIMIT + "  >> ");
        int guess = in.nextInt();
        if(guess > 0 && guess <= LIMIT) {
            System.out.println("The number was " + randomNo);
            if(guess == randomNo) {
                System.out.println("Good guess!");
            } else if(guess < randomNo) {
                System.out.println("Too low!");
            } else { // guess > randomNo
                System.out.println("Too high!");
            }
        } else {
            System.out.println("!!  Invalid input  !!");
        }
    in.close();
    }
}

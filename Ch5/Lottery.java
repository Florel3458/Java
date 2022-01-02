import java.text.*;
import javax.swing.*;

public class Lottery {
    public static void main(String args[]) {
        final int HIGHEST_WIN = 1000000;
        final int SECOND_BEST_WIN = 1000;
        final int THIRD_BEST_WIN = 100;
        final int LOWEST_WIN = 10;
        String entry;
        int number1, number2, number3;
        int userGuess;
        int ran1, ran2, ran3;
        int random;
        int matches = 0;
        int winnings = 0;
        NumberFormat myFormat = NumberFormat.getInstance();
        ran1 = (int)Math.floor(Math.random()*10);
        ran2 = (int)Math.floor(Math.random()*10);
        ran3 = (int)Math.floor(Math.random()*10);
        // ran1 = 4;
        // ran2 = 4;
        // ran3 = 4;

        random = ran1 * 100 + ran2 * 10 + ran3;
        entry = JOptionPane.showInputDialog(null, "Enter first digit");
        number1 = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter second digit");
        number2 = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter third digit");
        number3 = Integer.parseInt(entry);
        userGuess = number1 * 100 + number2 * 10 + number3;

        if(number1 == ran1) {
            ++matches;
            ran1 = 99;
        } else if(number1 == ran2) {
            ++matches;
            ran2 = 99;
        } else if(number1 == ran3) {
            ++matches;
            ran3 = 99;
        }

        if(number2 == ran1) {
            ++matches;
            ran1 = 99;
        } else if(number2 == ran2) {
            ++matches;
            ran2 = 99;
        } else if(number2 == ran3) {
            ++matches;
            ran3 = 99;
        }

        if(number3 == ran1) {
            ++matches;
            ran1 = 99;
        } else if(number3 == ran2) {
            ++matches;
            ran2 = 99;
        } else if(number3 == ran3) {
            ++matches;
            ran3 = 99;
        }
        if(userGuess == random) {
            matches = 4;
        }
        switch(matches) {
            case 4:
                winnings = HIGHEST_WIN;
                break;
            case 3:
                winnings = SECOND_BEST_WIN;
                break;
            case 2:
                winnings = THIRD_BEST_WIN;
                break;
            case 1:
                winnings = LOWEST_WIN;
                break;
            default:
                winnings = 0;
        }
        JOptionPane.showMessageDialog(null, "You guessed " + userGuess + "\nWinning number was " + random + "\nYou have won $" + myFormat.format(winnings) + "!");
    }
}

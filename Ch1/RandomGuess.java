import javax.swing.JOptionPane;

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    // Filename: RandomGuess.java
    // Written by: Elizabeth Weisbrod
    // Written on: 2021/10/29
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

public class RandomGuess {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Guess a number between 1 and 10");
        JOptionPane.showMessageDialog(null, "The number is "+ (1 + (int)(Math.random() * 10)));
    } /* I'll guess 4 */
}

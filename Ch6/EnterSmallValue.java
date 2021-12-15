import java.util.*;

public class EnterSmallValue {
    public static void main(String[] args) {
        final int LIMIT = 3;
        int userEntry;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer no higher than " + LIMIT + " > ");
        userEntry = in.nextInt();

        while(userEntry > LIMIT) {
            System.out.println("The number you entered was too high...");
            
            System.out.print("\nPlease enter an integer no higher than " + LIMIT + " > ");
            userEntry = in.nextInt();
        }
        System.out.println("You correctly entered " + userEntry);
        in.close();
    }
}

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        String isEvenMsg = isEven() ? "even" : "odd";
        System.out.println("The number you entered is " + isEvenMsg);
    }

    public static boolean isEven() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any integer  >>  ");
        int num = in.nextInt();
        in.close();

        return (num % 2 == 0);
    }
}

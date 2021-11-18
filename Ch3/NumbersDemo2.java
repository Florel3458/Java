import java.util.*;

public class NumbersDemo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;

        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");
        System.out.print("Please give a value for a number         >>\t");
        x = in.nextInt();
        System.out.print("Please give a value for another number   >>\t");
        y = in.nextInt();
        System.out.println("<~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~>");

        System.out.println("-----------------");
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);

        in.close();
    }
    public static void displayTwiceTheNumber(int x, int y) {
        System.out.println(x + " * 2 = " + (x*2));
        System.out.println(y + " * 2 = " + (y*2));
        System.out.println("-----------------");
    }
    public static void displayNumberPlusFive(int x, int y) {
        System.out.println(x + " + 5 = " + (x+5));
        System.out.println(y + " + 5 = " + (y+5));
        System.out.println("-----------------");
    }
    public static void displayNumberSquared(int x, int y) {
        System.out.println(x + " ^ 2 = " + (x*x));
        System.out.println(y + " ^ 2 = " + (y*y));
        System.out.println("-----------------");
    }
}
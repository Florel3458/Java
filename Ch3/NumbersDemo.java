public class NumbersDemo {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;

        System.out.println("-----------------");
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);
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
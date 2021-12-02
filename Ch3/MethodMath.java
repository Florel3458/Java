import java.util.Scanner;

public class MethodMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Please enter a number for x  >> ");
        x = input.nextInt();
        System.out.print("Please enter a number for y  >> ");
        y = input.nextInt();
        input.close();

        System.out.println("--------------------");
        System.out.println("The result of " + x + " + " + y + " is " + doAddition(x, y));
        System.out.println("The result of " + x + " - " + y + " is " + doSubtraction(x, y));
        System.out.println("The result of " + x + " * " + y + " is " + doMultiplication(x, y));
        System.out.println("The result of " + x + " / " + y + " is " + doDivision(x, y));
    }

    public static int doAddition(int x, int y) {
        int result = x + y;
        return result;
    }
        
    public static int doSubtraction(int x, int y) {
        int result = x - y;
        return result;
    }
        
    public static int doMultiplication(int x, int y) {
        int result = x * y;
        return result;
    }
        
    public static double doDivision(int x, int y) {
        double result = (double)x / y;
        return result;
    }
}

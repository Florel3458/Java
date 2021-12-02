import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;

        System.out.print("Please enter a number for x  >> ");
        num1 = input.nextDouble();
        System.out.print("Please enter a number for y  >> ");
        num2 = input.nextDouble();
        input.close();

        System.out.println("--------------------");
        computePercent(num1, num2);
        System.out.println("\t- and -");
        computePercent(num2, num1);
    }

    public static void computePercent(double x, double y) {
        double percent = (x / y)*100;

        System.out.println(x + " is " + percent + "% of " + y);
    }
}

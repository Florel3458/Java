import java.util.*;

public class ParadiseInfo2 {
    public static void main(String[] args) {
        double price;
        double discount;
        double savings;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter cutoff price for discount >> ");
        price = in.nextDouble();
        System.out.print("Enter discount rate as a whole number >> ");
        discount = in.nextDouble();

        displayInfo();
        savings = computeDiscountInfo(price, discount);

        System.out.println("Special this week on any service over $" + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings);
        in.close();
    }

    public static void displayInfo() {
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }

    public static double computeDiscountInfo(double pr, double dscnt) {
        double savings;
        savings = pr * dscnt / 100;
        return savings;
    }
}

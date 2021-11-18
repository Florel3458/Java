import java.util.*;

public class ChiliToGoProfit {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final double ADULT_PRICE = 7.00;
    final double CHILD_PRICE = 4.00;
    final double ADULT_PRODUCTION = 4.35;
    final double CHILD_PRODUCTION = 3.10;
    double adultProfit = ADULT_PRICE - ADULT_PRODUCTION;
    double childProfit = CHILD_PRICE - CHILD_PRODUCTION;
    double totalProfit;
    int adultMeal;
    int childMeal;

    System.out.println("------------------------------------------");
    System.out.print("How many adult meals were ordered? >>\t");
    adultMeal = in.nextInt();
    System.out.print("How many child meals were ordered? >>\t");
    childMeal = in.nextInt();
    System.out.println("------------------------------------------");

    double adultTotal = adultMeal * ADULT_PRICE;
    double childTotal = childMeal * CHILD_PRICE;
    adultProfit = adultProfit * adultMeal;
    adultProfit = adultProfit * 100;
    long round = Math.round(adultProfit);
    adultProfit = round / 100.0;
    childProfit = childProfit * childMeal;
    childProfit = childProfit * 100;
    round = Math.round(childProfit);
    childProfit = round / 100.0;
    totalProfit = childProfit + adultProfit;
    totalProfit = totalProfit * 100;
    round = Math.round(totalProfit);
    totalProfit = round / 100.0;

    System.out.println("=======================================================");
    System.out.println("The amount collected from adult meals is:\t$" + adultTotal);
    System.out.println("The amount collected from child meals is:\t$" + childTotal);
    System.out.println("The total amount collected from all meals is:\t$" + (adultTotal + childTotal));
    System.out.println("\nThe profit collected from adult meals is:\t$" + adultProfit);
    System.out.println("The profit collected from child meals is:\t$" + childProfit);
    System.out.println("The total profit collected from all meals is:\t$" + totalProfit);
    System.out.println("=======================================================");

    in.close();
    }
}

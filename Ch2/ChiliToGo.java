import java.util.*;

public class ChiliToGo {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    final double ADULT_PRICE = 7.00;
    final double CHILD_PRICE = 4.00;
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

    System.out.println("=======================================================");
    System.out.println("The amount collected from adult meals is:\t$" + adultTotal);
    System.out.println("The amount collected from child meals is:\t$" + childTotal);
    System.out.println("The total amount collected from all meals is:\t$" + (adultTotal + childTotal));
    System.out.println("=======================================================");

    in.close();
    }
}
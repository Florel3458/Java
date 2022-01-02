import java.text.NumberFormat;
import java.util.Scanner;

public class CondoSales {
    public static void main(String[] args) {
        int viewVal;
        int parkVal;
        String viewMsg;
        String parkMsg;
        int viewPrice;
        int parkPrice = 5000;
        NumberFormat myFormat = NumberFormat.getInstance();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Summerdale Condo Sales office!");
        System.out.println("\nPlease choose a gorgeous view for your condo.");
        System.out.print("Type 1 for park view, 2 for golf course view, or 3 for lake view... ");
        viewVal = in.nextInt();
        if (viewVal > 0 && viewVal <= 3) {
            switch (viewVal) {
                case 1:
                    viewMsg = "park view";
                    viewPrice = 150000;
                    break;
                case 2:
                    viewMsg = "golf course view";
                    viewPrice = 170000;
                    break;
                case 3:
                    viewMsg = "lake view";
                    viewPrice = 210000;
                    break;
                default:
                    viewMsg = "This message should not appear";
                    viewPrice = 0;
            }
            System.out.println("\nWe also offer the choice of a garage for $5,000.");
            System.out.print("Type 1 for garage, or 2 for parking space... ");
            parkVal = in.nextInt();
            switch (parkVal) {
                case 1:
                    parkMsg = "garage";
                    parkPrice = 5000;
                    break;
                case 2:
                    parkMsg = "parking space";
                    parkPrice = 0;
                    break;
                default:
                    System.out.println("\n!!  The number entered is invalid... Assuming \"parking space\"  !!");
                    parkMsg = "parking space";
                    parkPrice = 0;
            }
            System.out.println("\nA condo with a " + viewMsg + " and a " + parkMsg + " will cost a total of $" + myFormat.format(viewPrice + parkPrice) + ".");
            System.out.println("We hope you enjoy your Summerdale condo.");
        } else {
            System.out.println("\n!!  The number entered is invalid... Please try again  !!");
        }
        in.close();
    }
}

import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final byte QUARTS_IN_GALLON = 4;
        Scanner in = new Scanner(System.in);

        System.out.print("How many quarts of paint are being used for this job?  >>  ");
        int quartsTotal = in.nextInt();

        int gallons = quartsTotal / QUARTS_IN_GALLON;
        int quarts = quartsTotal % QUARTS_IN_GALLON;

        String gallonPlural = "";
        String quartPlural = "";

        switch (gallons) {
        case 1:
            gallonPlural = " gallon";
            break;
        default:
            gallonPlural = " gallons";
        }
        switch (quarts) {
        case 1:
            quartPlural = " quart.";
            break;
        default:
            quartPlural = " quarts.";
        }

        System.out.println("\nA job that needs " + quartsTotal + " quarts will require\n" + gallons + gallonPlural + " and " + quarts + quartPlural);
        in.close();
    }
}
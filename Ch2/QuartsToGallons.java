public class QuartsToGallons {
    public static void main(String[] args) {
        final byte QUARTS_IN_GALLON = 4;
        int quartsTotal = 18;
        int gallons = quartsTotal / QUARTS_IN_GALLON;
        int quarts = quartsTotal % QUARTS_IN_GALLON;

        String gallonPlural = "";
        String quartPlural = "";

        switch (gallons) {  // 1 gallon, 0 gallons, many gallons 
        case 1:
            gallonPlural = " gallon";
            break;
        default:
            gallonPlural = " gallons";
        }
        switch (quarts) {   // 1 quart, 0 quarts, many quarts 
        case 1:
            quartPlural = " quart.";
            break;
        default:
            quartPlural = " quarts.";
        }

        System.out.println("A job that needs " + quartsTotal + " quarts will require\n" + gallons + gallonPlural + " and " + quarts + quartPlural);
    }
}
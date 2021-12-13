public class PickRandomCards {
    // a blank message to be added to by the doRandomCard method
    private static String message = "";

    public static void main(String[] args) {
        System.out.println("Your cards are:");
        System.out.println("---------------");

        // change "i < 2" to any number to pick that number of cards
        for (int i = 0; i < 2; i++) {
            doRandomCard();

            System.out.println(message);

            // reset the message back to blank
            message = "";
        }
    }

    public static void doRandomCard() {
        final int CARDS_IN_SUIT = 13;
        final int SUITS_IN_DECK = 4;
        Card aCard = new Card();
        String myValue;
        String mySuit;

        // math to pick a random value and suit in the deck
        aCard.setValue((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
        aCard.setSuit((int) (Math.random() * 100) % SUITS_IN_DECK + 1);

        // set the value to the proper type if it's a special card
        // if not, set to the value of the card in string form
        switch (aCard.getValue()) {
            case 1:
                myValue = "Ace";
                break;
            case 11:
                myValue = "Jack";
                break;
            case 12:
                myValue = "Queen";
                break;
            case 13:
                myValue = "King";
                break;
            default:
                myValue = String.valueOf(aCard.getValue());
        }

        switch (aCard.getSuit()) {
            case 1:
                mySuit = "Diamonds";
                break;
            case 2:
                mySuit = "Hearts";
                break;
            case 3:
                mySuit = "Clovers";
                break;
            default:
                mySuit = "Spades";
        }

        // "The Ace of Spades"
        message += "The " + myValue;
        message += " of " + mySuit;
    }
}
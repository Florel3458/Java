import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nounOne;
        String nounTwo;
        String adjective;
        String verbPast;

        System.out.println("----------------------------------------");
        System.out.print("Please give me a noun   >           \t"); 
        nounOne = in.nextLine();
        System.out.print("Please give me another noun   >     \t");
        nounTwo = in.nextLine();
        System.out.print("Please give me an adjective   >     \t");
        adjective = in.nextLine();
        System.out.print("Please give me a past-tense verb   >\t");
        verbPast = in.nextLine();
        System.out.println("----------------------------------------");

        System.out.println("=============================");
        System.out.println("Mary had a little " + nounOne);
        System.out.println("Its " + nounTwo + " was " + adjective + " as snow");
        System.out.println("And everywhere that Mary " + verbPast);
        System.out.println("The " + nounOne + " was sure to go");
        System.out.println("=============================");

        in.close();
    }
}

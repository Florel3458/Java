import java.util.Scanner;

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich testSandwich = new Sandwich();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Our special of the day is a sandwich with " + testSandwich.getMainIngredient() + " and\n" + 
        testSandwich.getBreadType() + " bread, which costs $" + testSandwich.getPrice() + ".\n");

        System.out.print("What would you like in your sandwich?   >> ");
        testSandwich.setMainIngredient(keyboard.nextLine());
        System.out.print("And what kind of bread would you like?  >> ");
        testSandwich.setBreadType(keyboard.nextLine());
        testSandwich.setPrice(3.14);

        System.out.println("\nA sandwich with " + testSandwich.getMainIngredient() + " and\n" + 
        testSandwich.getBreadType() + " bread will be $" + testSandwich.getPrice() + ".");

        keyboard.close();
    }
}

public class TestSandwich {
    public static void main(String[] args) {
        Sandwich testSandwich = new Sandwich();

        System.out.println("A sandwich with " + testSandwich.getMainIngredient() + " and\n" + 
        testSandwich.getbreadType() + " bread will cost $" + testSandwich.getPrice() + ".");

        testSandwich.setMainIngredient("salami");
        testSandwich.setBreadType("white");
        testSandwich.setPrice(3.14);

        System.out.println("\nBut a sandwich with " + testSandwich.getMainIngredient() + " and\n" + 
        testSandwich.getbreadType() + " bread will cost $" + testSandwich.getPrice() + ".");
    }
}

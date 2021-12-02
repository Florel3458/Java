public class Sandwich {
    private String mainIngredient = "tuna";
    private String breadType = "wheat";
    private double price = 4.99;

    public String getMainIngredient() {
        return mainIngredient;
    }
    public void setMainIngredient(String ing) {
        mainIngredient = ing;
    }

    public String getBreadType() {
        return breadType;
    }
    public void setBreadType(String brd) {
        breadType = brd;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double pr) {
        price = pr;
    }
}

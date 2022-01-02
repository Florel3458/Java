public class DivideEvenly {
    public static void main(String[] args) {
        final int LIMIT = 100;

        System.out.println(LIMIT + " is evenly divisible by:");
        for(int var = 1; var <= LIMIT; ++var) {
            if(LIMIT % var == 0) {
                System.out.print(var + " ");
                // list on new line looks nicer in my opinon
            }
        }
    }
}

import java.util.*;

public class IntegerDemoInteractiveWithName {
    public static void main(String[] args) {
        byte aByte;
        short aShort;
        int anInt;
        long aLong;
        String name;
        Scanner in = new Scanner(System.in);

        System.out.print("Please input a byte-sized integer >> ");
        aByte = in.nextByte();
        System.out.print("Please input a smallish integer   >> ");
        aShort = in.nextShort();
        System.out.print("Please input an integer           >> ");
        anInt = in.nextInt();
        System.out.print("Please input a very large integer >> ");
        aLong = in.nextLong();
        System.out.print("Please enter your name            >> ");
        in.nextLine();
        name = in.nextLine();

        System.out.println("The byte is    " +aByte);
        System.out.println("The short is   " +aShort);
        System.out.println("The integer is " +anInt);
        System.out.println("The long is    " +aLong);
        System.out.println("Thank you, " + name);

        in.close();
    }
}

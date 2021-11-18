import java.util.*;

public class FiveYearsAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        byte age;

        System.out.println("----------------------------------------------------------");
        System.out.print("Hello!   What is your name?  ");
        name = in.nextLine();
        System.out.print("\nHi, " + name + "!   How old are you?  ");
        age = in.nextByte();

        System.out.println("\nDid you know that in five years you will be " + (age + 5) + " years old?");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
        System.out.println("----------------------------------------------------------");

        in.close();
    }
}

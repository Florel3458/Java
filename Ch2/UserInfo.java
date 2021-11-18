import java.util.*;

public class UserInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstName;
        String lastName;
        byte grade;
        int studentID;
        String userName;
        float gpa;

        System.out.println("----------------------------------------------------------");
        System.out.println("Please enter the following information so I can [sell it]:\n");

        System.out.print("First name: ");
        firstName = in.nextLine();
        System.out.print("Last name: ");
        lastName = in.nextLine();
        System.out.print("Grade (9-12): ");
        grade = in.nextByte();
        System.out.print("Student ID: ");
        studentID = in.nextInt();
        System.out.print("Login: ");
        in.nextLine();
        userName = in.nextLine();
        System.out.print("GPA (0.0-4.0): ");
        gpa = in.nextFloat();

        System.out.println("\nYour information:");
        System.out.println("\tLogin: " + userName);
        System.out.println("\tID: " + studentID);
        System.out.println("\tName: " + lastName + ", " + firstName);
        System.out.println("\tGPA: " + gpa);
        System.out.println("\tGrade: " + grade);
        System.out.println("----------------------------------------------------------");

        in.close();
    }
}

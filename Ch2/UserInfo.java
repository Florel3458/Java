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

        System.out.println("First name: ");
        firstName = in.nextLine();
        System.out.println("Last name: ");
        lastName = in.nextLine();
        System.out.println("Grade (9-12): ");
        grade = in.nextByte();
        System.out.println("Student ID: ");
        studentID = in.nextInt();
        System.out.println("Login: ");
        in.nextLine();
        userName = in.nextLine();
        System.out.println("GPA (0.0-4.0): ");
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

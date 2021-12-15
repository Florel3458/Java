import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args) {
        Student myStudent = new Student();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please input the student's ID  >>  ");
        myStudent.setIdNum(keyboard.nextInt());
        System.out.print("Please input the number of credit hours the student earned  >>  ");
        myStudent.setCreditHours(keyboard.nextInt());
        System.out.print("Please input the student's letter grade  >>  ");
        myStudent.setGrade(keyboard.next().charAt(0));

        myStudent.computePointsEarned();
        myStudent.computeGpa();

        System.out.println("---------------------");
        System.out.println("Student ID:\t" + myStudent.getIdNum());
        System.out.println("Credit Hours:\t" + myStudent.getCreditHours());
        System.out.println("Current Grade:\t" + myStudent.getGrade());
        System.out.println("Points Earned:\t" + myStudent.getPointsEarned());
        System.out.println("Current GPA:\t" + myStudent.getGpa());
        System.out.println("---------------------");

        keyboard.close();
    }
}

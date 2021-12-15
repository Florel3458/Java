public class Student {
    private int idNum;
    private int creditHours;
    private int pointsEarned;
    private char grade;
    private double gpa;

    public int getIdNum() {
        return idNum;
    }
    public void setIdNum(int id) {
        idNum = id;
    }

    public int getCreditHours() {
        return creditHours;
    }
    public void setCreditHours(int hrs) {
        creditHours = hrs;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }
    public void setPointsEarned(int pnts) {
        pointsEarned = pnts;
    }
    public void computePointsEarned() {
        int pointCof;

        switch(grade) {
            case 'A':
                pointCof = 4;
                break;
            case 'B':
                pointCof = 3;
                break;
            case 'C':
                pointCof = 2;
                break;
            case 'D':
                pointCof = 1;
                break;
            case 'F':
                pointCof = 0;
                break;
            default:
                pointCof = -1;
                System.out.print(" !!  Invalid Grade. Please set a grade value for the student using A, B, C, D, or F.  !! ");
        }
        pointsEarned = (pointCof * creditHours);
    }

    public char getGrade() {
        return grade;
    }
    public void setGrade(char grd) {
        switch(grd) {
            case 'a':
            case 'A':
                grade = 'A';
                break;
            case 'b':
            case 'B':
                grade = 'B';
                break;
            case 'c':
            case 'C':
                grade = 'C';
                break;
            case 'd':
            case 'D':
                grade = 'D';
                break;
            case 'f':
            case 'F':
                grade = 'F';
                break;
            default:
                grade = 'i';
                System.out.print(" !!  Invalid Grade. Please input A, B, C, D, or F.  !! ");
        }
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void computeGpa() {
        gpa = (pointsEarned / creditHours);
    }
}

import java.util.*;

public class SearchStudent {
    private Stack<String> student;
    private Stack<Integer> studentID;
    private Stack<Double> grades;
    private Scanner scanner;

    public SearchStudent() {
    }

    public SearchStudent(Stack<String> student, Stack<Integer> studentID, Stack<Double> grades, Scanner scanner) {
        this.student = student;
        this.studentID = studentID;
        this.grades = grades;
        this.scanner = scanner;
    }

    public Stack<String> getStudent() {
        return student;
    }

    public void setStudent(Stack<String> student) {
        this.student = student;
    }

    public Stack<Integer> getStudentID() {
        return studentID;
    }

    public void setStudentID(Stack<Integer> studentID) {
        this.studentID = studentID;
    }

    public Stack<Double> getGrades() {
        return grades;
    }

    public void setGrades(Stack<Double> grades) {
        this.grades = grades;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void searchStudent() {
        boolean studentFound = false;
        while (!studentFound) {
            System.out.print("STUDENT ID: ");
            int studID = scanner.nextInt();

            System.out.println("Write -1 if you want to exit.");
            if (studID == -1) {
                System.out.println("Exiting search process.");
                break;
            }

            int indexStudentID = studentID.indexOf(studID);

            if (indexStudentID != -1) {
                String studName = student.get(indexStudentID);
                List<Double> studGrades = new ArrayList<>();
                double totalGrades = 0.0;
                for (int i = 0; i < 5; i++) {
                    double grade = grades.get(indexStudentID * 5 + i);
                    studGrades.add(grade);
                    totalGrades += grade;
                }
                double average = totalGrades / 5;

                System.out.println("Student Name: " + studName);
                System.out.println("Student ID: " + studID);
                System.out.println("Grades: " + studGrades);
                System.out.println("Average Grade: " + average);
                studentFound = true;
            } else {
                System.out.println("Student ID not found. Please try again.");
            }
        }
    }

}

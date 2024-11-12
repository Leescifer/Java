import java.util.*;

public class DeleteStudent {
    private Stack<String> student;
    private Stack<Integer> studentID;
    private Stack<Double> grades;
    private Scanner scanner;

    public DeleteStudent() {
    }

    public DeleteStudent(Stack<String> student, Stack<Integer> studentID, Stack<Double> grades, Scanner scanner) {
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

    public void deleteStudent() {
        boolean studentFound = false;
        while (!studentFound) {
            System.out.print("STUDENT ID: ");
            int studID = scanner.nextInt();

            System.out.println("Write -1 if you want to exit.");
            if (studID == -1) {
                System.out.println("Exiting deletion process.");
                break;
            }
            int indexStudentID = studentID.indexOf(studID);

            if (indexStudentID != -1) {
                student.remove(indexStudentID);
                studentID.remove(indexStudentID);
                for (int i = 0; i < 5; i++) {
                    grades.remove(indexStudentID * 5);
                }
                System.out.println("Student Has Been Successfully Deleted!");
                studentFound = true;
            } else {
                System.out.println("Student ID not found. Please try again.");
            }
        }
    }
}

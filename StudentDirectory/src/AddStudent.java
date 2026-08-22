import java.util.*;

public class AddStudent {
    private Stack<String> student;
    private Stack<Integer> studentID;
    private Stack<Double> grades;
    private Scanner scanner;

    public AddStudent() {
    }

    public AddStudent(Stack<String> student, Stack<Integer> studentID, Stack<Double> grades, Scanner scanner) {
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

    public void addStudent() {
        System.out.print("STUDENT FULLNAME: ");
        String studFullName = scanner.nextLine();
        System.out.print("STUDENT ID: ");
        int studID = scanner.nextInt();
        scanner.nextLine();

        String[] subjects = {"OOP", "IM", "NET 1", "PROG 1", "WEBDEV"};

        System.out.println("Enter grades for the following subjects:");

        List<Double> studentGrades = new ArrayList<>();
        double totalGrades = 0.0;
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + " : ");
            double grade = scanner.nextDouble();
            studentGrades.add(grade);
            totalGrades += grade;
        }

        scanner.nextLine();
        student.add(studFullName);
        studentID.add(studID);
        grades.addAll(studentGrades);

        double average = totalGrades / subjects.length;

        System.out.println("Student added successfully!");
        System.out.println("Total Average: " + average);
    }

}

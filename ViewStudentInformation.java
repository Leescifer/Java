import java.util.*;

public class ViewStudentInformation {
    private Stack<String> student;
    private Stack<Integer> studentID;
    private Stack<Double> grades;

    public ViewStudentInformation() {
    }

    public ViewStudentInformation(Stack<String> student, Stack<Integer> studentID, Stack<Double> grades) {
        this.student = student;
        this.studentID = studentID;
        this.grades = grades;
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

    public void viewStudentInformation() {
        if (student.isEmpty()) {
            System.out.println("No student information available.");
            return;
        }

        for (int i = 0; i < student.size(); i++) {
            System.out.println("Student Full Name: " + student.get(i));
            System.out.println("Student ID: " + studentID.get(i));
            System.out.print("Grades: ");

            double totalGrades = 0.0;
            for (int j = 0; j < 5; j++) {
                double grade = grades.get(i * 5 + j);
                System.out.print(grade + " ");
                totalGrades += grade;
            }

            double average = totalGrades / 5;
            if (average >= 74) {
                System.out.println("Failed!");
              }
            System.out.println("\nAverage Grade: " + average);
            System.out.println("----------------------");
        }
    }

}
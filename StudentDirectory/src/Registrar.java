import java.util.*;

public class Registrar {
    private Stack<String> student;
    private Stack<Integer> studID;
    private Stack<Double> grades;
    private Scanner scanner;
    private AddStudent addStudent;
    private DeleteStudent deleteStudent;
    private UpdateStudent updateStudent;
    private SearchStudent searchStudent;
    private ViewStudentInformation view;

    public Registrar() {
        student = new Stack<>();
        studID = new Stack<>();
        grades = new Stack<>();
        scanner = new Scanner(System.in);
        addStudent = new AddStudent(student, studID, grades, scanner);
        deleteStudent = new DeleteStudent(student, studID, grades, scanner);
        updateStudent = new UpdateStudent(student, studID, grades, scanner);
        searchStudent = new SearchStudent(student, studID, grades, scanner);
        view = new ViewStudentInformation(student, studID, grades);
    }

    public void AddStudent() {
        addStudent.addStudent();
    }

    public void deleteStudent() {
        deleteStudent.deleteStudent();
    }

    public void updateStudent() {
        updateStudent.updateStudent();
    }

    public void searchStudent() {
        searchStudent.searchStudent();
    }

    public void view() {
        view.viewStudentInformation();
    }

}

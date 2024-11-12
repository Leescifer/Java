import java.util.*;

public class UpdateStudent extends AddStudent {

    private Stack<String> student;
    private Stack<Integer> studentID;
    private Stack<Double> grades;
    private Scanner scanner;

    public UpdateStudent(Stack<String> student,
            Stack<Integer> studentID,
            Stack<Double> grades, Scanner scanner) {
        super(student, studentID, grades, scanner);
    }

    public void updateStudent() {
        while (true) {
            System.out.print("STUDENT ID: ");
            int studID = scanner.nextInt();

            if (studID == -1) {
                System.out.println("Exiting updating process.");
                break;
            }
            int indexStudentID = studentID.indexOf(studID);

            if (indexStudentID != -1) {
                scanner.nextLine();

                System.out.println("What do you want to update?");
                System.out.println("1. Student Full Name\n2. Student ID\n3. Grades\n4. Exit");
                System.out.print("Choose an option (1-4): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        scanner.nextLine();
                        System.out.print("New Student Full Name: ");
                        student.set(indexStudentID, scanner.nextLine());
                        System.out.println("Student name has been successfully updated!");
                        break;
                    case 2:
                        System.out.print("New Student ID: ");
                        studentID.set(indexStudentID, scanner.nextInt());
                        System.out.println("Student ID has been successfully updated!");
                        break;
                    case 3:
                        System.out.println("Enter 5 New Grades: ");
                        for (int i = 0; i < 5; i++) {
                            System.out.print("Grade " + (i + 1) + ": ");
                            grades.set(indexStudentID * 5 + i, scanner.nextDouble());
                        }
                        System.out.println("Grades have been successfully updated!");
                        break;
                    case 4:
                        System.out.println("Exiting updating process.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Student ID not found. Please try again.");
            }
        }
    }

}
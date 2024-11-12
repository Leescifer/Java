import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Registrar registrar = new Registrar();
        System.out.println("Welcome to Hogwarts University");

        do {

            System.out.println("""
                     _____________
                    [1.ADD STUDENT]
                      ________________
                     [2.DELETE STUDENT]
                      ________________
                     [3.UPDATE STUDENT]
                      ________________
                     [4.SEARCH STUDENT]
                      ______________
                     [5.VIEW STUDENT]
                      ______
                     [6.EXIT]

                     """);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registrar.AddStudent();
                    break;
                case 2:
                    registrar.deleteStudent();
                    break;

                case 3:
                    registrar.updateStudent();
                    break;

                case 4:
                    registrar.searchStudent();
                    break;

                case 5:
                    registrar.view();
                    break;

                case 6:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice Please Select Again.");
                    break;
            }

        } while (choice != 6);

        scanner.close();
    }
}
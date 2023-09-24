import java.util.List;
import java.util.Scanner;

/**
 * @author rajimalimiya
 * @created 12/09/2023 - 06:57
 * @project StudentProject
 **/
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        // create list of students
        List<Student> studentList = student.createListOfStudents();

        System.out.println("Please, enter valid option.");

        System.out.println("1. To list all students.");
        System.out.println("2. Search by Name.");
        System.out.println("3. Search by Contact.");
        System.out.println("4. Search by Roll Number.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                student.displayAll(studentList);
                break;
            case 2:
                // search by name
                System.out.println("Enter search name:");
                String searchName = scanner.next();
                student.searchByName(studentList, searchName);
                break;
            case 3:
                //search by contact
                System.out.println("Enter search contact:");
                String searchContact = scanner.next();
                student.searchByContact(studentList, searchContact);
                break;
            case 4:
                // search by roll
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }





    }
}

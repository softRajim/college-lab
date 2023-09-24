import java.util.ArrayList;
import java.util.List;

/**
 * @author rajimalimiya
 * @created 12/09/2023 - 06:57
 * @project StudentProject
 **/
public class Student {
    private String name;
    private int rollNumber;
    private String contact;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Student> createListOfStudents() {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student();
        student1.setName("AAA");
        student1.setRollNumber(1);
        student1.setContact("9800000001");
        studentList.add(student1);

        Student student2 = new Student();
        student2.setName("BBB");
        student2.setRollNumber(2);
        student2.setContact("9800000002");
        studentList.add(student2);

        Student student3 = new Student();
        student3.setName("CCC");
        student3.setRollNumber(3);
        student3.setContact("9800000003");
        studentList.add(student3);

        return studentList;
    }

    public void displayAll(List<Student> studentList) {
        System.out.println("Name\tRoll Number \t Contact");
        System.out.println("_____________________________________");

        for(Student student: studentList) {
            System.out.println(student.getName()+"\t"+
                    student.getRollNumber()+"\t"+
                    student.getContact());
        }
        System.out.println("_____________________________________");
    }

    public void searchByName(List<Student> studentList,
                             String searchName) {
        for(Student student: studentList) {
            if(student.getName().equalsIgnoreCase(searchName)) {
                displayStudent(student);
            }
        }
    }

    private void displayStudent(Student student) {
        System.out.println("Name\tRoll Number \t Contact");
        System.out.println("_____________________________________");
        System.out.println(student.getName()+"\t"+
                student.getRollNumber()+"\t"+
                student.getContact());
        System.out.println("_____________________________________");
    }


    public void searchByContact(List<Student> studentList, String searchContact) {
        for(Student student: studentList) {
            if(student.getContact().equalsIgnoreCase(searchContact)) {
                displayStudent(student);
            }
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

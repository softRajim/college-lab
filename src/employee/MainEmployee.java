package employee;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajimalimiya
 * @created 19/09/2023 - 08:02
 * @project StudentProject
 **/
public class MainEmployee {
    public static void main(String[] args) {

        List<Employee> employeeList  = new ArrayList<>();

        SalaryEmployee salaryEmployee = new SalaryEmployee();
        employeeList.add(salaryEmployee.getSalaryEmployee());

        System.out.println("1. Show all employee");
        System.out.println("2. Search by Name");

    }
}

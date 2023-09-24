package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author rajimalimiya
 * @created 13/09/2023 - 07:54
 * @project StudentProject
 **/
public class Main {
    // declareing the type of exception
    public static void findFile() throws IOException, ArithmeticException, SQLException {

        // code that may generate IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);


        int a = 1/0;

    }

    public static void main(String[] args) {
        try {
            findFile();

//            Test test = new Test();
//            test.method3();

            Test.testMethod1();

            String test = Test.TEST;

        }
        catch (IOException | ArithmeticException | SQLException e) {
            System.out.println(e);
        }
    }
}

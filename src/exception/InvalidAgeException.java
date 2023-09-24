package exception;

/**
 * @author rajimalimiya
 * @created 13/09/2023 - 08:20
 * @project StudentProject
 **/
public class InvalidAgeException  extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}


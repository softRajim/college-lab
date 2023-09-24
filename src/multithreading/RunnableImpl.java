package multithreading;

/**
 * @author rajimalimiya
 * @created 22/09/2023 - 07:49
 * @project StudentProject
 **/
public class RunnableImpl extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Inside thread class. START");
            Thread.sleep(5000);
            System.out.println("Inside thread class. END");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

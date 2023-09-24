package multithreading;

/**
 * @author rajimalimiya
 * @created 17/09/2023 - 21:35
 * @project StudentProject
 **/
// This class schedules a message to be printed after a specified delay
public class MessageScheduler implements Runnable {
    private final String message; // The message to be printed
    private final long delay; // The delay in milliseconds before the message is printed

    // Constructor for the MessageScheduler class
    public MessageScheduler(final String message, final long delay) {
        this.message = message;
        this.delay = delay;
    }

    // The run method is called when the thread is started
    @Override
    public void run() {
        try {
            // Sleep for the specified delay
            System.out.println(delay);
            Thread.sleep(delay);
            // Print the message after the delay has elapsed
            System.out.println(message);
        } catch (InterruptedException e) {
            // If the thread is interrupted, print the stack trace
            e.printStackTrace();
        }
    }
}



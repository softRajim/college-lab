package multithreading;

/**
 * @author rajimalimiya
 * @created 17/09/2023 - 21:35
 * @project StudentProject
 **/
public class Main {

    public static void main(String[] args) {
        final long minDelayInSeconds = 1; // The minimum delay in seconds
        final long maxDelayInSeconds = 3; // The maximum delay in seconds

        // Loop through 5 times to create and start 5 threads
        for (int i = 0; i < 5; i ++) {
            // Generate a random delay between minDelayInSeconds and maxDelayInSeconds
            final long delay = (long) (
                    Math.random() * (maxDelayInSeconds - minDelayInSeconds + 1)
                            + minDelayInSeconds
            ) * 1000;

            // Create a message for the thread
            final String message = "Execute Thread " + i;

            // Create a new thread using the MessageScheduler class and start it
            Thread thread = new Thread(new MessageScheduler(message, delay));
            thread.start();
        }
    }
}



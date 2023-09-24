package multithreading.extend;

/**
 * @author rajimalimiya
 * @created 17/09/2023 - 21:41
 * @project StudentProject
 **/

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {


    @Override
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

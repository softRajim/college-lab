package multithreading.extend;


/**
 * @author rajimalimiya
 * @created 17/09/2023 - 21:42
 * @project StudentProject
 **/
// Main Class
public class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultithreadingDemo object
                    = new MultithreadingDemo();

            object.start();
        }
    }
}

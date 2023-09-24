package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author rajimalimiya
 * @created 22/09/2023 - 07:49
 * @project StudentProject
 **/
public class ThreadUsingRunnable {
    public static void main(String[] args) {

        Thread thread = new Thread(new RunnableImpl());

        thread.start();

        System.out.println("After thread start ...");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        long count = integerList.parallelStream()
                .mapToInt(Integer:: intValue)
                .sum();

        Optional<Integer> first = integerList.parallelStream()
                .filter(e -> e == 2)
                .findFirst();


        System.out.println("Count::"+count);


    }
}

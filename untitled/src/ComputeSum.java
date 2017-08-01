import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by saxenaaa on 8/1/2017.
 */
public class ComputeSum implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 500; i++) sum += i;
        System.out.println(sum);
    }


    @Test
    public void testThread() {
        ComputeSum computeSum = new ComputeSum();
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i <12; i++) {
            executor.execute(computeSum);

        }
    }
}

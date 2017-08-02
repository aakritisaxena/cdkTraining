import java.util.concurrent.Callable;

/**
 * Created by saxenaaa on 8/2/2017.
 */
public class PrimeNumbersSum101to200 implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 100; i < 200; i++) {
            int k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

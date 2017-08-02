import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;

/**
 * Created by saxenaaa on 8/2/2017.
 */
public class PrimeNumberSum400to500 implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 400; i < 500; i++) {
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

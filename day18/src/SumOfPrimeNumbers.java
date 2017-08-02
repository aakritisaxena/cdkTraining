import java.util.concurrent.*;

/**
 * Created by saxenaaa on 8/2/2017.
 */
public class SumOfPrimeNumbers  {

    LinkedBlockingQueue queue = new LinkedBlockingQueue();



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor =  Executors.newFixedThreadPool(10);
        Future<Integer> future1 = executor.submit(new PrimeNumbersSum1to100() );
        Future<Integer> future2 = executor.submit(new PrimeNumbersSum1to100() );
        Future<Integer> future3 = executor.submit(new PrimeNumbersSum1to100() );
        Future<Integer> future4 = executor.submit(new PrimeNumbersSum1to100() );
        Future<Integer> future5 = executor.submit(new PrimeNumbersSum1to100() );


        System.out.printf("Result : %d%n",(future1.get()+future2.get()+future3.get()+future4.get()+future5.get()));

    }
}
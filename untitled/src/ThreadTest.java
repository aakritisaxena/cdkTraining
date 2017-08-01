import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by saxenaaa on 7/31/2017.
 */
public class ThreadTest implements Runnable {

    int i = 10;
    Thread thread1 = null;
    Thread thread2 = null;
//    public static void main(String[] args) throws Exception {
//        new ThreadTest();
//        System.out.println("End");
//
//    }

    @Test

    public void Threadtest() {

        new ThreadTest();
        System.out.println("End!!!");

    }

    public ThreadTest() {
         thread1 = new Thread(this);
         thread2 = new Thread(this);
        thread1.start();
        thread2.start();

    }


    @Override
    public void run() {


        if (Thread.currentThread() == thread1) {

            i++;

        }

        if (Thread.currentThread() == thread2) {

            System.out.println(i);

        }
    }
}





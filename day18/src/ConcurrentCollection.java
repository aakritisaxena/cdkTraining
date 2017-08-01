import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by saxenaaa on 8/1/2017.
 */
public class ConcurrentCollection {
//
//    Thread thread1 = null;
//    Thread thread2 = null;
    LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
    public static void main(String[] args) {
        new ConcurrentCollection();
        System.out.println("Finish");
    }
    public ConcurrentCollection(){
        new Thread(()->{linkedBlockingQueue.offer(Math.random());}).start();
        new Thread(()->{
            try {
                System.out.println(linkedBlockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

//        thread1 = new Thread(this );
//        thread2 = new Thread(this );
//        thread1.start();
//        thread2.start();
//    }
//
//
//    @Override
//    public void run() {
//        if (Thread.currentThread() == thread1) {
//            linkedBlockingQueue.offer(Math.random());
//
//        }
//
//        if (Thread.currentThread() == thread2) {
//            try {
//                System.out.println(linkedBlockingQueue.take());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//
//        }
//    }
}

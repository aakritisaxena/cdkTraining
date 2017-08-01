package read2Files;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by saxenaaa on 7/31/2017.
 */
public class ReadFiles implements Runnable{
    Thread thread1 = null;
    Thread thread2 = null;
    @Test
    public void readFiles(){
     new ReadFiles();
        System.out.println("End!!!");
    }
    public ReadFiles() {
        thread1= new Thread(this);
        thread2= new Thread(this);
        thread1.start();
        thread2.start();

    }

    @Override
    public void run() {
        if(Thread.currentThread() == thread1){
            InputStream fis = null;
            try {
                fis = new FileInputStream("C:/Users/saxenaaa/IdeaProjects/cdkTraining/Day14/src/MovieDetails.txt");
                int b = fis.read();
                while(b != -1){
                    System.out.print((char) b);
                    b = fis.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }

                } catch (FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
        if(Thread.currentThread() == thread2){
            InputStream fis = null;
            try {
                fis = new FileInputStream("C:\\javaCode\\set.txt");
                int b = fis.read();
                while(b != -1){
                    System.out.print((char) b);
                    b = fis.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }


}

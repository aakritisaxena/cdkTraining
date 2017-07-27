import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by saxenaaa on 7/27/2017.
 */
public class MovieDetails {
    public static void main(String[] args) {
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

        } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

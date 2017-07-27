import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by saxenaaa on 7/27/2017.
 */
public class CarWriter {
    public static void main(String[] args) {

        BufferedWriter bw = null;
        FileWriter fw = null;
        Set<String> set = new HashSet<>();

        set.add("Audi");
        set.add("Maruti");
        set.add("Tata");
        set.add("Honda");
        set.add("Volkswagen");

        try {


            fw = new FileWriter("C:/Users/saxenaaa/IdeaProjects/cdkTraining/Day14/src/MovieDetails.txt" );
            bw = new BufferedWriter(fw);


            Iterator<String> itr = set.iterator();

            while (itr.hasNext()) {
                String val = itr.next();
                bw.write(val + " " );

            }
        }catch(IOException e){

                e.printStackTrace();

        } finally{

                try {

                    if (bw != null)
                        bw.close();

                    if (fw != null)
                        fw.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }
    }
}




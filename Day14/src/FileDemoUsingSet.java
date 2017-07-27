import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by saxenaaa on 7/27/2017.
 */
public class FileDemoUsingSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Audi");
        set.add("Maruti");
        set.add("Tata");
        set.add("Honda");
        set.add("Volkswagen");

        Iterator<String> itr  = set.iterator();

        while(itr.hasNext()){
            String val = itr.next();
            System.out.println(val);
        }



    }
}

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;

/**
 * Created by saxenaaa on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Ramesh", "M");
        Person p3 = new Person("Suresh", "M");
        Person p4 = null;

        //System.out.println(p1.equals(p2));
        //System.out.println(p1.equals(p3));
        //System.out.println(p1.equals(p4));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());


    }
}



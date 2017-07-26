package car;

import java.util.Comparator;

/**
 * Created by saxenaaa on 7/25/2017.
 */
public class CarIdComparator implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getId() == o2.getId()){
            return 0;
        } else if(o1.getId() > o2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}

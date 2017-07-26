package car;

import java.util.*;

/**
 * Created by saxenaaa on 7/25/2017.
 */
public class CarImplementation {
    public static void main(String[] args) {

        CarIdComparator carIdComparator = new CarIdComparator();
        BrandComparator brandComparator = new BrandComparator();
                Set<Car> car = new TreeSet<>();


        car.add(new Car(200000,1127,"BMW"));
        car.add(new Car(300000,1128,"Maruti"));
        car.add(new Car(400000,1129,"Audi"));
        car.add(new Car(500000,1130,"Chevrolet"));
        car.add(new Car(600000,1227,"Volkswagen"));
        car.add(new Car(700000,1327,"Tata"));
        car.add(new Car(800000,1527,"Honda"));
        car.add(new Car(900000,1727,"Mahindra"));
        car.add(new Car(110000,1177,"Maruti"));
        car.add(new Car(210000,1927,"Audi"));
        car.add(new Car(220000,1027,"BMW"));
        car.add(new Car(230000,1827,"Tata"));
        car.add(new Car(240000,1627,"Honda"));
        car.add(new Car(250000,1187,"Chevrolet"));
        car.add(new Car(260000,2198,"BMW"));
        car.add(new Car(100000,2127,"BMW"));
        car.add(new Car(120000,2128,"Maruti"));
        car.add(new Car(130000,2129,"Audi"));
        car.add(new Car(140000,2130,"Chevrolet"));
        car.add(new Car(150000,2227,"Volkswagen"));
        car.add(new Car(160000,2327,"Tata"));
        car.add(new Car(170000,2527,"Honda"));
        car.add(new Car(180000,2727,"Mahindra"));
        car.add(new Car(190000,2177,"Maruti"));
        car.add(new Car(200000,2927,"Audi"));
        car.add(new Car(310000,2027,"BMW"));
        car.add(new Car(210000,2827,"Tata"));
        car.add(new Car(320000,2627,"Honda"));
        car.add(new Car(330000,2187,"Chevrolet"));
        car.add(new Car(340000,2198,"BMW"));

        Iterator<Car> itr  = car.iterator();

        while(itr.hasNext()){
            Car car1 = itr.next();
            System.out.println(car1.toString());
        }
        System.out.println("-------------------------");

        List<Car> list= new ArrayList<>(car);

        Collections.sort(list, carIdComparator);
        Iterator<Car> itr1  = list.iterator();

        while(itr1.hasNext()){
            Car car1 = itr1.next();
            System.out.println(car1.toString());
        }
        System.out.println("-------------------------");

        Collections.sort(list,brandComparator);
        Iterator<Car> itr2  = list.iterator();

        while(itr2.hasNext()){
            Car car1 = itr2.next();
            System.out.println(car1.toString());
        }



    }
}

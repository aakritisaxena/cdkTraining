

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saxenaaa on 7/25/2017.
 */
public class EmployeeImplementation {
    public static void main(String[] args) {
        List<Employee> list= new ArrayList<>(10);
        list.add(new Employee("Aakriti",38000.00));
        list.add(new Employee("Priyal",58000.00));
        list.add(new Employee("Priya",28000.00));
        list.add(new Employee("Ritu",18000.00));
        list.add(new Employee("Aditya",38000.00));
        list.add(new Employee("Oswald",58000.00));
        list.add(new Employee("Vinayak",28000.00));
        list.add(new Employee("Pintu",18000.00));
        list.add(new Employee("Aishwarya",28000.00));
        list.add(new Employee("palak",18000.00));

        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext()){
            double hra = itr.next().getSalary();
            System.out.println(hra);
        }
    }


}

package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saxenaaa on 7/25/2017.
 */
public class EmployeeImplementation {

    public static void main(String[] args) {
//        List<Employee> list = new ArrayList<>(10);
//        list.add(new Employee("Aakriti", 38000.00));
//        list.add(new Employee("Priyal", 58000.00));
//        list.add(new Employee("Priya", 28000.00));
//        list.add(new Employee("Ritu", 16000.00));
//        list.add(new Employee("Aditya", 38000.00));
//        list.add(new Employee("Oswald", 58000.00));
//        list.add(new Employee("Vinayak", 20000.00));
//        list.add(new Employee("Pintu", 15000.00));
//        list.add(new Employee("Aishwarya", 29000.00));
//        list.add(new Employee("palak", 17000.00));

        List<Employee> list = Arrays.asList(new Employee("Aakriti", 38000.00),
                new Employee("Priyal", 58000.00),
                new Employee("Priya", 8000.00),
                new Employee("Priy", 18000.00),
                new Employee("Aadi", 28000.00),
                new Employee("Winni", 15000.00),
                new Employee("Stuti", 17000.00),
                new Employee("Priyam", 14000.00),
                new Employee("Priyansh", 13000.00),
                new Employee("Abhishek", 19500.00),
                new Employee("Akhilesh", 19700.00)
                );

        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext()){
            Employee next = itr.next();
            if(next.getSalary() < 20000){
                double sal = next.getSalary()*1.2 ;
                System.out.println(sal);
                next.setSalary(sal);
            }
            else {
                System.out.println(next.getSalary());
            }
        }


    }
}

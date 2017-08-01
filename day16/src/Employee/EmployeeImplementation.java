package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by saxenaaa on 7/29/2017.
 */
public class EmployeeImplementation {

    public static void main(String[] args) {



        List<Employee> list= new ArrayList<>(50);

        list.add(new Employee("Aakriti",38000.00));
        list.add(new Employee("Priyal",58000.00));
        list.add(new Employee("Priya",28000.00));
        list.add(new Employee("Ritu",18000.00));
        list.add(new Employee("Aditya",38000.00));
        list.add(new Employee("Oswald",58000.00));
        list.add(new Employee("Vinayak",28000.00));
        list.add(new Employee("Pintu",68000.00));
        list.add(new Employee("Aishwarya",28000.00));
        list.add(new Employee("palak",78000.00));
        list.add(new Employee("Vishesh",38000.00));
        list.add(new Employee("Payal",58000.00));
        list.add(new Employee("Priyanka",28000.00));
        list.add(new Employee("Rituj",18000.00));
        list.add(new Employee("Aditi",38000.00));
        list.add(new Employee("Sid",58000.00));
        list.add(new Employee("Vini",28000.00));
        list.add(new Employee("Henry",98000.00));
        list.add(new Employee("pamal",28000.00));
        list.add(new Employee("pakou",68000.00));


        richEmployee(list);
        averageSalary(list);
        totaltSalary(list);
        totalEmployees(list);
        maxSalary(list);
        minSalary(list);
    }

    private static void minSalary(List<Employee> list) {
        Optional<Employee> min = list.stream().min((Employee emp1, Employee emp2)-> (int)emp1.salary-(int)emp2.salary );
        System.out.println(min.get());
    }

    private static void maxSalary(List<Employee> list) {
        Optional<Employee> max = list.stream().max((Employee emp1, Employee emp2)-> (int)emp1.salary-(int)emp2.salary );
        System.out.println(max.get());
    }



    private static void totalEmployees(List<Employee> list) {
        long result = list.stream().count();
        System.out.println(result);
    }

    private static void totaltSalary(List<Employee> list) {

        double result = list.stream()
                                    .collect(Collectors.summingDouble((Employee emp) -> emp.salary));
        System.out.println(result);
    }

    private static void averageSalary(List<Employee> list) {

        double average = list.stream()
                .collect(Collectors.averagingDouble((Employee emp) -> emp.salary));
        System.out.println(average);
    }

    private static void richEmployee(List<Employee> list) {

        list.stream()
                .filter((Employee emp)-> {return emp.salary > 50000;})
                .map((Employee emp)->emp.salary*0.1)
                .forEach((val)-> System.out.println("Value : "+val));
    }


}

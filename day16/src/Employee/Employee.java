package Employee;

/**
 * Created by saxenaaa on 7/29/2017.
 */
public class Employee {


         String name;
         double salary;



    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

package employeeManagment;

import java.io.Serializable;

/**
 * Created by saxenaaa on 7/27/2017.
 */
public class Employee implements Comparable<Employee>, Serializable{

    private int eId;
    private String name;
    private  transient double salary;


    public Employee(int eId, String employeeName, double salary) {
        this.eId = eId;
        this.name = employeeName;
        this.salary = salary;

    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }



    @Override
    public int compareTo(Employee o) {
        if(this.geteId() == o.geteId()) {
            return 0;
        } else if (this.geteId() > o.geteId()) {
            return 1;
        } else {
            return -1;
        }
    }
}

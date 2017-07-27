package employeeManagment;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.List;

/**
 * Created by saxenaaa on 7/27/2017.
 */
public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>(30);
        list.add(new Employee(100,"Aakriti",41000));
        list.add(new Employee(101,"Ritu",91000));
        list.add(new Employee(102,"Priyal",51000));
        list.add(new Employee(103,"Priya",21000));
        list.add(new Employee(104,"Aaditya",11000));
        list.add(new Employee(105,"Siddharth",10000));
        list.add(new Employee(106,"Bhoomi",23000));
        list.add(new Employee(107,"Harshala",90000));
        list.add(new Employee(108,"Harshita",34000));
        list.add(new Employee(109,"Deepali",40000));
        list.add(new Employee(110,"Sushant",41000));
        list.add(new Employee(111,"Sneh",91000));
        list.add(new Employee(112,"Mahesh",51000));
        list.add(new Employee(113,"Priya",21000));
        list.add(new Employee(114,"Sameer",11000));
        list.add(new Employee(115,"Nitesh",10000));
        list.add(new Employee(116,"Ishaan",23000));
        list.add(new Employee(117,"Arshi",90000));
        list.add(new Employee(118,"Snigdha",34000));
        list.add(new Employee(119,"Binay",40000));



        List<Employee> richEmployee = new ArrayList<>(20);
        for(Employee emp : list)  {
            if(emp.getSalary() >= 40000) {
                richEmployee.add(emp);
            }
        }

        Collections.sort(richEmployee);

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try{
            fos = new FileOutputStream("C:\\Users\\saxenaaa\\IdeaProjects\\cdkTraining\\Day14\\src\\EmployeeDetails.txt");
             oos = new ObjectOutputStream(fos);
             for(Employee emp :  richEmployee) {
                 oos.writeObject(emp);
             }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

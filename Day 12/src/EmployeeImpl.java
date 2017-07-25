import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by saxenaaa on 7/25/2017.
 */
public class EmployeeImpl {
    public static void main(String[] args) {
        EmployeeService employee = new EmployeeService(121,"Aakriti",150000,"9425667654","Tech member" );

        HR_Department.changeDesignation(employee);

    }
}

public class FinanceDepartment {

    public static double calculateTDS(EmployeeService e){
        if(e.getSalary()>10000){
            double tds =  e.getSalary()*0.1;
            return tds;
        } else {
            double tds = e.getSalary()*0.2;
            return tds;
        }
    }

    public  static double updateSalary(EmployeeService e) {
        double sal = e.getSalary()*0.1;
        return sal;
    }
}
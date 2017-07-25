public class HR_Department {
    public HR_Department() {
    }

    public static boolean changeDesignation(EmployeeService e) {
        if(e.getDesig().compareToIgnoreCase("Manager") == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean changeProject(EmployeeService e) {
        if (e.getDesig().compareToIgnoreCase("Manager") == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean eligibleForPromotion(EmployeeService e) {
        if(e.getDesig().compareToIgnoreCase("Manager") == 0) {
            return true;
        } else {
            return false;
        }
    }
}
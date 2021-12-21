package lesson30A;

import lesson30A.ENUM.DepartmentType;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Firm firm=new Firm(DepartmentDAO.getDepartmentSet(),CustomerDAO.getCustomerSet());
        Controller controller=new Controller(firm);
        System.out.println(controller.employeesByDepartmentWithoutProject(DepartmentType.DEVELOPER));
        //System.out.println(controller.projectsByCustomer(new Customer("OOO", "Громнафта", "Ukraine")));


    }
}

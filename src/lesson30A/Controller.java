package lesson30A;

import java.util.*;
import lesson30A.ENUM.DepartmentType;

public class Controller {
    private static Firm firm;

    public Controller(Firm firm) {
        this.firm = firm;
    }

//cписок сотрудников из заданного отдела, не участвующих ни в одном проекте
    public static  Collection<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType){
       Collection<Department> set =firm.getDepartaments();

       Collection<Department> sar=new HashSet<>();
       for(Department el:set){
           if(el.getType().equals(departmentType)){
               sar.add(el);
           }
       }
        Collection<Employee> sars=new HashSet<>();
       for(Department el:sar){
               sars.add((Employee) el.getEmployees());
           }

            return null;
    }


//список проектов, выполняемых для заданного заказчика
    public Collection<Project> projectsByCustomer(Customer customer){
            Collection<Project> projects= ProjectDAO.getProjectSet();
            Collection<Project> projectRes= new HashSet<>();
            for(Project el:projects){
                if(el.getCustomer().equals(customer)){
                    projectRes.add(el);
                }
            }
        return projectRes;
    }


//список подчиненных для заданного руководителя(по всем проектам, которыми он руководит)
//    public employeesByTeamLead(Employee lead){
//
//        return null;}

//список руководителей для заданного сотрудника (по всем проектам, в которых он участвует)
//    public teamLeadsByEmployee(Employee employee){
//
//        return null;}

////список проектов, в которых участвует заданный сотрудник
//    public static Employee projectsByEmployee(Employee employee){
//
//        return null;}

////список сотрудников, участвующих в тех же проектах, что и заданный сотрудник
//    public employeesByProjectEmployee(Employee employee){
//
//        return null;}

////список сотрудников, участвующих в проектах,выполняемых для заданного заказчика
//    public employeesByCustomerProjects(Customer customer){
//
//        return null;}

////список сотрудников, не участвующих ни в одном проекте
//    public employeesWithoutProject(){
//
//        return null;}
}

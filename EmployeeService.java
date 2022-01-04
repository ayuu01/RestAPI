package com.example.Employee;


import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeService {
    private static List<EmployeeEntity> employeeList=new ArrayList<>();
    static {
        employeeList.add(new EmployeeEntity(101,"Anu Gautam",10000));
        employeeList.add(new EmployeeEntity(102,"Ray Garg",200000));
        employeeList.add(new EmployeeEntity(103,"Aman Singh",30000));
        employeeList.add(new EmployeeEntity(104,"Radha Agrawal",40000));
    }

    public List<EmployeeEntity> getAllEmployee() {

        return employeeList;
    }


    public EmployeeEntity getEmployeeById(int id) {


        EmployeeEntity employee= employeeList.stream().filter(e->e.getEmployeeId()==id).findFirst().get();
        return employee;

    }

    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity ) {
        employeeList.add(employeeEntity);
        return employeeEntity;
    }

    public void deleteEmployeeById(int id) {
        employeeList=employeeList.stream().filter(e->{
            if(e.getEmployeeId()!=id){
                return true;
            }else{
                return false;
            }
        }).collect(Collectors.toList());
    }
}


/*import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.example.Employee.EmployeeEntity;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService{
    List<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();

    EmployeeEntity employee1 = new EmployeeEntity(1001, "Raman", 10000);
    EmployeeEntity employee2 = new EmployeeEntity(1002, "Rohit", 20000);
    EmployeeEntity employee3 = new EmployeeEntity(1003, "Manoj", 12000);
    EmployeeEntity employee4 = new EmployeeEntity(1004, "Amit", 12000);
    EmployeeEntity employee5 = new EmployeeEntity(1005, "Kabit", 11500);
    EmployeeEntity employee6 = new EmployeeEntity(1006, "Laxman", 11500);
    EmployeeEntity employee7 = new EmployeeEntity(1007, "Dipesh", 10000);
    EmployeeEntity employee8 = new EmployeeEntity(1008, "Amit", 10000);
    EmployeeEntity employee9 = new EmployeeEntity(1009, "Manoj", 17500);


    employeeList.add(employee1);
    employeeList.add(employee2);
    employeeList.add(employee3);
    employeeList.add(employee4);
    employeeList.add(employee5);
    employeeList.add(employee6);
    employeeList.add(employee7);
    employeeList.add(employee8);
    employeeList.add(employee9);


    public List<EmployeeEntity> getAllEmployee() {

        return employeeList;
    }


    public EmployeeEntity getEmployeeById(int id) {


        EmployeeEntity emp=null;
        emp=employeeList.stream().filter(EmployeeEntity-> EmployeeEntity.getEmployeeId()==id).findFirst().get();
        return emp;
        /*for(int i=0;i<employeeList.size();i++){
            if(EmployeeEntity.getEmployeeId()==id)
                return EmployeeEntity;

        }*/



   /* public EmployeeEntity createEmployee(EmployeeEntity employeeEntity ) {
        employeeList.add(employeeEntity);
        return employeeEntity;
    }

    public EmployeeEntity deleteEmployeeById(int id) {
        employeeList=employeeList.stream().filter(EmployeeEntity-> EmployeeEntity.getEmployeeId()!=id).
                collect(Collectors.toList());
    }


}*/

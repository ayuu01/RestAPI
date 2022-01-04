package com.example.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/test")
    public String handleTest(){
        return "home";
    }

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/api/v1/employee")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employeeEntity){

        EmployeeEntity emp=this.employeeService.createEmployee(employeeEntity);
        return emp;
    }


    @GetMapping("/api/v1/employee")
    public List<EmployeeEntity> getEmployees(){

        return this.employeeService.getAllEmployee();
    }

    @GetMapping("/api/v1/employee/{id}")
    public EmployeeEntity getEmployee(@PathVariable(name = "EmployeeId") int EmployeeId){

        return this.employeeService.getEmployeeById( EmployeeId);
    }


    @DeleteMapping("/api/v1/employee/{id}")
    public void deleteEmployeeById(@PathVariable( "id") int id ){
        this.employeeService.getEmployeeById(id);
    }




}

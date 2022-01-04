package com.example.Employee;

public class EmployeeEntity {
    private int employeeId;
    private String employeeName;
    private int employeeSalary;

    EmployeeEntity(int employeeId,String employeeName, int employeeSalary){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public int getEmployeeSalary(){
        return employeeSalary;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    public String toString(){
        return employeeId+" "+employeeName+" "+employeeSalary;
    }

}

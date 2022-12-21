package com.abhi.rest.dao;

import org.springframework.stereotype.Repository;

import com.abhi.rest.model.Employee;
import com.abhi.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Abhi", "Gupta", "abhi@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Ravi", "Mishra", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Kavi", "Verma", "titanic@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}

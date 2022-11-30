package com.employee.controller;

import com.employee.pojo.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public Employee getEmp(){
        return new Employee(1,"Hari","Prasad","IT",100000);
    }
}

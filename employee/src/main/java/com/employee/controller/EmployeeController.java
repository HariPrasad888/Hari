package com.employee.controller;

import com.employee.pojo.Employee;
import com.employee.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl service;

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees(){
        return service.findAllEmployee();
    }
    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employees){
        service.add(employees);
        return "Added Employees";
    }
    @GetMapping("/getId/{id}")
    public Employee getById(@PathVariable Long id){
        return service.findById(id);
    }
    @DeleteMapping("/deleteId/{id}")
    public String delete(@PathVariable Long id){
        service.deleteById(id);
        return "Employee removed";
    }
    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        service.deleteAll();
        return "All Employees deleted";
    }

}

package com.employee.service;

import com.employee.pojo.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> findAllEmployee();
    public Employee findById(Long id);
    public void add(Employee employees);
    public void deleteAll();
    public void deleteById(Long id);
}

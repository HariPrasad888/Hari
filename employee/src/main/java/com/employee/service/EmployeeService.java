package com.employee.service;

import com.employee.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();
    public Employee findById(int id);
    public void add(List<Employee> employees);
    public void deleteAll();
    public void deleteById(int id);
}

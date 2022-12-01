package com.employee.service;

import com.employee.pojo.Employee;
import com.employee.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo repo;
    @Override
    public List<Employee> findAllEmployee() {
        return (ArrayList<Employee>) repo.findAll();
    }

    public Employee findById(Long id) {
        Optional<Employee> opt = repo.findById(id);
        if(opt.isPresent())
            return opt.get();
        else
            return null;
    }

    @Override
    public void add(Employee employees) {
        repo.save(employees);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();

    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);

    }
}

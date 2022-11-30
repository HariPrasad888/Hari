package com.employee.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.List;

@Data
@AllArgsConstructor
public class Employee {

    private int id;
    private String fname;
    private String lname;
    private String dept;
    private int salary;
    //private List work;

}

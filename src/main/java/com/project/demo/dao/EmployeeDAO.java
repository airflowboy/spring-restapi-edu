package com.project.demo.dao;

import com.project.demo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}

package com.santos.springboot.cruddemo.dao;

import com.santos.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    // Add new DAO methods
    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);


}

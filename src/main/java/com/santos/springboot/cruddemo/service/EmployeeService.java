package com.santos.springboot.cruddemo.service;

import com.santos.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    // Add new DAO methods
    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}

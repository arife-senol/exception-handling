package com.arife.exception_handling.repository;

import com.arife.exception_handling.entity.Employee;

import java.util.List;

public interface EmployeeRepo {
    List<Employee> findAll();
    Employee save(Employee employee);
}

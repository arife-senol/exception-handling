package com.arife.exception_handling.controller;

import com.arife.exception_handling.entity.Employee;
import com.arife.exception_handling.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeRepo employeeRepo;
    @Autowired
    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return employeeRepo.save(employee);
    }
    @GetMapping
    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }
}

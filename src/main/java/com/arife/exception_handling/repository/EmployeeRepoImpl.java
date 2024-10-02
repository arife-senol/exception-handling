package com.arife.exception_handling.repository;

import com.arife.exception_handling.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

    EntityManager em;
    @Autowired
    public EmployeeRepoImpl(EntityManager em) {
        this.em = em;
    }
    @Override
    public List<Employee> findAll() {
      List<Employee> employeeList =  em.createQuery("select e from Employee e",Employee.class).getResultList();
      return employeeList;
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        em.persist(employee);
        return employee;
    }
}

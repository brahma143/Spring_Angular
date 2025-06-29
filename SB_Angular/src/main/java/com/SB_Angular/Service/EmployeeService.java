package com.SB_Angular.Service;

import com.SB_Angular.Entity.Employee;
import com.SB_Angular.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public String deleteEmployee(Long id) {
        repository.deleteById(id);
        return "Employee removed: " + id;
    }

    public Employee updateEmployee(Employee employee) {
        return repository.save(employee);
    }
}

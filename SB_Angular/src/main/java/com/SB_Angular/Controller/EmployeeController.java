package com.SB_Angular.Controller;

import com.SB_Angular.Entity.Employee;
import com.SB_Angular.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/all")
    public List<Employee> getAllEmployee(){

        return service.getAllEmployees();
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){

        return service.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmp(@PathVariable Long id){

        return service.getEmployeeById(id);
    }

    @PutMapping
    public Employee updateEmp(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){

         service.deleteEmployee(id);
    }
}

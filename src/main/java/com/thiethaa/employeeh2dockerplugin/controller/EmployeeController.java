package com.thiethaa.employeeh2dockerplugin.controller;

import com.thiethaa.employeeh2dockerplugin.entity.Employee;
import com.thiethaa.employeeh2dockerplugin.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employeelist")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable ("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee e){
        return employeeService.addEmployee(e);
    }

    @PutMapping("/edit/{id}")
    public Employee editEmployee(@RequestBody Employee e, @PathVariable("id") int id){
        return employeeService.editemployee(e,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id")int id){
        return employeeService.deleteEmployee(id);
    }
}

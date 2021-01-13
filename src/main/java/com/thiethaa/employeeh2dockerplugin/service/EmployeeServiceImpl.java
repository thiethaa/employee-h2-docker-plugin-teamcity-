package com.thiethaa.employeeh2dockerplugin.service;

import com.thiethaa.employeeh2dockerplugin.entity.Employee;
import com.thiethaa.employeeh2dockerplugin.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> existEmp = employeeRepository.findById(id);
        Employee e = null;
        if(existEmp.isPresent()){
            e= existEmp.get();
        }
        return e;
    }

    @Override
    public Employee addEmployee(Employee e) {
        Employee emp = new Employee();
        emp.setName(e.getName());
        emp.setSalary(e.getSalary());
        employeeRepository.save(emp);
        return emp;
    }

    @Override
    public Employee editemployee(Employee e, int id) {
        Optional<Employee> existEmp = employeeRepository.findById(id);
        Employee emp = null;
        if(existEmp.isPresent()){
            emp= existEmp.get();
            emp.setName(e.getName());
            emp.setSalary(e.getSalary());
            employeeRepository.save(emp);
        }
        return emp;
    }

    @Override
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Employee has been deleted!";
    }
}

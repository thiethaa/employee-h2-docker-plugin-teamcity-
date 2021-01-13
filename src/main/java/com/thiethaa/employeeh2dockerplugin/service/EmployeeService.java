package com.thiethaa.employeeh2dockerplugin.service;

import com.thiethaa.employeeh2dockerplugin.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployeeById(int id);

    Employee addEmployee(Employee e);

    Employee editemployee(Employee e, int id);

    String deleteEmployee(int id);
}

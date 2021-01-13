package com.thiethaa.employeeh2dockerplugin.repository;

import com.thiethaa.employeeh2dockerplugin.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}

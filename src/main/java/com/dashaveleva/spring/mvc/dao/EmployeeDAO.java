package com.dashaveleva.spring.mvc.dao;

import com.dashaveleva.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}

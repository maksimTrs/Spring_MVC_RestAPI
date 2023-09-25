package com.spring.mvc.restapi.services;



import com.spring.mvc.restapi.entities.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);
    void deleteEmployee(int id);
}

package com.spring.mvc.restapi.controllers;


import com.spring.mvc.restapi.entities.Employee;
import com.spring.mvc.restapi.exception_handling.NoSuchEmployeeException;
import com.spring.mvc.restapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppRestController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/employees") // http://localhost:8084/Spring_MVC_RestAPI/api/employees
    public List<Employee> showAllEmployees() {
        List<Employee> employeeList = employeeService.getAllEmployees();
        return employeeList;
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployees(@PathVariable int empId) {

        Employee employee = employeeService.getEmployee(empId);

        if (employee == null) {
            throw new NoSuchEmployeeException("There is no such Employee with ID: " + empId);
        }

        return employee;
    }


    @PostMapping("/employees")
    public Employee createEmployees(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployees(@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);

        return employee;
    }


    @DeleteMapping("/employees/{empId}")
    public String deleteEmployees(@PathVariable int empId) {

        Employee employee = employeeService.getEmployee(empId);

        if (employee == null) {
            throw new NoSuchEmployeeException("There is no such Employee with ID: " + empId);
        }

        employeeService.deleteEmployee(empId);

        return "Employee with ID: " + empId + " was deleted!";
    }
}
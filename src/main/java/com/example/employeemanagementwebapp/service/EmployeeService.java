package com.example.employeemanagementwebapp.service;

import com.example.employeemanagementwebapp.model.Employee;
import org.hibernate.query.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees;
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo,int pageSize,String sortField,String sortDirection);
}

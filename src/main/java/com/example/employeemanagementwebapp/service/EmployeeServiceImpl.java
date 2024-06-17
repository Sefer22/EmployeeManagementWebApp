package com.example.employeemanagementwebapp.service;

import com.example.employeemanagementwebapp.model.Employee;
import com.example.employeemanagementwebapp.repository.EmployeeRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }
    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee=null;
        if(optional.isPresent()) {
            employee=optional.get();
        }else {
            throw new RuntimeException("Employee not found for id :: "+id );
        }
        return employee;
    }
    @Override
    public void deleteById(long id) {
        this.employeeRepository.deleteById(id);
    }
    @Override
    public Page<Employee> findPaginated(int pageNo,int pageSize,String sortField,String sortDirection) {
        Sort sort =
    }


}

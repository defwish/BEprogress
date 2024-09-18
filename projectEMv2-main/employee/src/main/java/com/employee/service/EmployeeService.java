package com.employee.service;

import com.employee.exceptions.EntityNotFoundException;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public ResponseEntity<Page<Employee>> getAllEmployees(Pageable pageable) {
        Page<Employee> employees = employeeRepository.findAll(pageable);
        return ResponseEntity.ok(employees);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) { //remove id
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            employee.setFirstName(updatedEmployee.getFirstName());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setPosition(updatedEmployee.getPosition());
            return employeeRepository.save(employee);
        } else {
            throw new EntityNotFoundException("Utilizatorul cu ID-ul acesta nu exista");
        }
    }

    public void deleteEmployee(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            employeeRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Utilizatorul cu ID-ul acesta nu exista");
        }
    }

    public Employee getEmployeeById(long id) {
        
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            return employeeOptional.get();
        } else {
            throw new EntityNotFoundException("Utilizatorul cu ID-ul acesta nu exista");
        }
    }



}

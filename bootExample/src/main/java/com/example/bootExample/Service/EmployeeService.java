package com.example.bootExample.Service;

import com.example.bootExample.Entity.Employee;
import com.example.bootExample.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee returnEmployeeByID(long id){
       return employeeRepo.findByEmployeeID(id);
    }
}

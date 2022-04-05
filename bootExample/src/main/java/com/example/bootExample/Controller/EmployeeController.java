package com.example.bootExample.Controller;

import com.example.bootExample.Entity.Employee;
import com.example.bootExample.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @GetMapping("/employee/{id}")
    public Employee getAllEmployee(@RequestParam (name = "id",defaultValue = "1") String id){
        long inOfEmployee = Integer.parseInt(id);
        return service.returnEmployeeByID(inOfEmployee);
    }

}

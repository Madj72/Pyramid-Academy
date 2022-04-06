package com.example.employee.demo.SpringBootJPAProjectCRUD.Controller;

import com.example.employee.demo.SpringBootJPAProjectCRUD.Entity.Employee;
import com.example.employee.demo.SpringBootJPAProjectCRUD.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/test")
    public String test (){
        return"This is it";
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return service.getAllEmployees();
    }

    @PostMapping("/addEmp")
    public Employee addAnEmploye (@RequestBody Employee employee){
        service.addAnEmployee(employee);
        return employee;
    }

    @DeleteMapping("/deleteEmp")
    public String deleteAnEmployee(@RequestParam Integer id){
        return service.deleteAnEmployeeById(id);
    }

}

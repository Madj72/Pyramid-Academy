package com.example.employee.demo.SpringBootJPAProjectCRUD.Service;

import com.example.employee.demo.SpringBootJPAProjectCRUD.DAO.EmployeeRepo;
import com.example.employee.demo.SpringBootJPAProjectCRUD.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

 public Employee getEmployeeById(int id){
     return employeeRepo.getById(id);
 }

 public Employee addAnEmployee (Employee employee){
     return this.employeeRepo.save(employee);
 }

 public String deleteAnEmployeeById (Integer id){
     Employee employee = getEmployeeById(id);
     employeeRepo.delete(employee);
     return "Employee deleted successfully";
 }
 public List<Employee> getAllEmployees(){
     return employeeRepo.findAll();
 }

 public String deteleAnEmployeeById(Integer id){
     Employee employee = employeeRepo.getById(id);
     employeeRepo.delete(employee);
     return"the employee has been deleted from the data-base";
 }

}

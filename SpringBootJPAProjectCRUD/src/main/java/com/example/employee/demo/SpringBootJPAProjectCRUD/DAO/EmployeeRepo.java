package com.example.employee.demo.SpringBootJPAProjectCRUD.DAO;

import com.example.employee.demo.SpringBootJPAProjectCRUD.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee, Integer> {
}

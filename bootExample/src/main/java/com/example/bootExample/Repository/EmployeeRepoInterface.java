package com.example.bootExample.Repository;

import com.example.bootExample.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepoInterface extends CrudRepository<Employee, Long> {

    Employee findByEmployeeID(long id);
}

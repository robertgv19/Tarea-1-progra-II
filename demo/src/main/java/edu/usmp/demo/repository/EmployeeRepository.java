package edu.usmp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.usmp.demo.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
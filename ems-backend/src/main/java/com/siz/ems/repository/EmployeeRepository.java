package com.siz.ems.repository;

import com.siz.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // just by extending Jpa, this employeeRepo already have basic CRUD
}

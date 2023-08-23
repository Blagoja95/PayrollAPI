package com.payroll.payroll.employee;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRopository extends JpaRepository<Employee, Long> {}

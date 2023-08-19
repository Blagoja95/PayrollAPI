package com.payroll.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRopository extends JpaRepository <Employee, Long> {
}

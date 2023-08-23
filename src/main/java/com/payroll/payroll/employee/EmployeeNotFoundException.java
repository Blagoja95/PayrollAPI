package com.payroll.payroll.employee;

class EmployeeNotFoundException extends RuntimeException
{
	EmployeeNotFoundException(Long id)
	{
		super("Could not find employee " + id);
	}
}
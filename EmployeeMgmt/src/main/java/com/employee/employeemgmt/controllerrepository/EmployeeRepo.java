package com.employee.employeemgmt.controllerrepository;

import org.springframework.data.repository.CrudRepository;

import com.employee.employeemgmt.controller.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
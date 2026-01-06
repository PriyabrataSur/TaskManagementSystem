package in.sigma.EmployeeManagement.service;

import in.sigma.EmployeeManagement.entity.Employee;

public interface EmployeeService {

    public Employee updateEmpById(Integer id, Employee data);
}

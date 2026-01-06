package in.sigma.EmployeeManagement.service;

import in.sigma.EmployeeManagement.entity.Employee;
import in.sigma.EmployeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
//    @Transactional
    public Employee updateEmpById(Integer id, Employee data) {

        Employee newEmp = employeeRepository.getById(id);

        newEmp.setEmpRole(data.getEmpRole());
        newEmp.setEmpEmail(data.getEmpEmail());
        newEmp.setEmpPhNo(data.getEmpPhNo());
        newEmp.setEmpSalary(data.getEmpSalary());

        return employeeRepository.save(newEmp);
    }
}

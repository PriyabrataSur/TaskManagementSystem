package in.sigma.EmployeeManagement.controller;

import in.sigma.EmployeeManagement.entity.Employee;
import in.sigma.EmployeeManagement.repository.EmployeeRepository;
import in.sigma.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addData")
    public ResponseEntity<Employee> addEmp(@RequestBody Employee data){
        Employee empData = employeeRepository.save(data);
        return new ResponseEntity<>(empData, HttpStatus.CREATED);
    }

    @PutMapping("/updateData/{id}")
    public ResponseEntity<Employee> updateEmpById(@PathVariable("id") Integer empId, @RequestBody Employee data){
        Employee empData = employeeService.updateEmpById( empId, data);
        return new ResponseEntity<>(empData, HttpStatus.OK);
    }

    @DeleteMapping("/deleteData/{id}")
    public ResponseEntity<Employee> deleteEmpById(@PathVariable("id") Integer empId){
        employeeRepository.deleteById(empId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getData/{id}")
    public Employee getById(@PathVariable("id") Integer id){
        return employeeRepository.getById(id);
    }

    @GetMapping("/getData")
    public List<Employee> displayEmp(){
        return employeeRepository.findAll();
    }
}

package in.sigma.EmployeeManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer empId;
    String empName;
    String empRole;
    String empGender;
    Double empSalary;
    String empPhNo;
    String empEmail;

}

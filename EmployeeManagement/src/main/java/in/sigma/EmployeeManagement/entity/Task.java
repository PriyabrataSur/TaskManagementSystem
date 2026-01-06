package in.sigma.EmployeeManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Task {

    @Id
    @GeneratedValue
    Integer taskId;
    String taskName;
    String taskAssignTo;
    String taskDueDate;
    String taskDueTime;
    String taskPriority;
    String TaskModule;
    String taskDescription;
}

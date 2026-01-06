package in.sigma.EmployeeManagement.service;

import in.sigma.EmployeeManagement.entity.Task;

public interface TaskService {

    public Task updateTaskById(Integer id, Task data);
}

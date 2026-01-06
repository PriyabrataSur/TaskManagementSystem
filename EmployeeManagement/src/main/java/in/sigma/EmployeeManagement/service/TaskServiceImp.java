package in.sigma.EmployeeManagement.service;

import in.sigma.EmployeeManagement.entity.Task;
import in.sigma.EmployeeManagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImp implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task updateTaskById(Integer id, Task data) {

        Task newTask = taskRepository.getById(id);

        newTask.setTaskAssignTo(data.getTaskAssignTo());
        newTask.setTaskDescription(data.getTaskDescription());
        newTask.setTaskModule(data.getTaskModule());
        newTask.setTaskPriority(data.getTaskPriority());
        newTask.setTaskDueDate(data.getTaskDueDate());
        newTask.setTaskDueTime(data.getTaskDueTime());

        return taskRepository.save(newTask);
    }
}

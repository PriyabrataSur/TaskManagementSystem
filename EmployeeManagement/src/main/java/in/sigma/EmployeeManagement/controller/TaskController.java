package in.sigma.EmployeeManagement.controller;

import in.sigma.EmployeeManagement.entity.Task;
import in.sigma.EmployeeManagement.repository.TaskRepository;
import in.sigma.EmployeeManagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskService taskService;

    @PostMapping("/addData")
    public ResponseEntity<Task> addTask(@RequestBody Task data){
        Task taskData = taskRepository.save(data);
        return new ResponseEntity<>(taskData, HttpStatus.CREATED);
    }

    @PutMapping("/updateData/{id}")
    public ResponseEntity<Task> updateTaskById(@PathVariable("id") Integer taskId, @RequestBody Task data){
        Task taskData = taskService.updateTaskById(taskId, data);
        return new ResponseEntity<>(taskData, HttpStatus.OK);
    }

    @DeleteMapping("/deleteData/{id}")
    public ResponseEntity<Task> deleteTaskById(@PathVariable("id") Integer taskId){
        taskRepository.deleteById(taskId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getData/{id}")
    public Task getById(@PathVariable("id") Integer id){
        return taskRepository.getById(id);
    }

    @GetMapping("/getData")
    public List<Task> allTask(){
        return taskRepository.findAll();
    }

}

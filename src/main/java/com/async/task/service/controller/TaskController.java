package com.async.task.service.controller;

import com.async.task.service.api.model.Task;
import com.async.task.service.api.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @GetMapping("task/all")
    public List<Task> getAllTasks(){
        return this.taskRepository.findAll();
    }

    @GetMapping("task/{id}")
    public Optional<Task> getAllTasks(@PathVariable Integer id){
        return this.taskRepository.findById(id);
    }

    @PostMapping("task")
    public Task createTask(@RequestBody Task task){
        return this.taskRepository.save(task);
    }
}

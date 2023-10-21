package com.example.demo.services;

import com.example.demo.models.Task;
import com.example.demo.repositores.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Task findTaskById(Long id) {
        if(taskRepository.findById(id).isPresent()) {
            return taskRepository.findById(id).get();
        }
        return null;
    }

    public List<Task> findAllCompletedTask() {
        return taskRepository.findByCompletedTrue();
    }

    public List<Task> findAllInCompleteTask() {
        return taskRepository.findByCompletedFalse();
    }

    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
}

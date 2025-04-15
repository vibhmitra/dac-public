package com.example.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.entity.Task;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private long taskIdCounter = 1;

    public List<Task> getAllTasks() {
    	
        return tasks;
    }

    public Optional<Task> getTaskById(Long id) {
        return tasks.stream().filter(task -> task.getId().equals(id)).findFirst();
    }

    public Task createTask(Task task) {
        task.setId(taskIdCounter++);
        tasks.add(task);
        return task;
    }

    public void updateTask(Long id, Task task) {
        tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .ifPresent(existingTask -> {
                    existingTask.setName(task.getName());
                });
    }

    public void deleteTask(Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }
}

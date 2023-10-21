package com.example.demo.repositores;

import com.example.demo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    public Task findByTask(String Task);
    public List<Task> findByCompletedTrue();
    public List<Task> findByCompletedFalse();
    @Override
    public List<Task> findAll();
    @Override
    public Task getById(Long id);
}

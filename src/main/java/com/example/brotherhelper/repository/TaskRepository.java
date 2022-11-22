package com.example.brotherhelper.repository;

import com.example.brotherhelper.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

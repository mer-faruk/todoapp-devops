package com.omerfaruk.todoapp.repository;

import com.omerfaruk.todoapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

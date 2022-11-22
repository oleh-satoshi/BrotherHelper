package com.example.brotherhelper.repository;

import com.example.brotherhelper.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
}

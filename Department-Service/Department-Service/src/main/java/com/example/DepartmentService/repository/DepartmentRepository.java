package com.example.DepartmentService.repository;

import com.example.DepartmentService.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}

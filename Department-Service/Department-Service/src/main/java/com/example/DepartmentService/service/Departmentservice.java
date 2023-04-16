package com.example.DepartmentService.service;

import com.example.DepartmentService.entity.Department;
import com.example.DepartmentService.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Departmentservice {

    @Autowired
    DepartmentRepository departmentRepository;

    public String adddepartment(Department dept){
        departmentRepository.save(dept);
        return "data saved";
    }
    public Optional<Department> getdeptbyid(long id){
        return departmentRepository.findById(id);
    }
}

package com.example.DepartmentService.controller;


import com.example.DepartmentService.entity.Department;
import com.example.DepartmentService.service.Departmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class DepartmentController {
    @Autowired
    Departmentservice departmentservice;

    @GetMapping("/getdept/{id}")
    public Optional<Department> getbyid(@PathVariable Integer id){
        return departmentservice.getdeptbyid(id);
    }
    @PostMapping("/adddept")
    public String adddepartment(@RequestBody Department dept){
        return departmentservice.adddepartment(dept);
    }
}

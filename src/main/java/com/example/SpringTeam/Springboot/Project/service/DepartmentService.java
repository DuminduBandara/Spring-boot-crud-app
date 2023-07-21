package com.example.SpringTeam.Springboot.Project.service;

import com.example.SpringTeam.Springboot.Project.entity.Department;
import com.example.SpringTeam.Springboot.Project.error.DepartmentNoFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartments();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNoFoundException;

    public void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);

    List<Department> fetchDepartmentsQuery();
}

package com.example.SpringTeam.Springboot.Project.repository;

import com.example.SpringTeam.Springboot.Project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

//    ignore uppercase and lowercase
    public Department findByDepartmentNameIgnoreCase(String departmentName);


}

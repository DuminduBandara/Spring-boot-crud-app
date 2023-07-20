package com.example.SpringTeam.Springboot.Project.repository;

import com.example.SpringTeam.Springboot.Project.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

//    ignore uppercase and lowercase
    public Department findByDepartmentNameIgnoreCase(String departmentName);

    @Query(value = "SELECT * FROM Department", nativeQuery = true)
    public List<Department> findData();


}

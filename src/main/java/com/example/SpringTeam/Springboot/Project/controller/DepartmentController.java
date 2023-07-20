package com.example.SpringTeam.Springboot.Project.controller;

import com.example.SpringTeam.Springboot.Project.entity.Department;
import com.example.SpringTeam.Springboot.Project.service.DepartmentService;
import com.example.SpringTeam.Springboot.Project.service.DepartmentServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

//    use normal constructor
//    DepartmentService dpservice = new DepartmentServiceImplement();

//    use autowired

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getDepartments")
    public List<Department> fetchDepartments(){
        return departmentService.fetchDepartments();
    }


    @GetMapping("/getDepartment/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully!";
    }

    @PutMapping("updateDepartment/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/getDepartment/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }

    @GetMapping("/queryget")
    public List<Department> fetchDepartmentsQuery(){
        return departmentService.fetchDepartmentsQuery();
    }


}

package com.example.SpringTeam.Springboot.Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor // create default constructor
@AllArgsConstructor // create constructor with arguments
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentId;

    @NotBlank(message = "Please Add Department Name!")
//    @Length(max = 5, min = 1)
//    @Size(max = 10, min = 0)
//    @Email
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;





}

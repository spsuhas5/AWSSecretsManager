package com.example.sample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Range(min = 1, message = "Please select positive numbers Only")
    private int empId;
    @NotBlank(message = "empName cannot be blank")
    private String empName;
}
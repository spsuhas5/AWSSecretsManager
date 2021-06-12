package com.example.sample.controller;

import com.example.sample.exception.CustomException;
import com.example.sample.model.Employee;
import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;

@RestController
@Validated
public class EmployeeController {

    @GetMapping("/getData")
    public String getData(@PathParam("data") @NotNull String data) {
        System.out.println("data: " + data);
        return data;
    }

    @PostMapping("/getEmpData")
    public Employee getEmpData(@RequestBody @Valid Employee employee) {
        System.out.println("data: " + employee.getEmpId());
        return employee;
    }

    @GetMapping("/validateCustomException")
    public String validateCustomException(@PathParam("data") String data) {
        if(StringUtils.isBlank(data)){
            throw new CustomException("data cannot be null/blank/empty");
        }
        return data;
    }

}

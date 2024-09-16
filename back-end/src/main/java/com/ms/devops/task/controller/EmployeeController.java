package com.ms.devops.task.controller;

import com.ms.devops.task.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @GetMapping("/getAllEmployees")
    ResponseEntity<EmployeeDto> getAllEmployees(){

    }


}

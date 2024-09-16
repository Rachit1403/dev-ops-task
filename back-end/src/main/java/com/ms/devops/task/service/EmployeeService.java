package com.ms.devops.task.service;

import com.ms.devops.task.dto.EmployeeDto;
import org.springframework.stereotype.Service;

public interface EmployeeService {
    EmployeeDto getAllEmployees();
}

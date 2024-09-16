package com.ms.devops.task.serviceImpl;

import com.ms.devops.task.dto.EmployeeDto;
import com.ms.devops.task.repository.EmployeeRepo;
import com.ms.devops.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeeDto getAllEmployees() {
        return null;
    }
}

package com.ms.devops.task.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long empId;

    @Column(name = "employeeName")
    String employeeName;

    @Column(name = "employeePosition")
    String employeePosition;

}

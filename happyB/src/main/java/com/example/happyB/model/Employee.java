package com.example.happyB.model;


import jakarta.persistence.*;
import lombok.Data;

import java.security.Principal;

@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "smpId")
    private String smpId;
    @Column(name = "departmentId")
    private String departmentId;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

    public Employee(String smpId, String departmentId) {
        this.smpId = smpId;
        this.departmentId = departmentId;
    }

    public Employee() {
    }

    public Employee(Principal principal, String smpId, String departmentId) {
    }
}

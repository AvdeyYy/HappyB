package com.example.happyB.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "test")
public class TestEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String smpId;
    private String departmentId;
}

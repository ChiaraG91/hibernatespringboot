package com.hibernatespringboot.hibernatespringboot.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classes_id", nullable = false)
    private Classes classes;

}

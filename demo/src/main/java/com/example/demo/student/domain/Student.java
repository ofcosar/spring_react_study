package com.example.demo.student.domain;



import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;


@Entity
@Data
public class Student {
    @Column(
        nullable = false
    )
    private String studentName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column(
            nullable = false
    )
    private Long studentId;
}

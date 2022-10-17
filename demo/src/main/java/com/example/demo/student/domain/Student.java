package com.example.demo.student.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@Data
@Entity
public class Student {
    private String studentName;
    @Id
    private Long id;

}

package com.example.demo.student.application.portIn;

import com.example.demo.student.domain.Student;

import java.util.List;

public interface GetStudentsUseCase {
    List<Student> getAllStudents();
}

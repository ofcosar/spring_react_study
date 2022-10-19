package com.example.demo.student.application;

import com.example.demo.student.adapter.out.StudentRepository;
import com.example.demo.student.application.portIn.AddStudentUseCase;
import com.example.demo.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddStudentService implements AddStudentUseCase {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}

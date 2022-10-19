package com.example.demo.student.application;

import com.example.demo.student.adapter.out.StudentRepository;
import com.example.demo.student.application.portIn.GetStudentsUseCase;
import com.example.demo.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetStudentsService implements GetStudentsUseCase {
   @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();


    }
}

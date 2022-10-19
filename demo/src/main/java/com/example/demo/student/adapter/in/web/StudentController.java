package com.example.demo.student.adapter.in.web;

import com.example.demo.student.application.AddStudentService;
import com.example.demo.student.application.GetStudentsService;
import com.example.demo.student.application.portIn.AddStudentUseCase;
import com.example.demo.student.application.portIn.GetStudentsUseCase;
import com.example.demo.student.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    @Autowired
    AddStudentUseCase addStudentUseCase;
    @Autowired
    GetStudentsUseCase getStudentsUseCase;

    @GetMapping("/allStudents")
    List<Student> getAllStudent(){
        return getStudentsUseCase.getAllStudents();
    }

    @PostMapping("/addStudent")
    void postStudent(@RequestBody Student student){
addStudentUseCase.addStudent(student);
    }
}

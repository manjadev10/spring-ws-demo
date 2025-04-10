package com.example.spring_ws_demo.service;

import com.example.spring_ws_demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudentDetails(String name) {
        Student student = new Student();
        student.setName(name);
        student.setAge(22);
        student.setCourse("Computer Science");
        return student;
    }
}

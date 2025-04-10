package com.example.spring_ws_demo.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GetStudentReponse", namespace = "http://example.com/students")
@XmlType(name = "GetStudentResponse", namespace = "http://example.com/students")
public class GetStudentReponse {

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

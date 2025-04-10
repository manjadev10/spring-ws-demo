package com.example.spring_ws_demo.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GetStudentRequest", namespace = "http://example.com/students")
@XmlType(name = "GetStudentRequest", namespace = "http://example.com/students")
public class GetStudentRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

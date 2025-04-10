package com.example.spring_ws_demo.endpoint;

import com.example.spring_ws_demo.model.GetStudentReponse;
import com.example.spring_ws_demo.model.GetStudentRequest;
import com.example.spring_ws_demo.model.Student;
import com.example.spring_ws_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentEndpoint {

    @Autowired
    private StudentService studentService;

    private final String NAMESPACE_URI = "http://example.com/students";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetStudentRequest")
    @ResponsePayload
    public GetStudentReponse getStudent(@RequestPayload GetStudentRequest request){
        Student student = studentService.getStudentDetails(request.getName());
        GetStudentReponse reponse = new GetStudentReponse();
        reponse.setStudent(student);
        return reponse;
    }
}

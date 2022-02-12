package com.kyanja.service.impl;

import com.kyanja.model.Student;
import com.kyanja.service.ChangeStudentDetails;

import javax.jws.WebService;


@WebService(endpointInterface = "com.kyanja.service.ChangeStudentDetails")
public class ChangeStudentDetailsImpl  implements ChangeStudentDetails {
    @Override
    public Student changeName(Student student) {

        student.setName("Hello "+student.getName());

        return student;
    }
}

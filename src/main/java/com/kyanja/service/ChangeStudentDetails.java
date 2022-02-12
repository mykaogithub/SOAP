package com.kyanja.service;


import com.kyanja.model.Student;

import javax.jws.WebService;

@WebService
public interface ChangeStudentDetails {


    Student changeName(Student student);
}

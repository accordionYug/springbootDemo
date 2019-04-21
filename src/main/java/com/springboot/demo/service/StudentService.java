package com.springboot.demo.service;

import com.springboot.demo.model.Student;

public interface StudentService {

    int add(Student student);
    int update(Student student);
    int deleteById(Integer id);
    Student queryById(Integer id);
}

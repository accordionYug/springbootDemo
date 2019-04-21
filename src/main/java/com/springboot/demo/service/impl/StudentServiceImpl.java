package com.springboot.demo.service.impl;

import com.springboot.demo.dao.StudentMapper;
import com.springboot.demo.model.Student;
import com.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }

    @Override
    public int deleteById(Integer id) {
        return studentMapper.deleteById(id);
    }

    @Override
    public Student queryById(Integer id) {
        return studentMapper.queryById(id);
    }
}

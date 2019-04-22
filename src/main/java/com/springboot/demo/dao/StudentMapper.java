package com.springboot.demo.dao;

import com.springboot.demo.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface StudentMapper {

    int add(Student student);
    int update(Student student);
    int deleteById(Integer id);
    Student queryById(Integer id);
    List<Student> getAllStudent();


}

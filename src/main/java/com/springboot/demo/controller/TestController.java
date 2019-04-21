package com.springboot.demo.controller;


import com.springboot.demo.model.Student;
import com.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/querystudent", method = RequestMethod.GET)
    public Student queryStudentById(@RequestParam(value = "id", defaultValue = "1") Integer id){
//        Integer id = Integer.valueOf(sid);
        return studentService.queryById(id);
    }



}

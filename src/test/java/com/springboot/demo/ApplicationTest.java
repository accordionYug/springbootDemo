package com.springboot.demo;


import com.springboot.demo.model.Student;
import com.springboot.demo.service.StudentService;
import javafx.application.Application;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ApplicationTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test() throws Exception{
        Student student1 = studentService.queryById(1);
        System.out.println("姓名："+student1.getName()+"性别:"+student1.getSex());
        Student student2 = studentService.queryById(1);
        System.out.println("姓名："+student2.getName()+"性别:"+student2.getSex());
    }

    @BeforeClass
    public static void beforeClassTest(){
        System.out.println("before class test");
    }

    @Before
    public void beforeTest(){
        System.out.println("before test");
    }

    @Test
    public void test1(){
        System.out.println("Test 1+1");
    }

    @After
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public static void afterClassTest(){
        System.out.println("after class test");
    }
}

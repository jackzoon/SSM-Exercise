package com.halen.controller;

import com.halen.entity.Student;
import com.halen.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/user")
    public String insertUser(@RequestBody Student student) {

        studentService.createStudent(student);
        return "user";
    }

}

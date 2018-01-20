package com.halen.service;

import com.halen.dao.StudentMapper;
import com.halen.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int createStudent(Student student) {
        studentMapper.insertSelective(student);
        return 0;
    }
}

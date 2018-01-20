package com.halen.service;

import com.halen.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    int createStudent(Student student);
}

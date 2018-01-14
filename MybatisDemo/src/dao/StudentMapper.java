package dao;

import entity.Student;

import java.util.List;

public interface StudentMapper {

    int insertStudent(Student student) throws Exception;

    Student selectOneById(int id) throws Exception;

    List<Student> selectAllStudent() throws Exception;

}

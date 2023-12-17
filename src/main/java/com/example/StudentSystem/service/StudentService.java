package com.example.StudentSystem.service;

import com.example.StudentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student>getAllStudent();
}

package com.example.StudentSystem.controller;

import com.example.StudentSystem.model.Student;
import com.example.StudentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public  String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student added.";
    }
    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudent();
    }

}

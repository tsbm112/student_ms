package com.student_ms.student_ms.controller;

import com.student_ms.student_ms.Model.Student;
import com.student_ms.student_ms.Service.StudentService;
import com.student_ms.student_ms.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

  @PostMapping("/register")
    public Student create(@RequestBody Student student){
        return studentService.save(student);
}
    }
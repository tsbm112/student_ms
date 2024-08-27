package com.student_ms.student_ms.Service;

import com.student_ms.student_ms.Model.Student;
import com.student_ms.student_ms.repostory.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student save(Student student) {
        //todo :save student
        return studentRepo.save(student);
        //todo:Implement get all students endpoint;
    }
}

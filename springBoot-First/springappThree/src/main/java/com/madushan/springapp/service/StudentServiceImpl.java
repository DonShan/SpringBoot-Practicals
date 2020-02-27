package com.madushan.springapp.service;

import com.madushan.springapp.model.Student;
import com.madushan.springapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student) {
        return studentRepository.save(student);
    }
}

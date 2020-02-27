package com.madushan.springapp.repository;

import com.madushan.springapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository extends Repository<Student, Integer> {

    @Autowired
    StudentRepository studentRepository = null;

    public default Student save(Student student) {
        return studentRepository.save(student);
    }
}

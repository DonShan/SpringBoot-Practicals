package com.madushan.springapp;

import com.madushan.springapp.model.Student;
import com.madushan.springapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String greeting(){
        return "Hello spring boot";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greeting2(){
        return "Hello this is spring POST";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }
}

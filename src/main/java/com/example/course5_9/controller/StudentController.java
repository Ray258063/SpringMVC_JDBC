package com.example.course5_9.controller;

import com.example.course5_9.Student;

import com.example.course5_9.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    //get student
    @GetMapping("/students")
    public String test(){
        return "test sucess";
    }

    @GetMapping("/students/{studentId}")
    public Student select(@PathVariable Integer studentId){
        return studentService.getById(studentId);
    }


}

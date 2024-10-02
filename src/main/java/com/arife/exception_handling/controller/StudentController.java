package com.arife.exception_handling.controller;

import com.arife.exception_handling.entity.Student;
import com.arife.exception_handling.exceptions.StudentException;
import com.arife.exception_handling.requests.StudentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {

    List<Student> studentList=new ArrayList<>();
    @GetMapping
    public String getName(@RequestBody String name){
        if(name.equals("arife"))
        {
            throw new StudentException("Gelen isim hatası "+name, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        else if(name.equals("arife2"))
        {
            throw new RuntimeException("İkinci isim hatası");
        }
        return name;
    }

    @GetMapping("/")
    public StudentRequest getName(@RequestBody StudentRequest studentRequest){
        if(studentRequest.getName().equals("arife"))
        {
            throw new StudentException("Gelen isim hatası ", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        else if(studentRequest.getAge()==20)
        {
            throw new RuntimeException("İkinci yas hatası");
        }
        return studentRequest;
    }
    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        studentList.add(student);
        return student;
    }
    @GetMapping("/get")
    public List<Student> saveStudent2(){
        return studentList;
    }
    @GetMapping("/get/v1")
    public  String getNameV1(){
        return "arife";
    }
}

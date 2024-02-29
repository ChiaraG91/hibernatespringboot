package com.hibernatespringboot.hibernatespringboot.controllers;

import com.hibernatespringboot.hibernatespringboot.entities.Student;
import com.hibernatespringboot.hibernatespringboot.repository.StudentRepository;
import com.hibernatespringboot.hibernatespringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/scuoladevelhope")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public ResponseEntity<Student> addStudente(@RequestBody Student student){
        studentService.creaStudente(student);
        return ResponseEntity.ok().body(student);
    }

    @GetMapping("/selectstudent")
    public ResponseEntity<List<Student>> selectAllStudent(){
        List<Student> allStudents =   studentService.viewList();
        return ResponseEntity.ok().body(allStudents);
    }

}

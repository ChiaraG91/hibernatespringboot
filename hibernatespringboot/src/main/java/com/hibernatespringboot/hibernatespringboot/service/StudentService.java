package com.hibernatespringboot.hibernatespringboot.service;

import com.hibernatespringboot.hibernatespringboot.entities.Student;
import com.hibernatespringboot.hibernatespringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student creaStudente(Student student){
        studentRepository.save(student);
        return student;
    }

    public List<Student> viewList(){
        return studentRepository.findAll();
    }
}

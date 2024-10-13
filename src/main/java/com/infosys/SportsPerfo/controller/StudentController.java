package com.infosys.SportsPerfo.controller;
import com.infosys.SportsPerfo.model.Student;
import com.infosys.SportsPerfo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }

    @GetMapping("/students")
    public List<Student> findStudents(){
        return service.getStudents();
    }

    @GetMapping("/studentId/{id}")
    public Student findStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }

    @GetMapping("markGreaterThan/{mark}")
    public List<Student> studentsWithMarkGreaterThan(@PathVariable int mark){
        return service.studentsWithMarkGreaterThan(mark);
    }

}

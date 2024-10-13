package com.infosys.SportsPerfo.service;
import com.infosys.SportsPerfo.model.Student;
import com.infosys.SportsPerfo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student getStudentById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student "+ id + " removed!!";
    }

    public Student updateStudent(Student student){
        Student existStudent=repository.findById(student.getId()).orElse(student);
        existStudent.setName(student.getName());
        existStudent.setDepartment(student.getDepartment());
        existStudent.setMark(student.getMark());
        return repository.save(existStudent);
    }

    public List<Student> studentsWithMarkGreaterThan(int mark){
        return repository.studentsWithMarkGreaterThan(mark);
    }
}

package com.infosys.SportsPerfo.repository;
import com.infosys.SportsPerfo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query("SELECT s FROM Student s WHERE s.mark > :mark")
    List<Student> studentsWithMarkGreaterThan(int mark);
}

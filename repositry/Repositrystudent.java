package com.example.hw1database.repositry;

import com.example.hw1database.model.Student;
import com.example.hw1database.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositrystudent extends JpaRepository<Student,Integer> {

    Student findStudentById(Integer id);
    Student findStudentByName(String name);
    List<Student> findStudentByMajor(String major);




}

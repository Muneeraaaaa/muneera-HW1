package com.example.hw1database.service;

import com.example.hw1database.model.Student;
import com.example.hw1database.model.Teacher;
import com.example.hw1database.repositry.ReprositryTeacher;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class techerservice {

    private final ReprositryTeacher reprositryTeacher;


    public List<Teacher> getteacher(){

        return reprositryTeacher.findAll();
    }
    public void addteacher(Teacher teachers){

        reprositryTeacher.save(teachers);


    }

    public void updateteacher(Teacher teachers,Integer id){

        reprositryTeacher.save(teachers);
//        Student istudentss=repositrystudent.getReferenceById(id);
//        istudentss.setAge(students.getAge());
//        istudentss.setId(students.getId());

    }
    public void delteteacher(Integer index){
        Teacher stu=reprositryTeacher.getReferenceById(index);
        reprositryTeacher.delete(stu);
    }

}

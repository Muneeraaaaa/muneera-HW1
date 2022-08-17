package com.example.hw1database.service;

import com.example.hw1database.model.Student;
import com.example.hw1database.repositry.Repositrystudent;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class studentservice {

    private final Repositrystudent repositrystudent;

    public List<Student> getstudent(){

        return repositrystudent.findAll();
    }
    public void addstudent(Student students){

        repositrystudent.save(students);

    }

    public void updatestudents(Student students,Integer id){

        repositrystudent.save(students);
//        Student istudentss=repositrystudent.getReferenceById(id);
//        istudentss.setAge(students.getAge());
//        istudentss.setId(students.getId());

    }
    public void deltestudent(Integer index){
        Student stu=repositrystudent.getReferenceById(index);
        repositrystudent.delete(stu);
    }

    public Student findStudentById(Integer id){

        return repositrystudent.findStudentById(id);

    }

    public Student findStudentByName(String name) {

        return repositrystudent.findStudentByName(name);
    }

    public List<Student> findStudentByMajor(String majore){

        return repositrystudent.findStudentByMajor(majore);

    }
}

package com.example.hw1database.controller;

import com.example.hw1database.model.Student;
import com.example.hw1database.otd.Api;
import com.example.hw1database.service.studentservice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
public class StudentController {

    private final studentservice studentservice;

    @GetMapping()
    public ResponseEntity getstudent(){
        List<Student> studentt=studentservice.getstudent();
        return ResponseEntity.status(200).body(studentt);

    }
    @PostMapping()
    public ResponseEntity addstudent(@RequestBody @Valid Student students){
        studentservice.addstudent(students);
        return ResponseEntity.status(200).body(new Api("the student is added ",200));
    }

    @PostMapping("/{index}") public ResponseEntity updatestudent(@PathVariable @Valid Integer index,@RequestBody @Valid Student students) {
        studentservice.updatestudents(students,index);
        return ResponseEntity.status(200).body(new Api("the student is updated",200));

    }
    @DeleteMapping("/{index}")
    public ResponseEntity delete(@PathVariable @Valid Integer index,@RequestBody @Valid Student students){

        studentservice.deltestudent(index);
        return ResponseEntity.status(200).body(new Api("the student is delete ",200));

    }

    @GetMapping("/find/{index}")
    public ResponseEntity findStudentById(@PathVariable Integer id){

        studentservice.findStudentById(id);
        return ResponseEntity.status(200).body(new Api("this is student by id  ",200));

    }

    @GetMapping("/name")
    public ResponseEntity findStudentByName(@RequestBody String name){

        studentservice.findStudentByName(name);
        return ResponseEntity.status(200).body(new Api("the student by name ",200));

    }

    @GetMapping("/name")
    public List<Student> findStudentByMajor(String majore){
        return studentservice.findStudentByMajor(majore);

    }


    }

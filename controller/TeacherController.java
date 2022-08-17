package com.example.hw1database.controller;

import com.example.hw1database.model.Student;
import com.example.hw1database.model.Teacher;
import com.example.hw1database.otd.Api;
import com.example.hw1database.repositry.ReprositryTeacher;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {
    private final ReprositryTeacher reprositryTeacher;

    @GetMapping()
    public ResponseEntity getsteacher() {
        List<Teacher> teachers = reprositryTeacher.getteacher;
        return ResponseEntity.status(200).body(teachers);
//
    }

    //    @PostMapping()
    public ResponseEntity addteacher(@RequestBody @Valid Teacher teachers) {
        reprositryTeacher.addteacher(teachers);
        return ResponseEntity.status(200).body(new Api("the teacher is added ", 200));
    }

    @PostMapping("/{index}")
    public ResponseEntity updateteacher(@PathVariable @Valid Integer index, @RequestBody @Valid Teacher teacher) {
        reprositryTeacher.updateteacher(teacher, index);
        return ResponseEntity.status(200).body(new Api("the teacher is updated", 200));

    }

    @DeleteMapping("/{index}")
    public ResponseEntity delete(@PathVariable @Valid Integer index, @RequestBody @Valid Teacher teachers) {

        reprositryTeacher.delteteacher(index,teachers);
        return ResponseEntity.status(200).body(new Api("the teacher is delete ", 200));

    }


}




package com.example.hw1database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor @Data
@Entity @RequiredArgsConstructor


public class Student {
    //Student Class : ID , name , age , major ( all should not be empty ) ( major enum { CS , MATH , Engineer )
    @NotNull(message = " id should not be empty ")
    @Id
        private Integer id;
    @NotEmpty(message = " should not be empty ")

    private String name;
    @NotEmpty
    private Integer age;
    @NotEmpty
    private Integer major;

}

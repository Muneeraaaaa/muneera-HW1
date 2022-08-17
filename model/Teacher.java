package com.example.hw1database.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@AllArgsConstructor @Data @RequiredArgsConstructor
@Entity
public class Teacher {
    //Teacher Class : ID , name , salary ( all should not be empty)
@Id
@NotNull
    private Integer id;
@NotEmpty
private String name;
@NotNull
    private Integer salary;


}

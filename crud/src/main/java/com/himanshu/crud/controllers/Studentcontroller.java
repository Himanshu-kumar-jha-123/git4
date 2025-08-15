package com.himanshu.crud.controllers;

import com.himanshu.crud.entities.Himanshu;
import com.himanshu.crud.services.Studentservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcontroller {

    Studentservice serv;

    public  Studentcontroller(Studentservice serv) {
        this.serv = serv;

    }

    @PostMapping("/data")
    public String create(@RequestBody Himanshu stud) {
        System.out.println("===== Debug Output =====");
        System.out.println("Name: " + stud.getName());
        System.out.println("Course: " + stud.getCourse());
        System.out.println("Department: " + stud.getDepartment());
        System.out.println("========================");
        serv.create(stud);
        return "Data Created Succesfully";
    }

}

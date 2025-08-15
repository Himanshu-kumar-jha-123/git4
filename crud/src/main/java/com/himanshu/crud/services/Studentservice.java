package com.himanshu.crud.services;

import com.himanshu.crud.entities.Himanshu;
import com.himanshu.crud.repositories.Studentrepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Studentservice {

    Studentrepository repo;

    public Studentservice(Studentrepository repo) {
        this.repo = repo;
    }

    public void  create(Himanshu stud) {
        repo.save(stud);
    }

    public List<Himanshu> show() {
       return  repo.findAll();
    }

}

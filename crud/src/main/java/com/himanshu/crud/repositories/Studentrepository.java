package com.himanshu.crud.repositories;

import com.himanshu.crud.entities.Himanshu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Himanshu,Integer> {
}

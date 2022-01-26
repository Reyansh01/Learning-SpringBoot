package com.SpringBoot.UsingMySql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.UsingMySql.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}

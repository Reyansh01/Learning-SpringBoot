package com.ManyToMany.Relationship.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ManyToMany.Relationship.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}

package com.ManyToMany.Relationship.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.ManyToMany.Relationship.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}

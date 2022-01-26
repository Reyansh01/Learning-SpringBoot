package com.SpringBoot.UsingMySql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot.UsingMySql.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}

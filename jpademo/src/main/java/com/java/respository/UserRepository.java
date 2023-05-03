package com.java.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}

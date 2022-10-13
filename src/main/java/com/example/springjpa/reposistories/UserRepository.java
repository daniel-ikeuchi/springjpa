package com.example.springjpa.reposistories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

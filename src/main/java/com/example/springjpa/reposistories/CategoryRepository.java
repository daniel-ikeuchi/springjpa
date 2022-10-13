package com.example.springjpa.reposistories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpa.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

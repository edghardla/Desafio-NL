package com.edghard.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edghard.demo.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}

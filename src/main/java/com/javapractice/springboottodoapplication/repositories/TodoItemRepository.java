package com.javapractice.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;
import com.javapractice.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {   
}

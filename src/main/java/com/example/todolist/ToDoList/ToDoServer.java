package com.example.todolist.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ToDoServer {
    @Autowired
    private ToDoRepo toDoRepo;
}

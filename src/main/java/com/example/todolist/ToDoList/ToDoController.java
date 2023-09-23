package com.example.todolist.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ToDoController {
    @Autowired
    private ToDoServer toDoServer;
}

package salling.todolist.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import salling.todolist.todolist.task.Task;
import salling.todolist.todolist.task.TaskController;
import salling.todolist.todolist.task.TaskService;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest
class TodolistApplicationTests {
        @Autowired
    private TaskController taskController;
    @Autowired
    private TaskService taskService;
    @Test
    void contextLoads() throws Exception {
        assertThat(taskController).isNotNull();
    }
}

package salling.todolist.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "salling/todo-list")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/")
    public List<Task> getAllTasks(){
        return this.taskService.getAllTask();
    }


}

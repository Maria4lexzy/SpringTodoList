package salling.todolist.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/todo")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("")
    public ResponseEntity<String> ServerStatus(){
        return ResponseEntity.ok("OK");
    }
    @GetMapping("/all")
    public List<Task> getAllTasks(){
        return this.taskService.getAllTask();
    }

//add validation to check if Task is null
@PostMapping("/add")
public ResponseEntity<?> createTask(@RequestBody Task task) {
    try {
        Task savedTask = taskService.save(task);
        return ResponseEntity.ok(savedTask);
    } catch (IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}

    @GetMapping("/get/{id}")
    public Optional<Task> getTaskById(@PathVariable Long id){
        return taskService.findTaskById(id);
    }

    @PutMapping("/update/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
     return taskService.updateTask(task);

    }
    @DeleteMapping("/delete/{id}")
    public Task deleteTask(@PathVariable Long id) {
        return taskService.deleteTask(id);

    }

}

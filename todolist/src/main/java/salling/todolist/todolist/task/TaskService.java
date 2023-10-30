package salling.todolist.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
    this.taskRepository=taskRepository;}

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }



}

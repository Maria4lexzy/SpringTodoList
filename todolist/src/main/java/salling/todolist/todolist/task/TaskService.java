package salling.todolist.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository){
    this.taskRepository=taskRepository;}

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }


    public Task save(Task task) {

        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null.");
        }
        if (task.getDescription() == null || task.getDescription().isEmpty()) {
            throw new IllegalArgumentException("Task text cannot be empty.");
        }

        return taskRepository.save(task);

    }



    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
    public Optional<Task> findTaskById(Long id) {
        return taskRepository.findById(id);
    }
    public Task deleteTask(Long id) {
        boolean exists= taskRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException(
                    "Task items with id "+id+" does not exists"
            );
        }
        taskRepository.deleteById(id);

        return null;
    }



//public Optional<Task> taskByStatus(Task.Status status){
//        return taskRepository.findTaskByStatus(status);
//}
}

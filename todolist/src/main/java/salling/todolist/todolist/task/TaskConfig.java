package salling.todolist.todolist.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TaskConfig {
    @Bean
    CommandLineRunner commandLineRunner(TaskRepository repository){
        return args->{
            Task task1=new Task("make todo app", Task.Status.TODO);
            Task task2=new Task("have dinner", Task.Status.DONE);
            repository.saveAll(List.of(task1,task2));
        };

    }
}

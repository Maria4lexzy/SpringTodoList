package salling.todolist.todolist.task;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class TaskServiceTest {

    @InjectMocks
    TaskService service;

    @Mock
    TaskRepository taskRepository;
//Test TaskService getAllTask and save
    @Test
    void testFindAllTasks() {
        List<Task> list = new ArrayList<Task>();
       Task task1=new Task("sleep", Task.Status.TODO);
       Task task2=new Task("eat", Task.Status.TODO);


       list.add(task1);
       list.add(task2);

        when(taskRepository.findAll()).thenReturn(list);

        //test
        List<Task> empList = service.getAllTask();
//        should fail if uncommented
//        empList = service.getAllTask();
        assertEquals(2, empList.size());
        verify(taskRepository, times(1)).findAll();
    }

    @Test
    void testCreateOrSaveTask() {
        Task task1=new Task("sleep", Task.Status.TODO);

        service.save(task1);

        verify(taskRepository, times(1)).save(task1);
    }
}